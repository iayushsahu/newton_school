import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Resistors {

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int resistors = sc.nextInt();
        int finalresistance = 0;
        for (int i = 0; i < resistors; i++) {
            int resistance = sc.nextInt();
            finalresistance += (1 / resistance);
        }
        int ans = (1 / finalresistance);
        System.out.println(ans);
    }
}

// it get some unwanted ERROR
// so i have convert JAVA code into CPP