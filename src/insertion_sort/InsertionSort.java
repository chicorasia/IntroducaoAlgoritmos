package insertion_sort;


public class InsertionSort {

	public void sort(int[] array) {
		
		int key, i, j;
		int n = array.length;
		
		for(j = 1; j < n; ++j) {
			key = array[j];
			i = j - 1;
			while(i >= 0 && array[i] > key) {
				array[i + 1] = array[i];
				i = i - 1;
			}
			array[i + 1] = key;
		}
		
	}
	
	public void reverseSort(int[] array) {
		
		int key, i, j;
		int n = array.length;
		
		for(j = 1; j < n; j++) {
			key = array[j];
			i = j - 1;
			while(i >= 0 && array[i] < key) {
				array[i + 1] = array[i];
				i = i - 1;
			}
			array[i + 1] = key;
		}
		
	}
	

	public int indexOf(int value, int[] array) {
			
			int i;
			int n = array.length;
			
			for(i = 0; i < n; i++) {
				if(value == array[i]) return i;
			}
			
			throw new RuntimeException("Valor não encontrado");
			
		}
	
}
