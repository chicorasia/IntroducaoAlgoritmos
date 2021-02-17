package heapsort;

import java.util.Random;

import util.Util;

public class HeapOperationsTest2 {

	public static void main(String[] args) {
		
		int[] array = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1000,1,1,1,1};
		
		Heap heap = new Heap(array);
		
		Util.printArray(heap.getArray());
		System.out.println();
		System.out.println("*****");
		
		Heap.buildMaxHeap(heap.getArray());
		Util.printArray(array);

//		Heap.reverseSort(array);
		System.out.println("*****");
		
		Heap.heapIncreaseKey(heap, 4, 101);
		System.out.println("*****");
		Util.printArray(array);
		
	}
	
}
