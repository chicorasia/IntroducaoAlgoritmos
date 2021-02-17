package quicksort;

import java.util.Random;

public class Quicksort {

   static void sort(int[] A, int inicio, int termino){

       if(isOrdered(A, inicio, termino)){
           return;
       }

       if(inicio < termino){
           int pivot = partition(A, inicio, termino);
           sort(A, inicio, pivot - 1);
           sort(A, pivot + 1, termino);
       }

   }

    static void reverseSort(int[] A, int inicio, int termino){

        if(inicio < termino){
            int pivot = reversePartition(A, inicio, termino);
            reverseSort(A, inicio, pivot - 1);
            reverseSort(A, pivot + 1, termino);
        }

    }

   public static int partition(int[] A, int inicio, int termino){

       int x = A[termino];
       int i = inicio - 1;

       if(!allElementsTheSame(A, inicio, termino)){
           for(int j = inicio; j < termino; j++){
               if(A[j] <= x){
                   i++;
                   if(i!=j){
                       swap(A, i, j);
                   }
               }
           }
           swap(A, i + 1, termino);
           return i+1;
       } else {
           return (inicio + termino) / 2;
       }

   }

   static void swap(int[] A, int i, int j){
       int tmp = A[i];
       A[i] = A[j];
       A[j] = tmp;
   }

   static boolean allElementsTheSame(int[] A, int inicio, int termino){

       boolean allSame = true;
       for(int i = inicio; i < termino - 1; i++){
           if (A[i] != A[i+1]) return false;
       }
       return allSame;
   }


    static int reversePartition(int[] A, int inicio, int termino){

        int x = A[inicio];
        int i = termino + 1;

        if(!allElementsTheSame(A, inicio, termino)){
            for(int j = termino; j > inicio; j--){
                if(A[j] <= x){
                    i--;
                    if(i!=j){
                        swap(A, i, j);
                    }
                }
            }
            swap(A, i - 1, inicio);
            return i - 1;
        } else {
            return (inicio + termino) / 2;
        }

    }

    static boolean isOrdered(int[] A, int inicio, int termino){

        boolean isOrdered = true;
        for(int i = inicio; i < termino - 1; i++){
            if (A[i] > A[i+1]) return false;
        }
        return isOrdered;
    }

    public static int randomizedPartition(int[] A, int inicio, int termino){

       Random rand = new Random();
       int i = rand.nextInt(termino) - inicio;

       swap(A, i, termino);

       return partition(A, inicio, termino);

    }

    public static void randomizedSort(int[] A, int inicio, int termino){

        if(isOrdered(A, inicio, termino)){
            return;
        }

        if(inicio < termino){
            int pivot = randomizedPartition(A, inicio, termino);
            sort(A, inicio, pivot - 1);
            sort(A, pivot + 1, termino);
        }

    }

    static void tailRecursiveQuickSort(int[] A, int inicio, int termino){

//        if(isOrdered(A, inicio, termino)){
//            return;
//        }

       while(inicio < termino){
           int q = partition(A, inicio, termino);
           tailRecursiveQuickSort(A, inicio, q -1);
           inicio = q + 1;
       }

    }
}
