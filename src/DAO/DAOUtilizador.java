package DAO;

import model.ModelUtilizador;
import conexao.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Anatalia Mula
*/
public class DAOUtilizador extends ConexaoMySql {

    /**
    * grava Utilizador
    * @param pModelUtilizador
    * @return int
    */
    public int salvarUtilizadorDAO(ModelUtilizador pModelUtilizador){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO utilizador ("
                   // + "utilizador_id,"
                    + "nome,"
                    + "login,"
                    + "senha,"
                    + "perfil,"
                    + "data_registo"
                + ") VALUES ("
                   // + "'" + pModelUtilizador.getUtilizador_id() + "',"
                    + "'" + pModelUtilizador.getNome() + "',"
                    + "'" + pModelUtilizador.getLogin() + "',"
                    + "'" + pModelUtilizador.getSenha() + "',"
                    + "'" + pModelUtilizador.getPerfil() + "',"
                    + "'" + pModelUtilizador.getData_registo() + "'"
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
    * recupera Utilizador
    * @param pUtilizador_id
    * @return ModelUtilizador
    */
    public ModelUtilizador getUtilizadorDAO(int pUtilizador_id){
        ModelUtilizador modelUtilizador = new ModelUtilizador();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "utilizador_id,"
                    + "nome,"
                    + "login,"
                    + "senha,"
                    + "perfil,"
                    + "data_registo"
                 + " FROM"
                     + " utilizador"
                 + " WHERE "
                     + " utilizador_id = '" + pUtilizador_id + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUtilizador.setUtilizador_id(this.getResultSet().getInt(1));
                modelUtilizador.setNome(this.getResultSet().getString(2));
                modelUtilizador.setLogin(this.getResultSet().getString(3));
                modelUtilizador.setSenha(this.getResultSet().getString (4));
                modelUtilizador.setPerfil(this.getResultSet().getString(5));
                modelUtilizador.setData_registo(this.getResultSet().getDate(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUtilizador;
    }

    /**
     * usado para a sessao de utilizador, para levar o nome do utilizador logado
     * @param pLogin
     * @return 
     */
    public ModelUtilizador getUtilizadorDAO(String pLogin) {
        ModelUtilizador modelUtilizador = new ModelUtilizador();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "utilizador_id,"
                    + "nome,"
                    + "login,"
                    + "senha,"
                    + "perfil"
                    + " FROM"
                    + " utilizador"
                    + " WHERE "
                    + " login = '" + pLogin + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUtilizador.setUtilizador_id(this.getResultSet().getInt(1));
                modelUtilizador.setNome(this.getResultSet().getString(2));
                modelUtilizador.setLogin(this.getResultSet().getString(3));
                modelUtilizador.setSenha(this.getResultSet().getString(4));
                modelUtilizador.setPerfil(this.getResultSet().getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUtilizador;
    }
    
    /**
    * recupera uma lista de Utilizador
        * @return ArrayList
    */
    public ArrayList<ModelUtilizador> getListaUtilizadorDAO(){
        ArrayList<ModelUtilizador> listamodelUtilizador = new ArrayList();
        ModelUtilizador modelUtilizador = new ModelUtilizador();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "utilizador_id,"
                    + "nome,"
                    + "login,"
                    + "senha,"
                    + "perfil,"
                    + "data_registo "
                 + " FROM"
                     + " utilizador"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUtilizador = new ModelUtilizador();
                modelUtilizador.setUtilizador_id(this.getResultSet().getInt(1));
                modelUtilizador.setNome(this.getResultSet().getString(2));
                modelUtilizador.setLogin(this.getResultSet().getString(3));
                modelUtilizador.setSenha(this.getResultSet().getString (4));
                modelUtilizador.setPerfil(this.getResultSet().getString(5));
                modelUtilizador.setData_registo(this.getResultSet().getDate(6));
                listamodelUtilizador.add(modelUtilizador);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelUtilizador;
    }

    /**
    * atualiza Utilizador
    * @param pModelUtilizador
    * @return boolean
    */
    public boolean atualizarUtilizadorDAO(ModelUtilizador pModelUtilizador){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE utilizador SET "
                    + "utilizador_id = '" + pModelUtilizador.getUtilizador_id() + "',"
                    + "nome = '" + pModelUtilizador.getNome() + "',"
                    + "login = '" + pModelUtilizador.getLogin() + "',"
                    + "senha = '" + pModelUtilizador.getSenha() + "',"
                    + "perfil = '" + pModelUtilizador.getPerfil() + "',"
                    + "data_registo = '" + pModelUtilizador.getData_registo() + "'"
                + " WHERE "
                    + " utilizador_id = '" + pModelUtilizador.getUtilizador_id() + "'"
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
    * exclui Utilizador
    * @param pUtilizador_id
    * @return boolean
    */
    public boolean excluirUtilizadorDAO(int pUtilizador_id){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM utilizador "
                + " WHERE "
                    + " utilizador_id = '" + pUtilizador_id + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    public ModelUtilizador getUtilizadorNomeDAO(String pNomeUtilizador) {
        ModelUtilizador modelUtilizador = new ModelUtilizador();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "utilizador_id,"
                    + "nome,"
                    + "login,"
                    + "senha,"
                    + "perfil,"
                    + "data_registo"
                 + " FROM"
                     + " utilizador"
                 + " WHERE "
                     + " nome = '" + pNomeUtilizador + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUtilizador.setUtilizador_id(this.getResultSet().getInt(1));
                modelUtilizador.setNome(this.getResultSet().getString(2));
                modelUtilizador.setLogin(this.getResultSet().getString(3));
                modelUtilizador.setSenha(this.getResultSet().getString (4));
                modelUtilizador.setPerfil(this.getResultSet().getString(5));
                modelUtilizador.setData_registo(this.getResultSet().getDate(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUtilizador;
    }
    
    /**
     * Validar login e senha do utilizador
     * @param modelUtilizador
     * @return boolean
     */
    public boolean validarUtilizadorDAO(ModelUtilizador modelUtilizador) {

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "utilizador_id,"
                    + "nome,"
                    + "login,"
                    + "senha,"
                    + "perfil"
                    + " FROM"
                    + " utilizador"
                    + " WHERE "
                    + " login = '" + modelUtilizador.getLogin() + "' AND senha = '" + modelUtilizador.getSenha() + "'"
                    + ";"
            );
            if (getResultSet().next()) {//se tiver o registo, vai entrar no resultSet
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }
}