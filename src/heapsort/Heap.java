package heapsort;

import util.Util;

public class Heap {
	
	private int[] array;
	private int heapsize;
	
	public Heap(int[] array) {
		this.array = array;
		this.heapsize = array.length;
	}
	
	public int[] getArray() {
		return array;
	}
	
	public int getHeapSize() {
		return heapsize;
	}
	
	private void setArray(int[] array) {
		this.array = array;
		this.heapsize = array.length;
	}
	
	private void decreaseHeapSizeBy(int amount) {
		int n = getArray().length - amount;
		int[] tmp = new int[n];
		
		for(int i = 0; i < n; i++) {
			tmp[i] = getArray()[i];
		}
		
		this.setArray(tmp);
	}
	
	private void increaseHeapSizeBy(int amount) {
		int n = getArray().length + amount;
		int[] tmp = new int[n];
		
		for(int i = 0; i < n - amount; i++) {
			tmp[i] = getArray()[i];
		}
		
		this.setArray(tmp);
	}
	

	static int parent(int i) {
		return (i - 1)/2;
	}
	
	static int left(int i) {
		return (2 * i) + 1;
	}
	
	static int right(int i) {
		return (2 * i) + 2;		
	}
	
	static void maxHeapify(int[] A, int n, int i) {
		
		int l = left(i);
		int r = right(i);
		
		int largest;
		
		if(l < n && A[l] > A[i]) {
			largest = l;
		} else {
			largest = i;
		}
		
		if(r < n && A[r] > A[largest]) {
			largest = r;
		}
		
		if(largest != i) {	
			swap(A, i, largest);
			maxHeapify(A, n, largest);
		}
	}
	
	
	private static void swap(int[] A, int i, int j) {
		int key = A[i];
		A[i] = A[j];
		A[j] = key;
	}

//	private static void insertionSwap(int[] A, int i, int j) {
//
//		if(i > j){
//			A[j] = A[i];
//			while(i > j){
//				A[i] = A[parent(i)];
//				i = parent(i);
//			}
//		} else if(j < i){
//			A[i] = A[j];
//			while(i > j){
//				A[j] = A[parent(j)];
//				j = parent(j);
//			}
//		}


//	}
	
	static void minHeapify(int[] A, int n, int i) {
		
		int l = left(i);
		int r = right(i);
		
		int smallest;
		
		if(l < n && A[l] < A[i]) {
			smallest = l;
		} else {
			smallest = i;
		}
		
		if(r < n && A[r] < A[smallest]) {
			smallest = r;
		}
		
		if(smallest != i) {
			swap(A, i, smallest);
			minHeapify(A, n, smallest);
		}
	}
	
	static void buildMaxHeap(int[] A) {
		
		int n = A.length;
		
		for(int i = n/2; i >= 0; i--) {
			maxHeapify(A, n, i);
		}
	}
	
	static void buildMinHeap(int[] A) {
			
		int n = A.length;
			
		for(int i = n/2; i >= 0; i--) {
				minHeapify(A, n, i);
		}
	}
	
	public void sort() {
		
		buildMaxHeap(getArray());
		int n = getHeapSize();
		
		for(int i = n - 1; i >= 0; i--) {
			swap(getArray(), 0, i);
			n--;
			maxHeapify(getArray(), n, 0);
		}
		
	}
	
	static void sort(int[] A) {
		
		buildMaxHeap(A);
		int n = A.length;
		
		for(int i = n - 1; i >= 0; i--) {
			swap(A, 0, i);
			n--;
			maxHeapify(A, n, 0);
		}
		
	}
	
	
	static int maximum(Heap H) {
		return H.getArray()[0];
	}
	
	static int extractMaximum(Heap H) {
		if(H.getHeapSize() < 1){
			throw new IllegalArgumentException("heap underflow");
		}
		int max = H.getArray()[0];
		int n = H.getHeapSize();
		H.getArray()[0] = H.getArray()[n - 1];
		H.decreaseHeapSizeBy(1);
		maxHeapify(H.getArray(), H.getHeapSize(), 0);
		
		return max;
		
	}
	
	static void heapIncreaseKey(Heap H, int i, int newKey) {
		
		if(newKey < H.get(i)) {
			throw new IllegalArgumentException("new key is smaller than current key");
		}
		H.set(i, newKey);
		while(i > 0 && H.get(parent(i)) < H.get(i)) {
			int p = parent(i);
			swap(H.getArray(), i, p);
			i = p;
		}
		
	}
	
	static void maxHeapInsert(Heap H, int key) {
		
		H.increaseHeapSizeBy(1);
		int n = H.getHeapSize();
		H.set(n - 1, (int) Double.NEGATIVE_INFINITY);
		heapIncreaseKey(H, n - 1, key);
		
	}

	static int heapMinimum(Heap H){
		return H.get(0);
	}

	static int extractMinimum(Heap H){
		if(H.getHeapSize() < 1){
			throw new IllegalArgumentException("heap underflow");
		}
		int min = H.get(0);
		int n = H.getHeapSize();
		H.getArray()[0] = H.getArray()[n - 1];
		H.decreaseHeapSizeBy(1);
		minHeapify(H.getArray(), H.getHeapSize(), 0);

		return min;

	}

	static void heapDecreaseKey(Heap H, int i, int newKey){

		if(newKey > H.get(i)) {
			throw new IllegalArgumentException("new key is greater than current key");
		}
		H.set(i, newKey);
		while(i > 0 && H.get(parent(i)) > H.get(i)) {
			int p = parent(i);
			swap(H.getArray(), i, p);
			i = p;
		}

	}

	static void minHeapInsert(Heap H, int key){

		H.increaseHeapSizeBy(1);
		int n = H.getHeapSize();
		H.set(n - 1, (int) Double.POSITIVE_INFINITY);
		heapDecreaseKey(H, n - 1, key);

	}

	private int get(int i) {
		return this.array[i];
	}
	
	private void set(int i, int j) {
		this.array[i] = j;
	}
}
