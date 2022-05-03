import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Logical_operators {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a <= 10) && (b >= 10)) {
            System.out.print("true ");
        } else {
            System.out.print("false ");
        }
        if ((a % 2 == 0) || (b % 2 == 0)) {
            System.out.print("true ");
        } else {
            System.out.print("false ");
        }
        if (a != b) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
