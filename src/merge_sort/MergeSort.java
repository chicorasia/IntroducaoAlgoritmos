package merge_sort;

import java.util.Arrays;

public class MergeSort {
	
	public void mergeSort(int[] a, int p, int r) {
		
		if(p < r) {
			int q = (p + r) / 2; 
			mergeSort(a,  p, q);
			mergeSort(a,  q + 1, r);
			merge(a,p,q,r);
			
		}
		
	}
	
	public void merge(int[] a, int p, int q, int r) {
		
		int n1 = q - p + 1;
		int n2 = r - q;
		
		int[] leftArray = new int[n1 + 1];
		int[] rightArray = new int[n2 + 1];
		
		for(int i = 0; i < n1; ++i) {
			leftArray[i] = a[p + i];
		}
		for(int j = 0; j < n2; ++j) {
			rightArray[j] = a[q + j + 1];
		}
		
		leftArray[n1] = (int) Double.POSITIVE_INFINITY;
		rightArray[n2] = (int) Double.POSITIVE_INFINITY;
		
		int i = 0;
		int j = 0;
		
		for(int k = p; k <= r; k++){
			if(leftArray[i] <= rightArray[j]) {
				a[k] = leftArray[i];
				i++;
			} else {
				a[k] = rightArray[j];
				j++;
			}
		}
		
	}

}
