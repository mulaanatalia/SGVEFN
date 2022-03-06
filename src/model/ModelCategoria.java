package model;

import java.util.Date;

/**
*
* @author Anatalia Mula
*/
public class ModelCategoria {

    private int categoria_id;
    private String nome;
    private String descricao;
    private Date data_registo;

    /**
    * Construtor
    */
    public ModelCategoria(){}

    /**
    * seta o valor de categoria_id
    * @param pCategoria_id
    */
    public void setCategoria_id(int pCategoria_id){
        this.categoria_id = pCategoria_id;
    }
    /**
    * @return pk_categoria_id
    */
    public int getCategoria_id(){
        return this.categoria_id;
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
    * seta o valor de descricao
    * @param pDescricao
    */
    public void setDescricao(String pDescricao){
        this.descricao = pDescricao;
    }
    /**
    * @return descricao
    */
    public String getDescricao(){
        return this.descricao;
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

    @Override
    public String toString(){
        return "ModelCategoria {" + "::categoria_id = " + this.categoria_id + "::nome = " + this.nome + "::descricao = " + this.descricao + "::data_registo = " + this.data_registo +  "}";
    }
}