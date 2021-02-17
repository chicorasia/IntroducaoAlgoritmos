package heapsort;

import java.util.Random;

import util.Util;

public class HeapsortTest {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int tamanhoArray = 10;
		int[] array = new int[tamanhoArray];
		
		for(int i = 0; i < tamanhoArray; i++) {
			array[i] = rand.nextInt(100);
		}
		
		Heap heap = new Heap(array);
		
		Util.printArray(heap.getArray());
		System.out.println();
		System.out.println("*****");
		
		heap.sort();
		Util.printArray(heap.getArray());
		System.out.println();
		System.out.println("*****");
		
		
		
		
	}
	
}
