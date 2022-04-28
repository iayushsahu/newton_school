package Variables_Operators_Datatypes_Variables_Operators;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Area_of_Square {

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println(area);

    }
}
