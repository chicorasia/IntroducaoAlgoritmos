package permute_without_identity;

import java.util.Random;

public abstract class PermuteWithAll {
	
	static void shuffle(int[] A) {
		
		int n = A.length;
		int key, idx;
		
		Random random = new Random();
		
		for(int i = 0; i < n; i++) {
			key = A[i];
			idx = random.nextInt(n);
			A[i] = A[idx];
			A[idx] = key;
			
		}
		
	}

}
