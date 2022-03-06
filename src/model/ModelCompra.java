package model;

import java.sql.Date;

/**
*
* @author Anatalia Mula
*/
public class ModelCompra {

    private int compra_id;
    private int id_produto;
    private int id_fornecedor;
    private double preco_unitario_produto;
    private Date data_compra;

    /**
    * Construtor
    */
    public ModelCompra(){}

    

    /**
    * seta o valor de id_produto
    * @param pId_produto
    */
    public void setId_produto(int pId_produto){
        this.id_produto = pId_produto;
    }
    /**
    * @return fk_id_produto
    */
    public int getId_produto(){
        return this.id_produto;
    }

    /**
    * seta o valor de id_fornecedor
    * @param pId_fornecedor
    */
    public void setId_fornecedor(int pId_fornecedor){
        this.id_fornecedor = pId_fornecedor;
    }
    /**
    * @return fk_id_fornecedor
    */
    public int getId_fornecedor(){
        return this.id_fornecedor;
    }

    /**
    * seta o valor de preco_unitario_produto
    * @param pPreco_unitario_produto
    */
    public void setPreco_unitario_produto(double pPreco_unitario_produto){
        this.preco_unitario_produto = pPreco_unitario_produto;
    }
    /**
    * @return preco_unitario_produto
    */
    public double getPreco_unitario_produto(){
        return this.preco_unitario_produto;
    }

    
    @Override
    public String toString(){
        return "ModelFornecimento {" + "::fornecimento_id = " + this.getCompra_id() + 
                "::id_produto = " + this.id_produto + "::id_fornecedor = " + this.id_fornecedor + 
                "::preco_unitario_produto = " + this.preco_unitario_produto + "::data_fornecimento = "
                + "" + this.getData_compra() +  "}";
    }

    /**
     * @return the compra_id
     */
    public int getCompra_id() {
        return compra_id;
    }

    /**
     * @param compra_id the compra_id to set
     */
    public void setCompra_id(int compra_id) {
        this.compra_id = compra_id;
    }

    /**
     * @return the data_compra
     */
    public Date getData_compra() {
        return data_compra;
    }

    /**
     * @param data_compra the data_compra to set
     */
    public void setData_compra(Date data_compra) {
        this.data_compra = data_compra;
    }
}