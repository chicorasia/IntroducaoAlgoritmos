package heapsort;

import java.util.Random;

import util.Util;

public class MaxPriorityQueueTest {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int tamanhoArray = 10;
		int[] randomData = new int[tamanhoArray];
		
		for(int i = 0; i < tamanhoArray; i++) {
			randomData[i] = rand.nextInt(100);
		}
		
		Heap queue = new Heap(randomData);
		
		Util.printArray(queue.getArray());
		System.out.println();
		System.out.println("*****");
		
		Heap.buildMaxHeap(queue.getArray());
		Util.printArray(queue.getArray());
		System.out.println();
		System.out.println("Max: " + Heap.maximum(queue));
		System.out.println("*****");
		
		System.out.println("Max: "+ Heap.extractMaximum(queue));
		System.out.println("Max: "+ Heap.extractMaximum(queue));
		System.out.println("Max: "+ Heap.extractMaximum(queue));
		System.out.println("Max: "+ Heap.extractMaximum(queue));
		System.out.println("Max: "+ Heap.extractMaximum(queue));
		System.out.println("Max: "+ Heap.extractMaximum(queue));
		System.out.println("Max: "+ Heap.extractMaximum(queue));
		System.out.println("Max: "+ Heap.extractMaximum(queue));
		System.out.println("Max: "+ Heap.extractMaximum(queue));
		System.out.println("Max: "+ Heap.extractMaximum(queue));
		
		Util.printArray(queue.getArray());
		
		
	}

}
