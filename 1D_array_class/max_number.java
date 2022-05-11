import java.io.*; // for handling input/output 
import java.util.*; // contains Collections framework 

// don't change the name of this class 
// you can add inner classes if needed 
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(input.readLine());
            while (T-- > 0) {
                int N = Integer.parseInt(input.readLine());
                ArrayList<Integer> A = new ArrayList<>();
                String[] line = input.readLine().split("\\s+");

                for (int i = 0; i < N; i++) {
                    A.add(i, Integer.parseInt(line[i]));
                }
                int max = 0, max2 = 0, max3 = 0;
                for (int i = 0; i < N; i++) {
                    if (A.get(i) > max) {
                        max3 = max2;
                        max2 = max;
                        max = A.get(i);
                    } else if (A.get(i) > max2) {
                        max3 = max2;
                        max2 = A.get(i);
                    } else if (A.get(i) > max3) {
                        max3 = A.get(i);
                    }
                }
                System.out.println(max + " " + max2 + " " + max3);
            }
        } catch (Exception e) {
            return;
        }
    }
}