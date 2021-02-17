package radix_sort;

import counting_sort.CountingSort;
import util.Util;

public class RadixSortTest {

    public static void main(String[] args) {

        int[] array = {329, 457, 657, 839, 436, 720, 355};
        int[] arrayDestino = new int[array.length];

        RadixSort.radixSort(array);


        Util.printArray(array);

    }
}
