import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Checking_a_Number {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int Numip = sc.nextInt();
        int number = 0;
        if (Numip > 0) {
            number = 1;
        } else if (Numip < 0) {
            number = 2;
        } else {
            number = 3;
        }

        switch (number) {
            case 1:
                System.out.println("Positive");
                break;
            case 2:
                System.out.println("Negative");
                break;
            case 3:
                System.out.println("Zero");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
