package binary_search;

public class TesteBinarySearch {

	public static void main(String[] args) {
		
		int[] array = {4,3,1,2,0,0,0,0,0,0};
		
		BinarySearch binarySearch = new BinarySearch();
		
		
		int v = 5;
		System.out.println(binarySearch.binarySearch(array, v, 0, array.length - 1));
		
		int[] array2 = {1,2,3,4};
		System.out.println(binarySearch.indexOf(array2, 5, 0, array2.length - 1));
		
	}
	
}
