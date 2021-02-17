package permute_without_identity;

import static util.Util.printArray;

import java.util.Random;

import randomize_in_place.RandomizeInPlace;

public class PermuteWithAllTest {

public static void main(String[] args) {
		
//		int tamanhoDaAmostra = 1000;
//		int[] array = new int[tamanhoDaAmostra];
//		Random random = new Random();
//		
//		for(int i = 0; i < tamanhoDaAmostra; i++) {
//			array[i] = random.nextInt(100 - 0) - 1;
//		}
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
	
		long startTime = System.currentTimeMillis();
		PermuteWithAll.shuffle(array);
		long endTime = System.currentTimeMillis();
		
		long tempoDecorrido = endTime - startTime;
		
		
		
		printArray(array);
		
		System.out.println();
		System.out.println(String.format("Tempo de execução: %s ms para %s elementos",
				tempoDecorrido, array.length));
	}
	
}
