package binary_sum;

public class BinarySum {

	public static int[] sumOf(int[] a, int[] b) {
		

      int[] c = new int[a.length + 1];     
      int i = a.length - 1;
      
      while (i >= 0){ 
          c[i + 1] += a[i] + b[i];
          if(c[i + 1] > 1) {
        	  if(c[i + 1] %2 == 0) {
        		  c[i + 1] = 0;
        	  } else {
        		  c[i + 1] = 1;
        	  }
        	  c[i] = 1;
          }
          i--; 
      } 
        
		return c;	
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {0,0,1,1,1,1,1,0,0,0,1};
		int[] b = {1,0,1,0,1,1,0,0,0,1,1};
		
		printArray(a);
		System.out.println();
		printArray(b);
		System.out.println();
		
		printArray(sumOf(a, b));
		
		
	}
	
	static void printArray(int[] array) {
		int n = array.length;
		
		for(int i : array) System.out.print(i);
	}
	
	
}
