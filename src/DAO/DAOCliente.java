package DAO;

import model.ModelCliente;
import conexao.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Anatalia Mula
*/
public class DAOCliente extends ConexaoMySql {

    /**
    * grava Cliente
    * @param pModelCliente
    * @return int
    */
    public int salvarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO cliente ("
                    + "nome,"
                    + "endereco,"
                    + "telefone,"
                    + "email,"
                    + "data_registo "
                + ") VALUES ("
                    + "'" + pModelCliente.getNome() + "',"
                    + "'" + pModelCliente.getEndereco() + "',"
                    + "'" + pModelCliente.getTelefone() + "',"
                    + "'" + pModelCliente.getEmail() + "',"
                    + "'" + pModelCliente.getData_registo() + "'"
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
    * recupera Cliente
    * @param pCliente_id
    * @return ModelCliente
    */
    public ModelCliente getClienteDAO(int pCliente_id){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "cliente_id,"
                    + "nome,"
                    + "endereco,"
                    + "telefone,"
                    + "email,"
                    + "data_registo"
                 + " FROM"
                     + " cliente"
                 + " WHERE "
                     + " cliente_id = '" + pCliente_id + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setCliente_id(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setTelefone(this.getResultSet().getString(4));
                modelCliente.setEmail(this.getResultSet().getString(5));
               modelCliente.setData_registo(this.getResultSet().getDate(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
    * recupera uma lista de Cliente
        * @return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteDAO(){
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "cliente_id,"
                    + "nome,"
                    + "endereco,"
                    + "telefone,"
                    + "email,"
                    + "data_registo"
                 + " FROM "
                     + " cliente"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new ModelCliente();
                modelCliente.setCliente_id(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setTelefone(this.getResultSet().getString(4));
                modelCliente.setEmail(this.getResultSet().getString(5));
                modelCliente.setData_registo(this.getResultSet().getDate(6));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * @return boolean
    */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE cliente SET "
                    + "nome = '" + pModelCliente.getNome() + "',"
                    + "endereco = '" + pModelCliente.getEndereco() + "',"
                    + "telefone = '" + pModelCliente.getTelefone() + "',"
                    + "email = '" + pModelCliente.getEmail() + "'"
                + " WHERE "
                    + " cliente_id = '" + pModelCliente.getCliente_id() + "'"
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
    * exclui Cliente
    * @param pCliente_id
    * @return boolean
    */
    public boolean excluirClienteDAO(int pCliente_id){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM cliente "
                + " WHERE "
                    + " cliente_id = '" + pCliente_id + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    public ModelCliente getClienteNomeDAO(String pNomeCliente) {
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "cliente_id,"
                    + "nome,"
                    + "endereco,"
                    + "telefone,"
                    + "email,"
                    + "data_registo"
                 + " FROM"
                     + " cliente"
                 + " WHERE "
                     + " nome = '" + pNomeCliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setCliente_id(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setTelefone(this.getResultSet().getString(4));
                modelCliente.setEmail(this.getResultSet().getString(5));
               modelCliente.setData_registo(this.getResultSet().getDate(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }
}