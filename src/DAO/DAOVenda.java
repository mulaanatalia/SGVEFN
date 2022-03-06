package DAO;

import model.ModelVenda;
import conexao.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Anatalia Mula
*/
public class DAOVenda extends ConexaoMySql {

    /**
    * grava Venda
    * @param pModelVenda
    * @return int
    */
    public int salvarVendaDAO(ModelVenda pModelVenda){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO venda ("
                    + "venda_id,"
                    + "id_cliente,"
                    + "valor_venda,"
                    + "data_venda,"
                    + "id_utilizador"
                + ") VALUES ("
                    + "'" + pModelVenda.getVenda_id() + "',"
                    + "'" + pModelVenda.getId_cliente() + "',"
                    + "'" + pModelVenda.getValor_venda() + "',"
                    + "'" + pModelVenda.getData_venda() + "',"
                    + "'" + pModelVenda.getId_utilizador() + "'"
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
    * recupera Venda
    * @param pVenda_id
    * @return ModelVenda
    */
    public ModelVenda getVendaDAO(int pVenda_id){
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "venda_id,"
                    + "id_cliente,"
                    + "valor_venda,"
                    + "data_venda,"
                    + "id_utilizador"
                 + " FROM"
                     + " venda"
                 + " WHERE"
                     + " venda_id = '" + pVenda_id + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVenda.setVenda_id(this.getResultSet().getInt(1));
                modelVenda.setId_cliente(this.getResultSet().getInt(2));
                modelVenda.setValor_venda(this.getResultSet().getDouble(3));
                modelVenda.setData_venda(this.getResultSet().getDate(4));
                modelVenda.setId_utilizador(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVenda;
    }

    /**
    * recupera uma lista de Venda
        * @return ArrayList
    */
    public ArrayList<ModelVenda> getListaVendaDAO(){
        ArrayList<ModelVenda> listamodelVenda = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_venda_id,"
                    + "fk_id_cliente,"
                    + "valor_venda,"
                    + "data_venda,"
                    + "fk_id_utilizador"
                 + " FROM"
                     + " venda"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVenda = new ModelVenda();
                modelVenda.setVenda_id(this.getResultSet().getInt(1));
                modelVenda.setId_cliente(this.getResultSet().getInt(2));
                modelVenda.setValor_venda(this.getResultSet().getDouble(3));
                modelVenda.setData_venda(this.getResultSet().getDate(4));
                modelVenda.setId_utilizador(this.getResultSet().getInt(5));
                listamodelVenda.add(modelVenda);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVenda;
    }

    /**
    * atualiza Venda
    * @param pModelVenda
    * @return boolean
    */
    public boolean atualizarVendaDAO(ModelVenda pModelVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE venda SET "
                    + "venda_id = '" + pModelVenda.getVenda_id() + "',"
                    + "id_cliente = '" + pModelVenda.getId_cliente() + "',"
                    + "valor_venda = '" + pModelVenda.getValor_venda() + "',"
                    + "data_venda = '" + pModelVenda.getData_venda() + "',"
                    + "id_utilizador = '" + pModelVenda.getId_utilizador() + "'"
                + " WHERE "
                    + "venda_id = '" + pModelVenda.getVenda_id() + "'"
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
    * exclui Venda
    * @param pVenda_id
    * @return boolean
    */
    public boolean excluirVendaDAO(int pVenda_id){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM venda "
                + " WHERE "
                    + "venda_id = '" + pVenda_id + "'"
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