package DAO;

import model.ModelCompra;
import conexao.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Anatalia Mula
*/
public class DAOCompra extends ConexaoMySql {

    /**
    * grava Fornecimento
    * @param pModelFornecimento
    * @return int
    */
    public int salvarCompraDAO(ModelCompra pModelCompra){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO compra ("
                    + "compra_id,"
                    + "id_produto,"
                    + "id_fornecedor,"
                    + "preco_unitario_produto,"
                    + "data_compra"
                + ") VALUES ("
                    + "'" + pModelCompra.getCompra_id() + "',"
                    + "'" + pModelCompra.getId_produto() + "',"
                    + "'" + pModelCompra.getId_fornecedor() + "',"
                    + "'" + pModelCompra.getPreco_unitario_produto() + "',"
                    + "'" + pModelCompra.getData_compra() + "'"
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
    * recupera Fornecimento
    * @param pFornecimento_id
    * @return ModelFornecimento
    */
    public ModelCompra getCompraDAO(int pCompra_id){
        ModelCompra modelCompra = new ModelCompra();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "compra_id,"
                    + "id_produto,"
                    + "id_fornecedor,"
                    + "preco_unitario_produto,"
                    + "data_compra"
                 + " FROM"
                     + " compra"
                 + " WHERE"
                     + " compra_id = '" + pCompra_id + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCompra.setCompra_id(this.getResultSet().getInt(1));
                modelCompra.setId_produto(this.getResultSet().getInt(2));
                modelCompra.setId_fornecedor(this.getResultSet().getInt(3));
                modelCompra.setPreco_unitario_produto(this.getResultSet().getDouble(4));
                modelCompra.setData_compra(this.getResultSet().getDate(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCompra;
    }

    /**
    * recupera uma lista de Fornecimento
        * @return ArrayList
    */
    public ArrayList<ModelCompra> getListaCompraDAO(){
        ArrayList<ModelCompra> listamodelCompra = new ArrayList();
        ModelCompra modelCompra = new ModelCompra();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "compra_id,"
                    + "id_produto,"
                    + "id_fornecedor,"
                    + "preco_unitario_produto,"
                    + "data_compra"
                 + " FROM"
                     + " compra"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCompra = new ModelCompra();
                modelCompra.setCompra_id(this.getResultSet().getInt(1));
                modelCompra.setId_produto(this.getResultSet().getInt(2));
                modelCompra.setId_fornecedor(this.getResultSet().getInt(3));
                modelCompra.setPreco_unitario_produto(this.getResultSet().getDouble(4));
                modelCompra.setData_compra(this.getResultSet().getDate(5));
                listamodelCompra.add(modelCompra);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCompra;
    }

    /**
    * atualiza Fornecimento
    * @param pModelFornecimento
    * @return boolean
    */
    public boolean atualizarCompraDAO(ModelCompra pModelCompra){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE compra SET "
                    + "compra_id = '" + pModelCompra.getCompra_id() + "',"
                    + "id_produto = '" + pModelCompra.getId_produto() + "',"
                    + "id_fornecedor = '" + pModelCompra.getId_fornecedor() + "',"
                    + "preco_unitario_produto = '" + pModelCompra.getPreco_unitario_produto() + "',"
                    + "data_compra = '" + pModelCompra.getData_compra() + "'"
                + " WHERE "
                    + "compra_id = '" + pModelCompra.getCompra_id() + "'"
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
    * exclui Fornecimento
    * @param pFornecimento_id
    * @return boolean
    */
    public boolean excluirCompraDAO(int pCompra_id){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM compra "
                + " WHERE "
                    + "compra_id = '" + pCompra_id + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}