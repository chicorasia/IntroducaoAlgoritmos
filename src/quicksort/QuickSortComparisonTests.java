package quicksort;

import util.Util;

import java.util.Random;

public class QuickSortComparisonTests {

    public static void main(String[] args) {

        Random rand = new Random();
        int tamanhoDaAmostra = 20000;
        int[] array = new int[tamanhoDaAmostra];

        for(int i = 0; i < tamanhoDaAmostra; i++){
//            array[i] = rand.nextInt(100);
            array[i] = i;
        }

        long startTime = System.currentTimeMillis();
        Quicksort.randomizedSort(array, 0, array.length - 1);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

//        Util.printArray(array);
        System.out.println("\n Running time: " + elapsedTime + " ms");



    }
}
