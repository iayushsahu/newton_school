package Start_Coding;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class The_Dice_Problem {

    // don't change the name of this class
    // you can add inner classes if needed
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            int N = s.nextInt();
            if (N == 6) {
                System.out.println("1");
            } else if (N == 1) {
                System.out.println("6");
            } else if (N == 2) {
                System.out.println("5");
            } else if (N == 5) {
                System.out.println("2");
            } else if (N == 4) {
                System.out.println("3");
            } else {
                System.out.println("4");
            }
        }
    }
}
