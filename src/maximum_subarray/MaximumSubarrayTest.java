package maximum_subarray;

import java.util.Random;

public class MaximumSubarrayTest {
	
	public static void printArray(int[] array) {
		for(int i : array) {
			System.out.println(i + ", ");
		}
	}
	
	public static void main(String[] args) {
		
		MaximumSubarray maximumSubarray = new MaximumSubarray();
		
		Random random = new Random();
		int sampleSize = 100;
		int[] randomArray = new int[sampleSize];
		
		for(int i = 0; i < sampleSize; i++) {
			randomArray[i] = random.nextInt(100 - 0) - 25;
		}
		
		long startTime = System.currentTimeMillis();
		int[] divideTuple = maximumSubarray.
				findMaximumSubarray(randomArray, 0, randomArray.length - 1);
		long endTime = System.currentTimeMillis();
		
		long divideTime = endTime - startTime;
			
		printArray(divideTuple);
		System.out.println("Divide and Conquer: " + divideTime + " ms");
		System.out.println("*******");
		
		
		BruteForceMaximumSubarray bruteMaxSubarray = new BruteForceMaximumSubarray();
		
		
		
		
		startTime = System.currentTimeMillis();
		int[] bruteTuple = bruteMaxSubarray.findMaximumSubarray(randomArray, 0, 
				randomArray.length - 1);
		endTime = System.currentTimeMillis();
		
		long bruteForceTime = endTime - startTime;
		
		printArray(bruteTuple);
		System.out.println("Brute force: " + bruteForceTime + " ms");
		System.out.println("*******");
		
		System.out.println(divideTime >= bruteForceTime);
		
		int[] exemplo = {10, 20, -30, 50, -20, -10, 80, 20};
		int[] tuple = maximumSubarray.findMaximumSubarray(exemplo, 0, exemplo.length - 1);
		
		printArray(tuple);
		
	}
	
}
