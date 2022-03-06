package DAO;

import model.ModelFornecedor;
import conexao.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Anatalia Mula
*/
public class DAOFornecedor extends ConexaoMySql {

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * @return int
    */
    public int salvarFornecedorDAO(ModelFornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO fornecedor ("
                    + "nome,"
                    + "nuit,"
                    + "telefone1,"
                    + "telefone2,"
                    + "email,"
                    + "localizacao,"
                    + "data_registo"
                + ") VALUES ("
                    + "'" + pModelFornecedor.getNome() + "',"
                    + "'" + pModelFornecedor.getNuit() + "',"
                    + "'" + pModelFornecedor.getTelefone1() + "',"
                    + "'" + pModelFornecedor.getTelefone2() + "',"
                    + "'" + pModelFornecedor.getEmail() + "',"
                    + "'" + pModelFornecedor.getLocalizacao() + "',"
                    + "'" + pModelFornecedor.getData_registo() + "'"
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
    * recupera Fornecedor
    * @param pFornecedor_id
    * @return ModelFornecedor
    */
    public ModelFornecedor getFornecedorDAO(int pFornecedor_id){
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "fornecedor_id,"
                    + "nome,"
                    + "nuit,"
                    + "telefone1,"
                    + "telefone2,"
                    + "email,"
                    + "localizacao,"
                    + "data_registo"
                 + " FROM"
                     + " fornecedor"
                 + " WHERE"
                     + " fornecedor_id = '" + pFornecedor_id + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor.setFornecedor_id(this.getResultSet().getInt(1));
                modelFornecedor.setNome(this.getResultSet().getString(2));
                modelFornecedor.setNuit(this.getResultSet().getInt(3));
                modelFornecedor.setTelefone1(this.getResultSet().getString(4));
                modelFornecedor.setTelefone2(this.getResultSet().getString(5));
                modelFornecedor.setEmail(this.getResultSet().getString(6));
                modelFornecedor.setLocalizacao(this.getResultSet().getString(7));
                modelFornecedor.setData_registo(this.getResultSet().getDate(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFornecedor;
    }

    /**
    * recupera uma lista de Fornecedor
        * @return ArrayList
    */
    public ArrayList<ModelFornecedor> getListaFornecedorDAO(){
        ArrayList<ModelFornecedor> listamodelFornecedor = new ArrayList();
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "fornecedor_id,"
                    + "nome,"
                    + "nuit,"
                    + "telefone1,"
                    + "telefone2,"
                    + "email,"
                    + "localizacao,"
                    + "data_registo"
                 + " FROM"
                     + " fornecedor"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor = new ModelFornecedor();
                modelFornecedor.setFornecedor_id(this.getResultSet().getInt(1));
                modelFornecedor.setNome(this.getResultSet().getString(2));
                modelFornecedor.setNuit(this.getResultSet().getInt(3));
                modelFornecedor.setTelefone1(this.getResultSet().getString(4));
                modelFornecedor.setTelefone2(this.getResultSet().getString(5));
                modelFornecedor.setEmail(this.getResultSet().getString(6));
                modelFornecedor.setLocalizacao(this.getResultSet().getString(7));
                modelFornecedor.setData_registo(this.getResultSet().getDate(8));
                listamodelFornecedor.add(modelFornecedor);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFornecedor;
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * @return boolean
    */
    public boolean atualizarFornecedorDAO(ModelFornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE fornecedor SET "
                    + "fornecedor_id = '" + pModelFornecedor.getFornecedor_id() + "',"
                    + "nome = '" + pModelFornecedor.getNome() + "',"
                    + "nuit = '" + pModelFornecedor.getNuit() + "',"
                    + "telefone1 = '" + pModelFornecedor.getTelefone1() + "',"
                    + "telefone2 = '" + pModelFornecedor.getTelefone2() + "',"
                    + "email = '" + pModelFornecedor.getEmail() + "',"
                    + "localizacao = '" + pModelFornecedor.getLocalizacao() + "',"
                    + "data_registo = '" + pModelFornecedor.getData_registo() + "'"
                + " WHERE "
                    + "fornecedor_id = '" + pModelFornecedor.getFornecedor_id() + "'"
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
    * exclui Fornecedor
    * @param pFornecedor_id
    * @return boolean
    */
    public boolean excluirFornecedorDAO(int pFornecedor_id){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM fornecedor "
                + " WHERE "
                    + "fornecedor_id = '" + pFornecedor_id + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    public ModelFornecedor getFornecedorNomeDAO(String pNomeFornecedor) {
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "fornecedor_id,"
                    + "nome,"
                    + "nuit,"
                    + "telefone1,"
                    + "telefone2,"
                    + "email,"
                    + "localizacao,"
                    + "data_registo"
                 + " FROM"
                     + " fornecedor"
                 + " WHERE"
                     + " fornecedor_id = '" + pNomeFornecedor + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor.setFornecedor_id(this.getResultSet().getInt(1));
                modelFornecedor.setNome(this.getResultSet().getString(2));
                modelFornecedor.setNuit(this.getResultSet().getInt(3));
                modelFornecedor.setTelefone1(this.getResultSet().getString(4));
                modelFornecedor.setTelefone2(this.getResultSet().getString(5));
                modelFornecedor.setEmail(this.getResultSet().getString(6));
                modelFornecedor.setLocalizacao(this.getResultSet().getString(7));
                modelFornecedor.setData_registo(this.getResultSet().getDate(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFornecedor;
    }
    
}