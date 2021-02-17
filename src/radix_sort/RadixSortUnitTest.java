package radix_sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class RadixSortUnitTest {

    @Test
    public void deve_RetornarUmArrayOrdenado_AposReceberUmArrayDesordenado(){

        int[] numbers = {387, 468, 134, 123, 68, 221, 769, 37, 7};
        RadixSort.radixSort(numbers);

        int[] sortedArray = {7, 37, 68, 123, 134, 221, 387, 468, 769};
        assertArrayEquals(numbers, sortedArray);


    }

}