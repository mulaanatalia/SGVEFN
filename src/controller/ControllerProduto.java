package controller;

import model.ModelProduto;
import DAO.DAOProduto;
import java.util.ArrayList;

/**
*
* @author Anatalia Mula
*/
public class ControllerProduto {

    private DAOProduto daoProduto = new DAOProduto();

    /**
    * grava Produto
    * @param pModelProduto
    * @return int
    */
    public int salvarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.salvarProdutoDAO(pModelProduto);
    }

    /**
    * recupera Produto
    * @param pProduto_id
    * @return ModelProduto
    */
    public ModelProduto getProdutoController(int pProduto_id){
        return this.daoProduto.getProdutoDAO(pProduto_id);
    }

    /**
    * recupera uma lista deProduto
    * @param pProduto_id
    * @return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoController(){
        return this.daoProduto.getListaProdutoDAO();
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * @return boolean
    */
    public boolean atualizarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.atualizarProdutoDAO(pModelProduto);
    }

    /**
    * exclui Produto
    * @param pProduto_id
    * @return boolean
    */
    public boolean excluirProdutoController(int pProduto_id){
        return this.daoProduto.excluirProdutoDAO(pProduto_id);
    }
    
    public ModelProduto getProdutoNomeController(String p_nome_produto){
        return this.daoProduto.getProdutoNomeDAO(p_nome_produto);
    }
    
    /**
 * Alterar lista de produtos na BD
 * @param listaModelProduto
 * @return 
 */
    public boolean alterarEstoqueProdutoController(ArrayList<ModelProduto> listaModelProduto) {
        return this.daoProduto.alterarEstoqueProdutoDAO(listaModelProduto);
    }
}