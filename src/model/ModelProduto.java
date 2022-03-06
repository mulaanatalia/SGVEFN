package model;

import java.util.Date;

/**
*
* @author Anatalia Mula
*/
public class ModelProduto {

    private int produto_id;
    private String nome;
    private double preco_unitario;
    private int estoque;
    private Date data_registo;
    private int id_categoria;

    /**
    * Construtor
    */
    public ModelProduto(){}

    /**
    * seta o valor de produto_id
    * @param pProduto_id
    */
    public void setProduto_id(int pProduto_id){
        this.produto_id = pProduto_id;
    }
    /**
    * @return pk_produto_id
    */
    public int getProduto_id(){
        return this.produto_id;
    }

    /**
    * seta o valor de nome
    * @param pNome
    */
    public void setNome(String pNome){
        this.nome = pNome;
    }
    /**
    * @return nome
    */
    public String getNome(){
        return this.nome;
    }

    /**
    * seta o valor de preco_unitario
    * @param pPreco_unitario
    */
    public void setPreco_unitario(double pPreco_unitario){
        this.preco_unitario = pPreco_unitario;
    }
    /**
    * @return preco_unitario
    */
    public double getPreco_unitario(){
        return this.preco_unitario;
    }

    /**
    * seta o valor de estoque
    * @param pEstoque
    */
    public void setEstoque(int pEstoque){
        this.estoque = pEstoque;
    }
    /**
    * @return estoque
    */
    public int getEstoque(){
        return this.estoque;
    }

    /**
    * seta o valor de data_registo
    * @param pData_registo
    */
    public void setData_registo(Date pData_registo){
        this.data_registo = pData_registo;
    }
    /**
    * @return data_registo
    */
    public Date getData_registo(){
        return this.data_registo;
    }

    /**
    * seta o valor de id_categoria
    * @param pId_categoria
    */
    public void setId_categoria(int pId_categoria){
        this.id_categoria = pId_categoria;
    }
    /**
    * @return fk_id_categoria
    */
    public int getId_categoria(){
        return this.id_categoria;
    }

    @Override
    public String toString(){
        return "ModelProduto {" + "::produto_id = " + this.produto_id + "::nome = " + this.nome + "::preco_unitario = " + this.preco_unitario + "::estoque = " + this.estoque + "::data_registo = " + this.data_registo + "::id_categoria = " + this.id_categoria +  "}";
    }
}