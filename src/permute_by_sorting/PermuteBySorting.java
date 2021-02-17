package permute_by_sorting;

import java.util.Random;

public abstract class PermuteBySorting {

	static void shuffle(int[] A) {
		
		int n = A.length;
		int[] P = new int[n];
		
		Random random = new Random();
		
		for(int i = 0; i < n; i++) {
			P[i] = random.nextInt(n*n*n - 0);
			System.out.print(P[i] + ", ");
			
		}
		System.out.println("\n **** \n ");
		
		//usando o BubbleSort para ordenar A[] de acordo com P[] e reordenar P[]
		for(int i = 0; i < n; i++) {
			for(int j = n - 1; j > i; j--) {
				if(P[j] < P[j - 1]) {
					int key = A[j];
					A[j] = A[j - 1];
					A[j - 1] = key;
					
					int idx = P[j];
					P[j] = P[j - 1];
					P[j - 1] = idx;
				}
			}
							
		}
	
	}
	
}


