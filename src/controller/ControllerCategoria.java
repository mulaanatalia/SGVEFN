package controller;

import model.ModelCategoria;
import DAO.DAOCategoria;
import java.util.ArrayList;

/**
*
* @author Anatalia Mula
*/
public class ControllerCategoria {

    private DAOCategoria daoCategoria = new DAOCategoria();

    /**
    * grava Categoria
    * @param pModelCategoria
    * @return int
    */
    public int salvarCategoriaController(ModelCategoria pModelCategoria){
        return this.daoCategoria.salvarCategoriaDAO(pModelCategoria);
    }

    /**
    * recupera Categoria
    * @param pCategoria_id
    * @return ModelCategoria
    */
    public ModelCategoria getCategoriaController(int pCategoria_id){
        return this.daoCategoria.getCategoriaDAO(pCategoria_id);
    }

    /**
    * recupera uma lista deCategoria
    * @param pCategoria_id
    * @return ArrayList
    */
    public ArrayList<ModelCategoria> getListaCategoriaController(){
        return this.daoCategoria.getListaCategoriaDAO();
    }

    /**
    * atualiza Categoria
    * @param pModelCategoria
    * @return boolean
    */
    public boolean atualizarCategoriaController(ModelCategoria pModelCategoria){
        return this.daoCategoria.atualizarCategoriaDAO(pModelCategoria);
    }

    /**
    * exclui Categoria
    * @param pCategoria_id
    * @return boolean
    */
    public boolean excluirCategoriaController(int pCategoria_id){
        return this.daoCategoria.excluirCategoriaDAO(pCategoria_id);
    }

    public ModelCategoria getCategoriaNomeController(String pNomeCategoria) {
        return this.daoCategoria.getCategoriaNomeDAO(pNomeCategoria);
    }
}