import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class If_Leap_year {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean leap = false;

        if (N % 4 == 0) {

            if (N % 100 == 0) {
                if (N % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            else
                leap = true;
        }

        else
            leap = false;

        if (leap)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
