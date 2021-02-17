package util;

public abstract class Util {

	public static void printArray(int[] array) {
		for(int i : array) {
			System.out.print(i + ", ");
		}
	}

	public static int maximum(int[] array){

		int maximum = (int) Double.NEGATIVE_INFINITY;

		for(int i : array){
			if(i > maximum){
				maximum = i;
			}
		}

		return maximum;
	}
	
}
