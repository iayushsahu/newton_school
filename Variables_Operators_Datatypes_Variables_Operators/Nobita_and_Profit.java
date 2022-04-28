package Variables_Operators_Datatypes_Variables_Operators;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Nobita_and_Profit {
    public static void main(String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int S = sc.nextInt();
        int profit = S - C;
        System.out.println(profit);
    }

}