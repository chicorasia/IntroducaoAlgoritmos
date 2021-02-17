package quicksort;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import util.Util;

public class QuickSortReverseOperationTest {

    public static void main(String[] args) {

        int[] array = {3,2,4,1,5,7,8,9,0};

//        Quicksort.reversePartition(array, 0, array.length - 1);
        Quicksort.reverseSort(array, 0, array.length - 1);

        Util.printArray(array);

    }

}
