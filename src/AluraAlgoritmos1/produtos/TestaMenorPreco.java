package AluraAlgoritmos1.produtos;

public class TestaMenorPreco {

    public static void main(String[] args) {

        Produto[] produtos = {
                new Produto(1000000, "Lamborghini"),
                new Produto(46000, "Land Rover"),
                new Produto(16000, "Brasilia"),
                new Produto(46000, "Smart"),
                new Produto(17000, "Fusca")
        };

        int idxMenorPreco = buscaMenor(produtos, 0, 4);
        int idxMaiorPreco = buscaMaior(produtos, 0, 4);

        System.out.println(String.format("O carro mais barato é %s com o valor de R$ %s",
                produtos[idxMenorPreco].getNome(),
                produtos[idxMenorPreco].getPreco()));

        System.out.println(String.format("O carro mais caro é %s com o valor de R$ %s",
                produtos[idxMaiorPreco].getNome(),
                produtos[idxMaiorPreco].getPreco()));

//        ordena(produtos, produtos.length);
        insertionSort(produtos, produtos.length);
        for (Produto p: produtos) {
            System.out.println(p.getNome() + ": R$"+ p.getPreco() + ", ");
        }

    }

    public static int buscaMenor(Produto[] produtos, int inicio, int termino){

        int maisBarato = inicio;
        int atual = inicio;

        if(produtos.length == 0){
            throw new IllegalArgumentException("O array está vazio!");
        }

        if(inicio == termino){
            return inicio;
        }

        while(atual <= termino){
            if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()){
                maisBarato = atual;
            }
            atual++;
        }
        return maisBarato;
    }

    public static int buscaMaior(Produto[] produtos, int inicio, int termino){

        int maisCaro = inicio;
        int atual = inicio;

        if(produtos.length == 0){
            throw new IllegalArgumentException("O array está vazio!");
        }

        if(inicio == termino){
            return inicio;
        }


        while(atual <= termino){
            if(produtos[atual].getPreco() > produtos[maisCaro].getPreco()){
                maisCaro = atual;
            }
            atual++;
        }
        return maisCaro;
    }

    public static void selectionSort(Produto[] produtos, int quantidadeDeElementos){

        for(int atual = 0; atual < quantidadeDeElementos - 1; atual++){
            int menor = buscaMenor(produtos, atual, quantidadeDeElementos - 1);
            troca(produtos, atual, menor);
        }
    }

    public static void insertionSort(Produto[] produtos, int quantidadeDeElementos){

        for(int atual = 1; atual < quantidadeDeElementos; atual++){
            int analise = atual;
            while(analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()){
                troca(produtos, analise, analise - 1);
                analise--;
            }
        }


    }

    private static void troca(Produto[] produtos, int primeiro, int segundo) {
        Produto primeiroProduto = produtos[primeiro];
        Produto segundoProduto = produtos[segundo];
        produtos[primeiro] = segundoProduto;
        produtos[segundo] = primeiroProduto;
    }
}
