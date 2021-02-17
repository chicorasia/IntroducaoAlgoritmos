package radix_sort;

import counting_sort.CountingSort;
import util.Util;

public class RadixSort {

    public static void radixSort(int[] A){
        
        int maximum = Util.maximum(A);
        int numberOfDigits = calculateNumberOfDigitsIn(maximum);
        int placeValue = 1;
               
        while(numberOfDigits > 0) {
            //stable sort A on digit d
            applyCountingSortOn(A, placeValue);
            placeValue *= 10;
            numberOfDigits--;
        }
    }

    private static int calculateNumberOfDigitsIn(int number) {
        return String.valueOf(number).length();
    }

    private static void applyCountingSortOn(int[] A, int placeValue) {

        int range = 10; //decimal system
        int length = A.length;
        int[] frequency = new int[range];
        int[] sortedValues = new int[A.length];

        //calculate the frequency of digits
        for(int i = 0; i < length; i++){
            int digit = (A[i] / placeValue) % range;
            frequency[digit]++;
        }

        for(int i = 1; i < range; i++){
            frequency[i] += frequency[i - 1];
        }

        for(int i = length -1; i >= 0; i--){
            int digit = (A[i] / placeValue) % range;
            sortedValues[frequency[digit] - 1] = A[i];
            frequency[digit]--;
        }

        System.arraycopy(sortedValues, 0, A, 0, length);


    }

//    private static int getDigit(int i, int posicao){
//        if (posicao == 1){
//            return i;
//        } else {
//            return i / posicao * 10;
//        }
//    }

}
