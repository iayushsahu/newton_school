package Variables_Operators_Datatypes_Variables;

import java.io.*;
import java.util.*;

public class Magic_trick {
    public static void main(String[] args) {
        // Your code here
        int X = 10;
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 3
        int B = sc.nextInt(); // 4
        int add = X + A; // 13
        int dbl = 2 * add; // 26
        int add2 = dbl + B; // 30
        int half = add2 / 2; // 15
        int result = half - X; // 5

        System.out.println(result);
    }
}
