package controller;

import model.ModelVenda;
import DAO.DAOVenda;
import java.util.ArrayList;

/**
*
* @author Anatalia Mula
*/
public class ControllerVenda {

    private DAOVenda daoVenda = new DAOVenda();

    /**
    * grava Venda
    * @param pModelVenda
    * @return int
    */
    public int salvarVendaController(ModelVenda pModelVenda){
        return this.daoVenda.salvarVendaDAO(pModelVenda);
    }

    /**
    * recupera Venda
    * @param pVenda_id
    * @return ModelVenda
    */
    public ModelVenda getVendaController(int pVenda_id){
        return this.daoVenda.getVendaDAO(pVenda_id);
    }

    /**
    * recupera uma lista deVenda
    * @param pVenda_id
    * @return ArrayList
    */
    public ArrayList<ModelVenda> getListaVendaController(){
        return this.daoVenda.getListaVendaDAO();
    }

    /**
    * atualiza Venda
    * @param pModelVenda
    * @return boolean
    */
    public boolean atualizarVendaController(ModelVenda pModelVenda){
        return this.daoVenda.atualizarVendaDAO(pModelVenda);
    }

    /**
    * exclui Venda
    * @param pVenda_id
    * @return boolean
    */
    public boolean excluirVendaController(int pVenda_id){
        return this.daoVenda.excluirVendaDAO(pVenda_id);
    }
}