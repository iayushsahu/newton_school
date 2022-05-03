import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Finding_roots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        int flag = 0;
        double r1, r2, d, real, imag;
        if (a != 0) {
            d = b * b - 4 * a * c;
            if (d > 0) {
                flag = 1;
            } else if (d < 0) {
                flag = 2;
            } else {
                flag = 3;
            }
            switch (flag) {
                case 1:
                    r1 = -b / (2 * a) + Math.sqrt(d) / (2 * a);
                    r2 = -b / (2 * a) - Math.sqrt(d) / (2 * a);
                    System.out.printf("%.2f", r1);
                    System.out.println();
                    System.out.printf("%.2f", r2);
                    System.out.println();
                    break;
                case 2:
                    real = -b / (2 * a);
                    imag = Math.sqrt(-d) / (2 * a);
                    System.out.printf("%.2f+i%.2f", real, imag);
                    System.out.println();
                    System.out.printf("%.2f-i%.2f", real, imag);
                    System.out.println();
                    break;
                case 3:
                    r1 = -b / (2 * a);
                    r2 = -b / (2 * a);
                    System.out.printf("%.2f", r1);
                    System.out.println();
                    System.out.printf("%.2f", r2);
                    System.out.println();
                    break;
                // default:
                // System.out.println(" linear equaTION");
                // break;
            }
        }
    }
}
