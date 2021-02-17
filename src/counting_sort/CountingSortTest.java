package counting_sort;

import quicksort.Quicksort;
import radix_sort.RadixSort;
import util.Util;

import java.util.Random;

public class CountingSortTest {

    public static void main(String[] args) {

        Random rand = new Random();
        int quantidadeDeElementos = 100000000;

        int[] arrayOrigem = new int[quantidadeDeElementos];

        for(int i = 0; i < quantidadeDeElementos; i++){
            arrayOrigem[i] = rand.nextInt(1000);
        }

        int maximum = Util.maximum(arrayOrigem);
        int[] arrayDestino = new int[arrayOrigem.length];

        long inicio = System.currentTimeMillis();
        CountingSort.countingSort(arrayOrigem, arrayDestino, maximum);
        long termino = System.currentTimeMillis();
//        Util.printArray(arrayDestino);
        long tempoDecorrido = termino - inicio;

        System.out.println("\n*****");
        System.out.println(String.format("Tempo CountingSort: %s ms", tempoDecorrido));

        inicio = System.currentTimeMillis();
        Quicksort.randomizedSort(arrayOrigem, 0, arrayOrigem.length - 1);
        termino = System.currentTimeMillis();
        tempoDecorrido = termino - inicio;
        System.out.println(String.format("Tempo Quicksort: %s ms", tempoDecorrido));

        inicio = System.currentTimeMillis();
        RadixSort.radixSort(arrayOrigem);
        termino = System.currentTimeMillis();
        tempoDecorrido = termino - inicio;
        System.out.println(String.format("Tempo RadixSort: %s ms", tempoDecorrido));

    }
}
