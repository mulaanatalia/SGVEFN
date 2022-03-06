package DAO;

import model.ModelProduto;
import conexao.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Anatalia Mula
*/
public class DAOProduto extends ConexaoMySql {

    /**
    * grava Produto
    * @param pModelProduto
    * @return int
    */
    public int salvarProdutoDAO(ModelProduto pModelProduto){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO produto ("    
                    + "nome,"
                    + "preco_unitario,"
                    + "estoque,"
                    + "data_registo,"
                    + "id_categoria "
                + ") VALUES ("
                    + "'" + pModelProduto.getNome() + "',"
                    + "'" + pModelProduto.getPreco_unitario() + "',"
                    + "'" + pModelProduto.getEstoque() + "',"
                    + "'" + pModelProduto.getData_registo() + "',"
                    + "'" + pModelProduto.getId_categoria() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Produto
    * @param pProduto_id
    * @return ModelProduto
    */
    public ModelProduto getProdutoDAO(int pProduto_id){
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "produto_id,"
                    + "nome,"
                    + "preco_unitario,"
                    + "estoque,"
                    + "data_registo,"
                    + "id_categoria"
                 + " FROM"
                     + " produto "
                 + " WHERE "
                     + " produto_id = '" + pProduto_id + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto.setProduto_id(this.getResultSet().getInt(1));
                modelProduto.setNome(this.getResultSet().getString(2));
                modelProduto.setPreco_unitario(this.getResultSet().getDouble(3));
                modelProduto.setEstoque(this.getResultSet().getInt(4));
                modelProduto.setData_registo(this.getResultSet().getDate(5));
                modelProduto.setId_categoria(this.getResultSet().getInt(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProduto;
    }

    /**
    * recupera uma lista de Produto
        * @return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoDAO(){
        ArrayList<ModelProduto> listamodelProduto = new ArrayList();
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "produto_id,"
                    + "nome,"
                    + "preco_unitario,"
                    + "estoque,"
                    + "data_registo,"
                    + "id_categoria"
                 + " FROM "
                     + " produto"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto = new ModelProduto();
                modelProduto.setProduto_id(this.getResultSet().getInt(1));
                modelProduto.setNome(this.getResultSet().getString(2));
                modelProduto.setPreco_unitario(this.getResultSet().getDouble(3));
                modelProduto.setEstoque(this.getResultSet().getInt(4));
                modelProduto.setData_registo(this.getResultSet().getDate(5));
                modelProduto.setId_categoria(this.getResultSet().getInt(6));
                listamodelProduto.add(modelProduto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelProduto;
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * @return boolean
    */
    public boolean atualizarProdutoDAO(ModelProduto pModelProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE produto SET "
                    + "produto_id = '" + pModelProduto.getProduto_id() + "',"
                    + "nome = '" + pModelProduto.getNome() + "',"
                    + "preco_unitario = '" + pModelProduto.getPreco_unitario() + "',"
                    + "estoque = '" + pModelProduto.getEstoque() + "',"
                    + "data_registo = '" + pModelProduto.getData_registo() + "',"
                    + "id_categoria = '" + pModelProduto.getId_categoria() + "'"
                + " WHERE "
                    + " produto_id = '" + pModelProduto.getProduto_id() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Produto
    * @param pProduto_id
    * @return boolean
    */
    public boolean excluirProdutoDAO(int pProduto_id){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM produto "
                + " WHERE "
                    + " produto_id = '" + pProduto_id + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    public ModelProduto getProdutoNomeDAO(String pNomeProduto) {
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "produto_id,"
                    + "nome,"
                    + "preco_unitario,"
                    + "estoque,"
                    + "data_registo,"
                    + "id_categoria"
                 + " FROM"
                     + " produto"
                 + " WHERE "
                     + " nome = '"+ pNomeProduto +"'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto.setProduto_id(this.getResultSet().getInt(1));
                modelProduto.setNome(this.getResultSet().getString(2));
                modelProduto.setPreco_unitario(this.getResultSet().getDouble(3));
                modelProduto.setEstoque(this.getResultSet().getInt(4));
                modelProduto.setData_registo(this.getResultSet().getDate(5));
                modelProduto.setId_categoria(this.getResultSet().getInt(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProduto;
    }
    
    /**
     * Alterar estoque de produtos apos venda
     * @param listaModelProduto
     * @return 
     */
    public boolean alterarEstoqueProdutoDAO(ArrayList<ModelProduto> listaModelProduto) {
        try {
            this.conectar();
            for (int i = 0; i < listaModelProduto.size(); i++) {
                this.executarUpdateDeleteSQL(
                        "update produto set "
                        + "estoque = '" + listaModelProduto.get(i).getEstoque() + "'"
                        + " where id = '" + listaModelProduto.get(i).getProduto_id() + "'"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
}