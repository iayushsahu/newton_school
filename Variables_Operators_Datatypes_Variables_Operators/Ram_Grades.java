package Variables_Operators_Datatypes_Variables_Operators;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Ram_Grades {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int percentage = (((a + b + c + d) / 4) * 100) / 100;
        System.out.println(percentage);
    }
}
