package bubblesort;

public abstract class BubbleSort {

	public static void sort(int[] A) {
		
		int n = A.length - 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = n; j > i; j--) {
				if(A[j] < A[j - 1]) {
					int key = A[j];
					A[j] = A[j - 1];
					A[j - 1] = key;	
				}
			}
							
		}
		
	}
	
public static void reverseSort(int[] A) {
		
		int n = A.length - 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = n; j > i; j--) {
				if(A[j] >= A[j - 1]) {
					int key = A[j];
					A[j] = A[j - 1];
					A[j - 1] = key;	
				}
			}
							
		}
		
	}
	 
	
}
