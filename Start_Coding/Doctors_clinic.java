import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Doctors_clinic {
    public static void main(String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            if ((n == 0) || (x > 10)) {
                System.out.println(0);
            } else {
                int waiting = (n - 1) * 10 - (n - 1) * x;
                System.out.println(Math.abs(waiting));
            }
        }
    }
}
