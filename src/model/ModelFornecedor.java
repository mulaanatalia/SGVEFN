package model;

import java.sql.Date;

/**
*
* @author Anatalia Mula
*/
public class ModelFornecedor {

    private int fornecedor_id;
    private String nome;
    private int nuit;
    private String telefone1;
    private String telefone2;
    private String email;
    private String localizacao;
    private Date data_registo;

    /**
    * Construtor
    */
    public ModelFornecedor(){}

    /**
    * seta o valor de fornecedor_id
    * @param pFornecedor_id
    */
    public void setFornecedor_id(int pFornecedor_id){
        this.fornecedor_id = pFornecedor_id;
    }
    /**
    * @return pk_fornecedor_id
    */
    public int getFornecedor_id(){
        return this.fornecedor_id;
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
    * seta o valor de nuit
    * @param pNuit
    */
    public void setNuit(int pNuit){
        this.nuit = pNuit;
    }
    /**
    * @return nuit
    */
    public int getNuit(){
        return this.nuit;
    }

    /**
    * seta o valor de telefone1
    * @param pTelefone1
    */
    public void setTelefone1(String pTelefone1){
        this.telefone1 = pTelefone1;
    }
    /**
    * @return telefone1
    */
    public String getTelefone1(){
        return this.telefone1;
    }

    /**
    * seta o valor de telefone2
    * @param pTelefone2
    */
    public void setTelefone2(String pTelefone2){
        this.telefone2 = pTelefone2;
    }
    /**
    * @return telefone2
    */
    public String getTelefone2(){
        return this.telefone2;
    }

    /**
    * seta o valor de email
    * @param pEmail
    */
    public void setEmail(String pEmail){
        this.email = pEmail;
    }
    /**
    * @return email
    */
    public String getEmail(){
        return this.email;
    }

    /**
    * seta o valor de localizacao
    * @param pLocalizacao
    */
    public void setLocalizacao(String pLocalizacao){
        this.localizacao = pLocalizacao;
    }
    /**
    * @return localizacao
    */
    public String getLocalizacao(){
        return this.localizacao;
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
        return "ModelFornecedor {" + "::fornecedor_id = " + this.fornecedor_id + "::nome = " + this.nome + "::nuit = " + this.nuit + "::telefone1 = " + this.telefone1 + "::telefone2 = " + this.telefone2 + "::email = " + this.email + "::localizacao = " + this.localizacao + "::data_registo = " + this.data_registo +  "}";
    }
}