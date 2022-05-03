import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Leap_Year {
    public static void main(String[] args) {
        // Capture the user's input
        Scanner scanner = new Scanner(System.in);
        // Storing the captured value in a variable
        int year = scanner.nextInt();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
