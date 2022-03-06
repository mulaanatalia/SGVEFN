package model;

import java.sql.Date;

/**
*
* @author Anatalia Mula
*/
public class ModelUtilizador {

    private int utilizador_id;
    private String nome;
    private String login;
    private String  senha;
    private String perfil;
    private Date data_registo;

    /**
    * Construtor
    */
    public ModelUtilizador(){}

    /**
    * seta o valor de utilizador_id
    * @param pUtilizador_id
    */
    public void setUtilizador_id(int pUtilizador_id){
        this.utilizador_id = pUtilizador_id;
    }
    /**
    * @return pk_utilizador_id
    */
    public int getUtilizador_id(){
        return this.utilizador_id;
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
    * seta o valor de login
    * @param pLogin
    */
    public void setLogin(String pLogin){
        this.login = pLogin;
    }
    /**
    * @return login
    */
    public String getLogin(){
        return this.login;
    }

    /**
    * seta o valor de senha
    * @param pSenha
    */
    public void setSenha(String  pSenha){
        this.senha = pSenha;
    }
    /**
    * @return senha
    */
    public String  getSenha(){
        return this.senha;
    }

    /**
    * seta o valor de perfil
    * @param pPerfil
    */
    public void setPerfil(String pPerfil){
        this.perfil = pPerfil;
    }
    /**
    * @return perfil
    */
    public String getPerfil(){
        return this.perfil;
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
        return "ModelUtilizador {" + "::utilizador_id = " + this.utilizador_id + "::nome = " + this.nome + "::login = " + this.login + "::senha = " + this.senha + "::perfil = " + this.perfil + "::data_registo = " + this.data_registo +  "}";
    }
}