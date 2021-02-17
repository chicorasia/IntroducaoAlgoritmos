package alura_algoritmos_2;

public class MergeSort {

    static int[] junta(int[] D, int[] E){

        //ordena D
        //ordena E
        //cria um array de destino com tamanho D + E
        int[] A = new int[D.length + E.length];
        int atual = 0;
        int atualDireita = 0, atualEsquerda = 0;


        //junta os elementos dos dois arrays, alternadamente, no array de destino
        while(atualDireita < D.length && atualEsquerda < E.length){
            if(D[atualDireita] < E[atualEsquerda]){
                A[atual] = D[atualDireita];
                atualDireita++;
            } else {
                A[atual] = E[atualEsquerda];
                atualEsquerda++;
            }
            atual++;
        }
        return A;
    }

}
