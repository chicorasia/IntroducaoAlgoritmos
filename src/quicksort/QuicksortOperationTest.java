package quicksort;

import util.Util;

public class QuicksortOperationTest {

    public static void main(String[] args) {

        int[] array = {13,19,9,5,12,8,7,4,27,8,31,33,27,18};
        int[] array2 = {1,1,1,1,1,1,1,1,1,1,1,1};

        int q = Quicksort.partition(array, 0, array.length - 1);

        Quicksort.sort(array, 0, array.length - 1);
        System.out.println("q = " + q + "\n");

        Util.printArray(array);
        System.out.println("\n **** ");

        q = Quicksort.partition(array2, 0, array2.length - 1);
        System.out.println("q = " + q);
        Util.printArray(array2);
//        Quicksort.sort(array2, 0, array2.length - 1);




    }

}
