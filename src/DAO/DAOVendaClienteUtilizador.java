
package DAO;

import conexao.ConexaoMySql;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelUtilizador;
import model.ModelVenda;
import model.ModelVendaClienteUtilizador;

/**
 *
 * @author Anatalia Neves Mula
 */
public class DAOVendaClienteUtilizador extends ConexaoMySql{
    
    public ArrayList<ModelVendaClienteUtilizador> getListaVendaClienteUtilizadorDAO(){
        ArrayList<ModelVendaClienteUtilizador> listaModelVendaClienteUtilizador = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        ModelCliente modelCliente = new ModelCliente();
        ModelUtilizador modelUtilizador = new ModelUtilizador();
        ModelVendaClienteUtilizador modelVendaClienteUtilizador = new ModelVendaClienteUtilizador();
        
        try {
            this.conectar();
            this.executarSQL(
                    "select cliente.cliente_id, cliente.nome, cliente.endereco, cliente.telefone, cliente.email, "
                    + " cliente.data_registo, utilizador.utilizador_id, utilizador.nome, utilizador.login,"
                    + " utilizador.senha, utilizador.perfil, utilizador.data_registo, venda.venda_id, "
                    + " venda.id_cliente, venda.valor_venda, venda.data_venda, venda.id_utilizador from venda inner join cliente"
                    + " on venda.id_cliente = cliente.cliente_id "
                    + "inner join utilizador on venda.id_utilizador = utilizador.utilizador_id;"
               
            );

            while(this.getResultSet().next()){
                modelVenda = new ModelVenda();//INstanciamos novamente porque vai receber dados varias vezes
                modelCliente = new ModelCliente();
                modelUtilizador = new ModelUtilizador();
                modelVendaClienteUtilizador = new ModelVendaClienteUtilizador();
                
                modelVenda.setVenda_id(this.getResultSet().getInt (1));
                try{
                modelVenda.setId_cliente(this.getResultSet().getInt(2));
                
                modelVenda.setValor_venda(this.getResultSet().getDouble(3));
                modelVenda.setData_venda(this.getResultSet().getDate(4));
                modelVenda.setId_utilizador(this.getResultSet().getInt(5));
                }catch(NumberFormatException e){}
                
                //CLIENTE
                try{
                modelCliente.setCliente_id(this.getResultSet().getInt(6));
                modelCliente.setNome(this.getResultSet().getString(7));
                modelCliente.setEndereco(this.getResultSet().getString (8));
                modelCliente.setTelefone(this.getResultSet().getString(9));
                modelCliente.setEmail(this.getResultSet().getString(10));
                }catch(NumberFormatException ex){}
                
                try{
                //UTILIZADOR
                modelUtilizador.setUtilizador_id(this.getResultSet().getInt(11));
                modelUtilizador.setNome(this.getResultSet().getString(12));
                modelUtilizador.setLogin(this.getResultSet().getString(13));
                modelUtilizador.setSenha(this.getResultSet().getString(14));
                modelUtilizador.setPerfil(this.getResultSet().getString(15));
                modelUtilizador.setData_registo(this.getResultSet().getDate(16));
                }catch(NumberFormatException ec){}
                
                //vendas clientes
                modelVendaClienteUtilizador.setModelVenda(modelVenda);
                modelVendaClienteUtilizador.setModelCliente(modelCliente);
                modelVendaClienteUtilizador.setModelUtilizador(modelUtilizador);
                
                //Preenchendo a lista de vendaClienteUtilizaddor
                listaModelVendaClienteUtilizador.add(modelVendaClienteUtilizador);
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelVendaClienteUtilizador;
    }
}
