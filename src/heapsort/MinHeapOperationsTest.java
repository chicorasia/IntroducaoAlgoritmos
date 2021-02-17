package heapsort;

import util.Util;

public class MinHeapOperationsTest {

    public static void main(String[] args) {

        int[] array = {10,8,5,7,4,3,9,2,1};

        Heap queue = new Heap(array);
        Util.printArray(queue.getArray());
        System.out.println("\n ****");

        queue.buildMinHeap(queue.getArray());

        Util.printArray(queue.getArray());
        System.out.println("\n *****");

        Heap.minHeapInsert(queue, -1);
        Util.printArray(queue.getArray());
        System.out.println("\n ****");

        int min = Heap.extractMinimum(queue);
        System.out.println("Min: " + min);
        Util.printArray(queue.getArray());
        System.out.println("\n ****");

        Heap.heapDecreaseKey(queue, 1, -2);
        Util.printArray(queue.getArray());
        System.out.println("\n ****");



    }

}
