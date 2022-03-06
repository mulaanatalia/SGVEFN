package DAO;

import model.ModelCategoria;
import conexao.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Anatalia Mula
*/
public class DAOCategoria extends ConexaoMySql {

    /**
    * grava Categoria
    * @param pModelCategoria
    * @return int
    */
    public int salvarCategoriaDAO(ModelCategoria pModelCategoria){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO categoria ("
                    + "nome,"
                    + "descricao,"
                    + "data_registo"
                + ") VALUES ("
                    + "'" + pModelCategoria.getNome() + "',"
                    + "'" + pModelCategoria.getDescricao() + "',"
                    + "'" + pModelCategoria.getData_registo() + "'"
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
    * recupera Categoria
    * @param pCategoria_id
    * @return ModelCategoria
    */
    public ModelCategoria getCategoriaDAO(int pCategoria_id){
        ModelCategoria modelCategoria = new ModelCategoria();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "categoria_id,"
                    + "nome,"
                    + "descricao,"
                    + "data_registo"
                 + " FROM"
                     + " categoria"
                 + " WHERE"
                     + " categoria_id = '" + pCategoria_id + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCategoria.setCategoria_id(this.getResultSet().getInt(1));
                modelCategoria.setNome(this.getResultSet().getString(2));
                modelCategoria.setDescricao(this.getResultSet().getString(3));
                modelCategoria.setData_registo(this.getResultSet().getDate(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCategoria;
    }

    /**
    * recupera uma lista de Categoria
        * @return ArrayList
    */
    public ArrayList<ModelCategoria> getListaCategoriaDAO(){
        ArrayList<ModelCategoria> listamodelCategoria = new ArrayList();
        ModelCategoria modelCategoria = new ModelCategoria();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "categoria_id,"
                    + "nome,"
                    + "descricao,"
                    + "data_registo"
                 + " FROM"
                     + " categoria"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCategoria = new ModelCategoria();
                modelCategoria.setCategoria_id(this.getResultSet().getInt(1));
                modelCategoria.setNome(this.getResultSet().getString(2));
                modelCategoria.setDescricao(this.getResultSet().getString(3));
                modelCategoria.setData_registo(this.getResultSet().getDate(4));
                listamodelCategoria.add(modelCategoria);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCategoria;
    }

    /**
    * atualiza Categoria
    * @param pModelCategoria
    * @return boolean
    */
    public boolean atualizarCategoriaDAO(ModelCategoria pModelCategoria){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE categoria SET "
                    + "nome = '" + pModelCategoria.getNome() + "',"
                    + "descricao = '" + pModelCategoria.getDescricao() + "',"
                    + "data_registo = '" + pModelCategoria.getData_registo() + "'"
                + " WHERE "
                    + "categoria_id = '" + pModelCategoria.getCategoria_id() + "'"
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
    * exclui Categoria
    * @param pCategoria_id
    * @return boolean
    */
    public boolean excluirCategoriaDAO(int pCategoria_id){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM categoria "
                + " WHERE "
                    + "categoria_id = '" + pCategoria_id + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public ModelCategoria getCategoriaNomeDAO(String pNomeCategoria) {
        ModelCategoria modelCategoria = new ModelCategoria();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "categoria_id,"
                    + "nome,"
                    + "descricao,"
                    + "data_registo"
                 + " FROM"
                     + " categoria"
                 + " WHERE"
                     + " nome = '" + pNomeCategoria + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCategoria.setCategoria_id(this.getResultSet().getInt(1));
                modelCategoria.setNome(this.getResultSet().getString(2));
                modelCategoria.setDescricao(this.getResultSet().getString(3));
                modelCategoria.setData_registo(this.getResultSet().getDate(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCategoria;
    }
}