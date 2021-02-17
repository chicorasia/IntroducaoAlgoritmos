package random_sample;

import java.util.Random;

public abstract class RandomSample {
	
	static int[] randomSample(int m, int n) {
		
		if(m == 0) return new int[0];
		else {
			Random rand = new Random();
			int[] S = randomSample(m - 1, n - 1);
			int i = rand.nextInt(n) - 1;
			if(isContained(i, S)) {
				S = unionOf(S, n);
			} else {
				S = unionOf(S, i);
			}
			return S;		
		}
		
	}
	
	static boolean isContained(int i, int[] A) {
		for(int j = 0; j < A.length; j++) {
			if(i == A[j]) return true;
		}
		return false;
		
	}
	
	static int[] unionOf(int[] A, int[] B) {
		
		int n = A.length + B.length;
		int[] union = new int[n];
		
		for(int i = 0; i < A.length; i++) {
			union[i] = A[i];
		}
		for(int j = 0; j < B.length; j++) {
			union[A.length + j] = B[j];
		}
		
		return union;
		
	}
	
	static int[] unionOf(int[] A, int b) {
			
			int n = A.length + 1;
			int[] union = new int[n];
			
			for(int i = 0; i < A.length; i++) {
				union[i] = A[i];
			}
			
			union[union.length - 1] = b;
			
			return union;
			
		}

}
