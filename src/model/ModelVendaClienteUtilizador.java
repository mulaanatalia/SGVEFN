
package model;

import java.util.ArrayList;

/**
 *
 * @author Anatalia Neves Mula
 */
public class ModelVendaClienteUtilizador {
    private ModelVenda modelVenda; //Tem todos atributos da classe venda
    private ModelCliente modelCliente;//Tem todos atributos de cliente
    private ModelUtilizador modelUtilizador;
    private ArrayList<ModelVendaClienteUtilizador> listaModelVendaCliente;

    /**
     * @return the modelVenda
     */
    public ModelVenda getModelVenda() {
        return modelVenda;
    }

    /**
     * @param modelVenda the modelVenda to set
     */
    public void setModelVenda(ModelVenda modelVenda) {
        this.modelVenda = modelVenda;
    }

    /**
     * @return the modelCliente
     */
    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    /**
     * @param modelCliente the modelCliente to set
     */
    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    /**
     * @return the modelUtilizador
     */
    public ModelUtilizador getModelUtilizador() {
        return modelUtilizador;
    }

    /**
     * @param modelUtilizador the modelUtilizador to set
     */
    public void setModelUtilizador(ModelUtilizador modelUtilizador) {
        this.modelUtilizador = modelUtilizador;
    }

    /**
     * @return the listaModelVendaCliente
     */
    public ArrayList<ModelVendaClienteUtilizador> getListaModelVendaCliente() {
        return listaModelVendaCliente;
    }

    /**
     * @param listaModelVendaCliente the listaModelVendaCliente to set
     */
    public void setListaModelVendaCliente(ArrayList<ModelVendaClienteUtilizador> listaModelVendaCliente) {
        this.listaModelVendaCliente = listaModelVendaCliente;
    }
}
