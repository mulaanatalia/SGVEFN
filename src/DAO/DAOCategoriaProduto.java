package DAO;

import conexao.ConexaoMySql;
import java.util.ArrayList;
import model.ModelCategoria;
import model.ModelCategoriaProduto;
import model.ModelProduto;

/**
 *
 * @author Anatalia Neves Mula
 */
public class DAOCategoriaProduto extends ConexaoMySql {

    public ArrayList<ModelCategoriaProduto> getListaCategoriaProdutoDAO() {
        ArrayList<ModelCategoriaProduto> listaModelCategoriaProduto = new ArrayList();
        ModelCategoria modelCategoria = new ModelCategoria();
        ModelProduto modelProduto = new ModelProduto();
        ModelCategoriaProduto modelCategoriaProduto = new ModelCategoriaProduto();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT categoria.categoria_id, categoria.nome, categoria.descricao, categoria.data_registo, "
                    + "produto.produto_id, produto.nome, produto.preco_unitario, produto.estoque, produto.data_registo, "
                    + "produto.id_categoria "
                    + "FROM categoria INNER JOIN produto ON categoria.categoria_id = produto.id_categoria;"
            );

            while (this.getResultSet().next()) {
                modelCategoria = new ModelCategoria();//INstanciamos novamente porque vai receber dados varias vezes
                modelProduto = new ModelProduto();
                modelCategoriaProduto = new ModelCategoriaProduto();

                modelCategoria.setCategoria_id(this.getResultSet().getInt(1));
                modelCategoria.setNome(this.getResultSet().getString(2));
                modelCategoria.setDescricao(this.getResultSet().getString(3));
                modelCategoria.setData_registo(this.getResultSet().getDate(4));

                //Produto
                modelProduto.setProduto_id(this.getResultSet().getInt(5));
                modelProduto.setNome(this.getResultSet().getString(6));
                modelProduto.setPreco_unitario(this.getResultSet().getDouble(7));
                modelProduto.setEstoque(this.getResultSet().getInt(8));
                modelProduto.setData_registo(this.getResultSet().getDate(9));
                modelProduto.setId_categoria(this.getResultSet().getInt(10));

                //Categoria produto
                modelCategoriaProduto.setModelCategoria(modelCategoria);
                modelCategoriaProduto.setModelProduto(modelProduto);

                //Preenchendo a lista de vendaCliente
                listaModelCategoriaProduto.add(modelCategoriaProduto);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelCategoriaProduto;
    }

    public ModelCategoriaProduto getListaCategoriaProdutoDAO(int id_produto) {
        ModelCategoria modelCategoria = new ModelCategoria();
        ModelProduto modelProduto = new ModelProduto();
        ModelCategoriaProduto modelCategoriaProduto = new ModelCategoriaProduto();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT categoria.categoria_id, categoria.nome, categoria.descricao, categoria.data_registo, "
                    + "produto.produto_id, produto.nome, produto.preco_unitario, produto.estoque, produto.data_registo, "
                    + "produto.id_categoria "
                    + "FROM categoria INNER JOIN produto ON categoria.categoria_id = produto.id_categoria where"
                    + " produto.produto_id = '" + id_produto + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCategoria = new ModelCategoria();//INstanciamos novamente porque vai receber dados varias vezes
                modelProduto = new ModelProduto();
                modelCategoriaProduto = new ModelCategoriaProduto();

                modelCategoria.setCategoria_id(this.getResultSet().getInt(1));
                modelCategoria.setNome(this.getResultSet().getString(2));
                modelCategoria.setDescricao(this.getResultSet().getString(3));
                modelCategoria.setData_registo(this.getResultSet().getDate(4));

                //Produto
                modelProduto.setProduto_id(this.getResultSet().getInt(5));
                modelProduto.setNome(this.getResultSet().getString(6));
                modelProduto.setPreco_unitario(this.getResultSet().getDouble(7));
                modelProduto.setEstoque(this.getResultSet().getInt(8));
                modelProduto.setData_registo(this.getResultSet().getDate(9));
                modelProduto.setId_categoria(this.getResultSet().getInt(10));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCategoriaProduto;
    }

}
