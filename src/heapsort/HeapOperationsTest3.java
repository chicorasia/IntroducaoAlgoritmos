package heapsort;

import util.Util;

public class HeapOperationsTest3 {

	public static void main(String[] args) {
		
		int[] array = {1,1,1,1,1,1,1,1,10000,1,1,1,1,1,1,1,1,1,1,1,1};
	
		Heap queue = new Heap(array);
		Util.printArray(queue.getArray());
		System.out.println("\n ****");
		
		queue.buildMaxHeap(queue.getArray());
		
		Util.printArray(queue.getArray());
		System.out.println("\n *****");
		
		Heap.maxHeapInsert(queue, 1000);
		Heap.maxHeapInsert(queue, 100);
		Heap.heapIncreaseKey(queue, 3, 10);
		Util.printArray(queue.getArray());
		System.out.println("\n ****");
		
		
	}
	
}
