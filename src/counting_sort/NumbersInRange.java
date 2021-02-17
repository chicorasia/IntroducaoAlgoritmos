package counting_sort;

import util.Util;

public class NumbersInRange {

    public static int[] countNumbersInRange(int[] A, int a, int b){

        int[] B = new int[b - a + 1];

        for(int i = 0; i < B.length; i++){
            B[i] = 0;
        }

        for(int j = 0; j < A.length; j++){
            if(A[j] >= a && A[j] <= b){
                B[A[j] - a]++;
            }
        }

        return B;

    }

    public static int sumOfRange(int[] A, int a, int b){

        int[] B = countNumbersInRange(A, a, b);
        int total = 0;
        for(int i = 0; i < B.length; i++){
            total += B[i];
        }

        return total;

    }
}
