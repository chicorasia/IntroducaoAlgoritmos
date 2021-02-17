package insertion_sort;

public class FindIndexOf {

	public int indexOf(int[] array, int value) {
		
		int i = 0;
		int n = array.length;
		
		for(i = 0; i < array.length ; ++i) {
			int j = array[i];
			if(value == j) {
				return i;
			}
		}
		
		return 0;
		
	}
	
}
