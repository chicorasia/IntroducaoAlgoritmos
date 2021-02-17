package AluraAlgoritmos1.produtos;

public class ProdutoBuilder {

    private String nome;
    private double preco;

    public ProdutoBuilder comNome(String nome){
        this.nome = nome;
        return this;
    }

    public ProdutoBuilder comPreco(double preco){
        this.preco = preco;
        return this;
    }

    public Produto constroi(){
        return new Produto(preco, nome);
    }
}
