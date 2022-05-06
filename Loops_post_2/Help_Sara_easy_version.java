import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int sum(int a) {
        int plus = 0;
        while (a > 0) {
            plus = plus + a % 10;
            a = a / 10;
        }
        return plus;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int k = sum(n);
            n = n - k;
            count = count + 1;
        }
        System.out.print(count);
    }
}