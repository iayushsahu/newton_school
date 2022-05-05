import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		int sum = 0;  
		Scanner sc=new Scanner(System.in); 
		int n = sc.nextInt(); 
		int[] arr = new int[n]; 
		
		for(int i=0; i<n; i++){ 
			arr[i]=sc.nextInt(); 
			sum = sum + arr[i];
		}
			System.out.print(sum);
	}
}