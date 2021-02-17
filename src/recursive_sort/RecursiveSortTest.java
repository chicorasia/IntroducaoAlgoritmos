package recursive_sort;

public class RecursiveSortTest {
	
	public static void main(String[] args) {
		
		int[] array = {3,2,1};
		
		RecursiveSort recursiveSort = new RecursiveSort();
		
		recursiveSort.sort(array, 0);
		
		printArray(array);
		
	}
	
	static void printArray(int[] array) {
		int n = array.length;
		
		for(int i : array) System.out.print(i + ", ");
	}

}
