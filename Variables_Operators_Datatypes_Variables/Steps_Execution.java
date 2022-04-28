package Variables_Operators_Datatypes_Variables;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Steps_Execution {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n += 8;
        n /= 3;
        n %= 5;
        n *= 5;
        System.out.println(n);
    }
}
