package Variables_Operators_Datatypes_Variables_Operators;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Data_types {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        long l = sc.nextLong();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        char c = sc.next().charAt(0);

        System.out.println(i);
        System.out.println(l);
        System.out.printf("%.2f", f);
        System.out.println();
        System.out.printf("%.4f", d);
        System.out.println();
        System.out.println(c);
    }
}
