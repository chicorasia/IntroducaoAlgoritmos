package selection_sort;

public class TesteSelectionSort {
	
	static void printArray(int[] array) {
		int n = array.length;
		
		for(int i : array) System.out.print(i + ", ");
	}
	
	public static void main(String[] args) {
		
		int[] array = {30,20,10,40,50};
		
		SelectionSortRedux selectionSort = new SelectionSortRedux();
		
			
		selectionSort.sort(array);
		
		printArray(array);
		
	}

}
