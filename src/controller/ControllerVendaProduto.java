package controller;

import model.ModelVendaProduto;
import DAO.DAOVendaProduto;
import java.util.ArrayList;

/**
*
* @author Anatalia Mula
*/
public class ControllerVendaProduto {

    private DAOVendaProduto daoVendaProduto = new DAOVendaProduto();

    /**
    * grava VendaProduto
    * @param pModelVendaProduto
    * @return int
    */
    public int salvarVendaProdutoController(ModelVendaProduto pModelVendaProduto){
        return this.daoVendaProduto.salvarVendaProdutoDAO(pModelVendaProduto);
    }

    /**
    * recupera VendaProduto
    * @param pVenda_produto_id
    * @return ModelVendaProduto
    */
    public ModelVendaProduto getVendaProdutoController(int pVenda_produto_id){
        return this.daoVendaProduto.getVendaProdutoDAO(pVenda_produto_id);
    }

    /**
    * recupera uma lista deVendaProduto
    * @param pVenda_produto_id
    * @return ArrayList
    */
    public ArrayList<ModelVendaProduto> getListaVendaProdutoController(){
        return this.daoVendaProduto.getListaVendaProdutoDAO();
    }

    /**
    * atualiza VendaProduto
    * @param pModelVendaProduto
    * @return boolean
    */
    public boolean atualizarVendaProdutoController(ModelVendaProduto pModelVendaProduto){
        return this.daoVendaProduto.atualizarVendaProdutoDAO(pModelVendaProduto);
    }

    /**
    * exclui VendaProduto
    * @param pVenda_produto_id
    * @return boolean
    */
    public boolean excluirVendaProdutoController(int pVenda_produto_id){
        return this.daoVendaProduto.excluirVendaProdutoDAO(pVenda_produto_id);
    }
    
    /**
     * Salva um alista de produtos da venda
     * @param listaModelVendaProduto
     * @return 
     */
    public boolean salvarVendaProdutoController(ArrayList<ModelVendaProduto> listaModelVendaProduto) {
        return this.daoVendaProduto.salvarVendaProdutoDAO(listaModelVendaProduto);
    }
}