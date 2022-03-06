package controller;

import model.ModelCompra;
import DAO.DAOCompra;
import java.util.ArrayList;

/**
*
* @author Anatalia Mula
*/
public class ControllerCompra {

    private DAOCompra daoCompra = new DAOCompra();

    /**
    * grava Fornecimento
    * @param pModelFornecimento
    * @return int
    */
    public int salvarCompraController(ModelCompra pModelCompra){
        return this.daoCompra.salvarCompraDAO(pModelCompra);
    }

    /**
    * recupera Fornecimento
    * @param pFornecimento_id
    * @return ModelFornecimento
    */
    public ModelCompra getCompraController(int pCompra_id){
        return this.daoCompra.getCompraDAO(pCompra_id);
    }

    /**
    * recupera uma lista deFornecimento
    * @param pFornecimento_id
    * @return ArrayList
    */
    public ArrayList<ModelCompra> getListaCompraController(){
        return this.daoCompra.getListaCompraDAO();
    }

    /**
    * atualiza Fornecimento
    * @param pModelFornecimento
    * @return boolean
    */
    public boolean atualizarCompraController(ModelCompra pModelCompra){
        return this.daoCompra.atualizarCompraDAO(pModelCompra);
    }

    /**
    * exclui Fornecimento
    * @param pFornecimento_id
    * @return boolean
    */
    public boolean excluirCompraController(int pCompra_id){
        return this.daoCompra.excluirCompraDAO(pCompra_id);
    }
}