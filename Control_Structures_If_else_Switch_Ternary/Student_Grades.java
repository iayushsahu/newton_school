import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Student_Grades {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        int marks = (((sub1 + sub2 + sub3 + sub4 + sub5) / 5) * 100) / 100;
        if (marks >= 1 && marks <= 100) {
            if (marks >= 80) {
                System.out.println("A");
            } else if (marks < 80 && marks >= 60) {
                System.out.println("B");
            } else if (marks < 60 && marks >= 40) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        }
    }
}
