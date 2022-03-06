package model;

import java.sql.Date;

/**
*
* @author Anatalia Mula
*/
public class ModelCliente {

    private int cliente_id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Date data_registo;

    /**
    * Construtor
    */
    public ModelCliente(){}

    /**
    * seta o valor de cliente_id
    * @param pCliente_id
    */
    public void setCliente_id(int pCliente_id){
        this.cliente_id = pCliente_id;
    }
    /**
    * @return pk_cliente_id
    */
    public int getCliente_id(){
        return this.cliente_id;
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
    * seta o valor de endereco
    * @param pEndereco
    */
    public void setEndereco(String pEndereco){
        this.endereco = pEndereco;
    }
    /**
    * @return endereco
    */
    public String getEndereco(){
        return this.endereco;
    }

    /**
    * seta o valor de telefone
    * @param pTelefone
    */
    public void setTelefone(String pTelefone){
        this.telefone = pTelefone;
    }
    /**
    * @return telefone
    */
    public String getTelefone(){
        return this.telefone;
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

    @Override
    public String toString(){
        return "ModelCliente {" + "::cliente_id = " + this.cliente_id + "::nome = " + this.nome + "::endereco = " + this.endereco + "::telefone = " + this.telefone + "::email = " + this.email +  "}";
    }

    /**
     * @return the data_registo
     */
    public Date getData_registo() {
        return data_registo;
    }

    /**
     * @param data_registo the data_registo to set
     */
    public void setData_registo(Date data_registo) {
        this.data_registo = data_registo;
    }
}