import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Tic_Tac_Toe {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);

        if (ch1 == 'R' || ch2 == 'R') {
            System.out.println('R');
        } else {
            if (ch1 == 'J') {
                System.out.println(ch2);
            } else {
                if (ch2 == 'J') {
                    System.out.println(ch1);
                } else {
                    System.out.println('D');
                }
            }
        }
    }
}
