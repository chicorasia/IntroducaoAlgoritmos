package bubblesort;

public class BubbleSortTest {
	
	public static void printArray(int[] array) {
		
		for(int a : array) {
			System.out.print(a + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int[] array = {10,40,30,60,70,20};
		

		printArray(array);
		BubbleSort.sort(array);
		
		
		printArray(array);
		
		BubbleSort.reverseSort(array);
		printArray(array);
		
		
	}
	
	
	
	
}
