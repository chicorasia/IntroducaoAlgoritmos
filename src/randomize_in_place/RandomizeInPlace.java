package randomize_in_place;

import java.util.Random;

public abstract class RandomizeInPlace {
	
	static void shuffle(int[] A) {
		
		int n = A.length;
		int key, idx;
		
		Random random = new Random();
		
		for(int i = 0; i < n; i++) {
			key = A[i];
			idx = random.nextInt(n - i) + i;
			A[i] = A[idx];
			A[idx] = key;
			
		}
		
		
	}

}
