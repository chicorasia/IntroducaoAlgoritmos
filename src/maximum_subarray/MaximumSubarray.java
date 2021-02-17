package maximum_subarray;

public class MaximumSubarray {

	public int[] findMaxCrossingSubarray(int[] A, int low, int mid, int high) {
		
		int leftSum = (int) Double.NEGATIVE_INFINITY;
		int sum = 0;
		int maxLeft = 0;
		int maxRight = 0;
		
		for(int i = mid; i >= low; i--) {
			sum += A[i];
			if(sum > leftSum) {
				leftSum = sum;
				maxLeft = i;
			}
		}
		
		int rightSum = (int) Double.NEGATIVE_INFINITY;
		sum = 0;
		
		for(int j = mid + 1; j <= high; j++) {
			sum += A[j];
			if(sum > rightSum) {
				rightSum = sum;
				maxRight = j;
			}
		}
		
		int[] tuple = {maxLeft, maxRight, leftSum + rightSum};
		
		return tuple;
		
	}
	
	public int[] findMaximumSubarray(int[] A, int low, int high) {
		
		int[] leftTuple, rightTuple, crossTuple;
		
		if(high == low) {
			int[] tuple = {low, high, A[low]};
			return tuple;
		}
//		} else if(high - low < 255) {
//			return new BruteForceMaximumSubarray().findMaximumSubarray(A, low, high);
//		}
		else {
			int mid = (low + high) / 2;
			//leftLow, leftHigh, leftSum
			leftTuple = findMaximumSubarray(A, low, mid);
//			rightLow, rightHigh, rightSum
			rightTuple = findMaximumSubarray(A, mid + 1, high);
//			crossLow, crossHigh, crossSum
			crossTuple =
					findMaxCrossingSubarray(A, low, mid, high);
		}
		
		if(leftTuple[2] >= rightTuple[2] && leftTuple[2] >= crossTuple[2])
			return leftTuple;
		else if(rightTuple[2] >= leftTuple[2] && rightTuple[2] >= crossTuple[2])
			return rightTuple;
		else return crossTuple;
	
		
	}
	
}
