
package controller;

import DAO.DAOCategoriaProduto;
import java.util.ArrayList;
import model.ModelCategoriaProduto;


public class ControllerCategoriaProduto {
    
    private DAOCategoriaProduto daoCategoriaProduto = new DAOCategoriaProduto();
    
    public ArrayList<ModelCategoriaProduto> getListaCategoriaProdutoController() {
        return this.daoCategoriaProduto.getListaCategoriaProdutoDAO();
    }

   public ModelCategoriaProduto getListaCategoriaProdutoController(int id_produto) {
        return this.daoCategoriaProduto.getListaCategoriaProdutoDAO(id_produto);
    }
    
}
