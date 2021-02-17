package permute_by_sorting;

import static util.Util.printArray;

import java.util.Random;;

public class PermuteBySortingTest {

	public static void main(String[] args) {
		
		int tamanhoDaAmostra = 1000;
		int[] array = new int[tamanhoDaAmostra];
		Random random = new Random();
		
		for(int i = 0; i < tamanhoDaAmostra; i++) {
			array[i] = random.nextInt(100 - 0) - 1;
		}
		
		
		long startTime = System.currentTimeMillis();
		PermuteBySorting.shuffle(array);
		long endTime = System.currentTimeMillis();
		
		long tempoDecorrido = endTime - startTime;
		
		printArray(array);
		System.out.println();
		System.out.println(String.format("Tempo de execução: %s ms para %s elementos",
				tempoDecorrido, array.length));
		
	}
	
}
