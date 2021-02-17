package counting_sort;

import util.Util;

public class NumbersInRangeTest {

    public static void main(String[] args) {

        int[] array = {0, 2, 2, 5, 3, 3, 1, 8, 9, 10};

        Util.printArray(NumbersInRange.countNumbersInRange(array, 3, 6));
        System.out.println("\n" + NumbersInRange.sumOfRange(array, 3, 6));

    }
}
