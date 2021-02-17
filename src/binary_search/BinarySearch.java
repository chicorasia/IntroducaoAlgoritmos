package binary_search;

import merge_sort.MergeSort;

public class BinarySearch {
	
	public boolean binarySearch(int[] a, int v, int p, int r) {
		
		new MergeSort().mergeSort(a, p, r);
		if(p <= r) {
			int q = (p + r) /2;
			if(v == a[q])
				return true;
			if(v > a[q]) {
				return binarySearch(a, v, q + 1, r);
			}
			if(v < a[q]) {
				return binarySearch(a, v, p, q);
			}
		}
		
		return false;
	}
	
public int indexOf(int[] a, int v, int p, int r) {
		
		new MergeSort().mergeSort(a, p, r);
		if(p <= r) {
			int q = (p + r) /2;
			if(v == a[q])
				return q;
			if(v > a[q]) {
				return indexOf(a, v, q + 1, r);
			}
			if(v < a[q]) {
				return indexOf(a, v, p, q);
			}
		}
		
		return -1;
	}
	
	
	
}
