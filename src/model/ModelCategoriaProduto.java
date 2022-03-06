
package model;

import java.util.ArrayList;


public class ModelCategoriaProduto {
    
    private ModelCategoria modelCategoria;//Tem todos atributos de categoria
    private ModelProduto modelProduto; //Tem todos atributos da classe produto
    private ArrayList<ModelCategoriaProduto> listaModelCategoriaProduto;

    /**
     * @return the modelCategoria
     */
    public ModelCategoria getModelCategoria() {
        return modelCategoria;
    }

    /**
     * @param modelCategoria the modelCategoria to set
     */
    public void setModelCategoria(ModelCategoria modelCategoria) {
        this.modelCategoria = modelCategoria;
    }

    /**
     * @return the modelProduto
     */
    public ModelProduto getModelProduto() {
        return modelProduto;
    }

    /**
     * @param modelProduto the modelProduto to set
     */
    public void setModelProduto(ModelProduto modelProduto) {
        this.modelProduto = modelProduto;
    }

    /**
     * @return the listaModelCategoriaProduto
     */
    public ArrayList<ModelCategoriaProduto> getListaModelCategoriaProduto() {
        return listaModelCategoriaProduto;
    }

    /**
     * @param listaModelCategoriaProduto the listaModelCategoriaProduto to set
     */
    public void setListaModelCategoriaProduto(ArrayList<ModelCategoriaProduto> listaModelCategoriaProduto) {
        this.listaModelCategoriaProduto = listaModelCategoriaProduto;
    }
    
}
