package maximum_subarray;

public class BruteForceMaximumSubarray {

	public int[] findMaximumSubarray(int[] A, int low, int high) {
		
		if(low == high) {
			int[] tuple = {low, high, A[low]};
			return tuple;
		}
		
		int indexStart = 0;
		int indexEnd = 0;
		
		int sum = 0;
		int maxSum = 0;
			
		for(int i = low; i <= high; i++) {
			sum = 0;
			sum += A[i];
			for(int j = i + 1; j <= high; j++) {
				sum += A[j];	
				if(sum > maxSum) {
					maxSum = sum;
					indexEnd = j;
					indexStart = i;
				}
			}
			
//			System.out.println("maxSum: " + maxSum);
			}
			
		
		int[] tuple = {indexStart, indexEnd, maxSum};
		return tuple;
		
	}
	
}
