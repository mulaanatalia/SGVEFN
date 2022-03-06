package model;

import java.sql.Date;

/**
*
* @author Anatalia Mula
*/
public class ModelVenda {

    private int venda_id;
    private int id_cliente;
    private double valor_venda;
    private Date data_venda;
    private int id_utilizador;

    /**
    * Construtor
    */
    public ModelVenda(){}

    /**
    * seta o valor de venda_id
    * @param pVenda_id
    */
    public void setVenda_id(int pVenda_id){
        this.venda_id = pVenda_id;
    }
    /**
    * @return pk_venda_id
    */
    public int getVenda_id(){
        return this.venda_id;
    }

    /**
    * seta o valor de id_cliente
    * @param pId_cliente
    */
    public void setId_cliente(int pId_cliente){
        this.id_cliente = pId_cliente;
    }
    /**
    * @return fk_id_cliente
    */
    public int getId_cliente(){
        return this.id_cliente;
    }

    /**
    * seta o valor de valor_venda
    * @param pValor_venda
    */
    public void setValor_venda(double pValor_venda){
        this.valor_venda = pValor_venda;
    }
    /**
    * @return valor_venda
    */
    public double getValor_venda(){
        return this.valor_venda;
    }

    /**
    * seta o valor de data_venda
    * @param pData_venda
    */
    public void setData_venda(Date pData_venda){
        this.data_venda = pData_venda;
    }
    /**
    * @return data_venda
    */
    public Date getData_venda(){
        return this.data_venda;
    }

    /**
    * seta o valor de id_utilizador
    * @param pId_utilizador
    */
    public void setId_utilizador(int pId_utilizador){
        this.id_utilizador = pId_utilizador;
    }
    /**
    * @return fk_id_utilizador
    */
    public int getId_utilizador(){
        return this.id_utilizador;
    }

    @Override
    public String toString(){
        return "ModelVenda {" + "::venda_id = " + this.venda_id + "::id_cliente = " + this.id_cliente + "::valor_venda = " + this.valor_venda + "::data_venda = " + this.data_venda + "::id_utilizador = " + this.id_utilizador +  "}";
    }
}