package random_sample;

import util.Util;

public class RandomSampleTest {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		int[] sample = RandomSample.randomSample(1,10);
		
		Util.printArray(sample);
		
		
		
	}
	
}
