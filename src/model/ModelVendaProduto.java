package model;
/**
*
* @author Anatalia Mula
*/
public class ModelVendaProduto {

    private int venda_produto_id;
    private int id_venda;
    private int id_produto;
    private int produto_quantidade;

    /**
    * Construtor
    */
    public ModelVendaProduto(){}

    /**
    * seta o valor de venda_produto_id
    * @param pVenda_produto_id
    */
    public void setVenda_produto_id(int pVenda_produto_id){
        this.venda_produto_id = pVenda_produto_id;
    }
    /**
    * @return pk_venda_produto_id
    */
    public int getVenda_produto_id(){
        return this.venda_produto_id;
    }

    /**
    * seta o valor de id_venda
    * @param pId_venda
    */
    public void setId_venda(int pId_venda){
        this.id_venda = pId_venda;
    }
    /**
    * @return fk_id_venda
    */
    public int getId_venda(){
        return this.id_venda;
    }

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
    * seta o valor de produto_quantidade
    * @param pProduto_quantidade
    */
    public void setProduto_quantidade(int pProduto_quantidade){
        this.produto_quantidade = pProduto_quantidade;
    }
    /**
    * @return produto_quantidade
    */
    public int getProduto_quantidade(){
        return this.produto_quantidade;
    }

    @Override
    public String toString(){
        return "ModelVendaProduto {" + "::venda_produto_id = " + this.venda_produto_id + "::id_venda = " + this.id_venda + "::id_produto = " + this.id_produto + "::produto_quantidade = " + this.produto_quantidade +  "}";
    }
}