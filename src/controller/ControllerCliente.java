package controller;

import model.ModelCliente;
import DAO.DAOCliente;
import java.util.ArrayList;

/**
*
* @author Anatalia Mula
*/
public class ControllerCliente {

    private DAOCliente daoCliente = new DAOCliente();

    /**
    * grava Cliente
    * @param pModelCliente
    * @return int
    */
    public int salvarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }

    /**
    * recupera Cliente
    * @param pCliente_id
    * @return ModelCliente
    */
    public ModelCliente getClienteController(int pCliente_id){
        return this.daoCliente.getClienteDAO(pCliente_id);
    }

    /**
    * recupera uma lista deCliente
    * @param pCliente_id
    * @return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteController(){
        return this.daoCliente.getListaClienteDAO();
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * @return boolean
    */
    public boolean atualizarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }

    /**
    * exclui Cliente
    * @param pCliente_id
    * @return boolean
    */
    public boolean excluirClienteController(int pCliente_id){
        return this.daoCliente.excluirClienteDAO(pCliente_id);
    }
    
    public ModelCliente getClienteNomeController(String p_nome_cliente){
        return this.daoCliente.getClienteNomeDAO(p_nome_cliente);
    }
}