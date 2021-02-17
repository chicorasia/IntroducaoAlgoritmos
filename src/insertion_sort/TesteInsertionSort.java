package insertion_sort;

public class TesteInsertionSort {

	static void printArray(int[] array) {
		int n = array.length;
		
		for(int i : array) System.out.print(i + ", ");
	}
	
	public static void main(String[] args) {
		
		int[] array = {6,5,3,2};
		
		InsertionSort insertionSort = new InsertionSort();
		
		insertionSort.sort(array);
		
		printArray(array);
		
		insertionSort.reverseSort(array);
		
		System.out.println();
		printArray(array);
		
		System.out.println();
		
		System.out.println(insertionSort.indexOf(4, array));
		
	}
	
}
