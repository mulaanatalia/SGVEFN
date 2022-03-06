
package controller;

import DAO.DAOVendaClienteUtilizador;
import java.util.ArrayList;
import model.ModelVendaClienteUtilizador;

/**
 *
 * @author Anatalia Neves Mula
 */
public class ControllerVendaClienteUtilizador {
    
    private DAOVendaClienteUtilizador daoVendaClienteUtilizador = new DAOVendaClienteUtilizador();
    public ArrayList<ModelVendaClienteUtilizador> getListaVendaClienteUtilizadorController() {
        return this.daoVendaClienteUtilizador.getListaVendaClienteUtilizadorDAO();
    }
}
