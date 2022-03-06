package controller;

import model.ModelUtilizador;
import DAO.DAOUtilizador;
import java.util.ArrayList;

/**
*
* @author Anatalia Mula
*/
public class ControllerUtilizador {

    private DAOUtilizador daoUtilizador = new DAOUtilizador();

    /**
    * grava Utilizador
    * @param pModelUtilizador
    * @return int
    */
    public int salvarUtilizadorController(ModelUtilizador pModelUtilizador){
        return this.daoUtilizador.salvarUtilizadorDAO(pModelUtilizador);
    }

    /**
    * recupera Utilizador
    * @param pUtilizador_id
    * @return ModelUtilizador
    */
    public ModelUtilizador getUtilizadorController(int pUtilizador_id){
        return this.daoUtilizador.getUtilizadorDAO(pUtilizador_id);
    }

    /**
    * recupera uma lista deUtilizador
    * @param pUtilizador_id
    * @return ArrayList
    */
    public ArrayList<ModelUtilizador> getListaUtilizadorController(){
        return this.daoUtilizador.getListaUtilizadorDAO();
    }

    /**
    * atualiza Utilizador
    * @param pModelUtilizador
    * @return boolean
    */
    public boolean atualizarUtilizadorController(ModelUtilizador pModelUtilizador){
        return this.daoUtilizador.atualizarUtilizadorDAO(pModelUtilizador);
    }

    /**
    * exclui Utilizador
    * @param pUtilizador_id
    * @return boolean
    */
    public boolean excluirUtilizadorController(int pUtilizador_id){
        return this.daoUtilizador.excluirUtilizadorDAO(pUtilizador_id);
    }
    
    public ModelUtilizador getUtilizadorController(String p_login_utilizador){
        return this.daoUtilizador.getUtilizadorDAO(p_login_utilizador);
    }

    public boolean validarUtilizadorController(ModelUtilizador modelUtilizador) {
        return this.daoUtilizador.validarUtilizadorDAO(modelUtilizador);
    }
}