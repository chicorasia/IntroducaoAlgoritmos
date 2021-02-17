package merge_sort;

public class MergeSortTeste {

	static void printArray(int[] array) {
		int n = array.length;
		
		for(int i : array) System.out.print(i + ", ");
	}
	
	public static void main(String[] args) {
		
		int[] array = {10,80,50,60,70,90,30,40};
		
//		Random random = new Random();
		
//		for(int i = 0; i < 100; i++) {
//			array[i] = Math.random.ne
//		}
		
		MergeSort mergeSort = new MergeSort();
		
		mergeSort.mergeSort(array, 0, array.length -1);
		
		printArray(array);
		
		
	}
	
}
