package DAO;

import model.ModelVendaProduto;
import conexao.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Anatalia Mula
*/
public class DAOVendaProduto extends ConexaoMySql {

    /**
    * grava VendaProduto
    * @param pModelVendaProduto
    * @return int
    */
    public int salvarVendaProdutoDAO(ModelVendaProduto pModelVendaProduto){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO venda_produto ("
                    + "venda_produto_id,"
                    + "id_venda,"
                    + "id_produto,"
                    + "produto_quantidade"
                + ") VALUES ("
                    + "'" + pModelVendaProduto.getVenda_produto_id() + "',"
                    + "'" + pModelVendaProduto.getId_venda() + "',"
                    + "'" + pModelVendaProduto.getId_produto() + "',"
                    + "'" + pModelVendaProduto.getProduto_quantidade() + "'"
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
    * recupera VendaProduto
    * @param pVenda_produto_id
    * @return ModelVendaProduto
    */
    public ModelVendaProduto getVendaProdutoDAO(int pVenda_produto_id){
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "venda_produto_id,"
                    + "id_venda,"
                    + "id_produto,"
                    + "produto_quantidade"
                 + " FROM"
                     + " venda_produto"
                 + " WHERE"
                     + " venda_produto_id = '" + pVenda_produto_id + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendaProduto.setVenda_produto_id(this.getResultSet().getInt(1));
                modelVendaProduto.setId_venda(this.getResultSet().getInt(2));
                modelVendaProduto.setId_produto(this.getResultSet().getInt(3));
                modelVendaProduto.setProduto_quantidade(this.getResultSet().getInt(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendaProduto;
    }

    /**
    * recupera uma lista de VendaProduto
        * @return ArrayList
    */
    public ArrayList<ModelVendaProduto> getListaVendaProdutoDAO(){
        ArrayList<ModelVendaProduto> listamodelVendaProduto = new ArrayList();
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "venda_produto_id,"
                    + "id_venda,"
                    + "id_produto,"
                    + "produto_quantidade"
                 + " FROM"
                     + " venda_produto"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendaProduto = new ModelVendaProduto();
                modelVendaProduto.setVenda_produto_id(this.getResultSet().getInt(1));
                modelVendaProduto.setId_venda(this.getResultSet().getInt(2));
                modelVendaProduto.setId_produto(this.getResultSet().getInt(3));
                modelVendaProduto.setProduto_quantidade(this.getResultSet().getInt(4));
                listamodelVendaProduto.add(modelVendaProduto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendaProduto;
    }

    /**
    * atualiza VendaProduto
    * @param pModelVendaProduto
    * @return boolean
    */
    public boolean atualizarVendaProdutoDAO(ModelVendaProduto pModelVendaProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE venda_produto SET "
                    + "venda_produto_id = '" + pModelVendaProduto.getVenda_produto_id() + "',"
                    + "id_venda = '" + pModelVendaProduto.getId_venda() + "',"
                    + "id_produto = '" + pModelVendaProduto.getId_produto() + "',"
                    + "produto_quantidade = '" + pModelVendaProduto.getProduto_quantidade() + "'"
                + " WHERE "
                    + " venda_produto_id = '" + pModelVendaProduto.getVenda_produto_id() + "'"
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
    * exclui VendaProduto
    * @param pVenda_produto_id
    * @return boolean
    */
    public boolean excluirVendaProdutoDAO(int pVenda_produto_id){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM venda_produto "
                + " WHERE "
                    + " venda_produto_id = '" + pVenda_produto_id + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    public boolean salvarVendaProdutoDAO(ArrayList<ModelVendaProduto> listaModelVendaProduto) {
        try {
            this.conectar();
            int cont = listaModelVendaProduto.size();
            for (int i = 0; i < cont; i++) {
                this.insertSQL(
                        "INSERT INTO venda_produto ("
                        + "id_venda,"
                        + "id_produto,"
                        + "produto_quantidade"
                        + ") VALUES ("
                        + "'" + listaModelVendaProduto.get(i).getId_venda() + "',"
                        + "'" + listaModelVendaProduto.get(i).getId_produto() + "',"
                        + "'" + listaModelVendaProduto.get(i).getProduto_quantidade() + "'"
                        + ");"
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