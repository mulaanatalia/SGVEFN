package controller;

import model.ModelFornecedor;
import DAO.DAOFornecedor;
import java.util.ArrayList;

/**
*
* @author Anatalia Mula
*/
public class ControllerFornecedor {

    private DAOFornecedor daoFornecedor = new DAOFornecedor();

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * @return int
    */
    public int salvarFornecedorController(ModelFornecedor pModelFornecedor){
        return this.daoFornecedor.salvarFornecedorDAO(pModelFornecedor);
    }

    /**
    * recupera Fornecedor
    * @param pFornecedor_id
    * @return ModelFornecedor
    */
    public ModelFornecedor getFornecedorController(int pFornecedor_id){
        return this.daoFornecedor.getFornecedorDAO(pFornecedor_id);
    }

    /**
    * recupera uma lista deFornecedor
    * @param pFornecedor_id
    * @return ArrayList
    */
    public ArrayList<ModelFornecedor> getListaFornecedorController(){
        return this.daoFornecedor.getListaFornecedorDAO();
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * @return boolean
    */
    public boolean atualizarFornecedorController(ModelFornecedor pModelFornecedor){
        return this.daoFornecedor.atualizarFornecedorDAO(pModelFornecedor);
    }

    /**
    * exclui Fornecedor
    * @param pFornecedor_id
    * @return boolean
    */
    public boolean excluirFornecedorController(int pFornecedor_id){
        return this.daoFornecedor.excluirFornecedorDAO(pFornecedor_id);
    }
    
    public ModelFornecedor getFornecedorNomeController(String p_nome_fornecedor){
        return this.daoFornecedor.getFornecedorNomeDAO(p_nome_fornecedor);
    }
}