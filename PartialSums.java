// 223C - Partial Sums
import java.util.*;
public class PartialSums {
    public static void main(String[] args) {
    
        long div = 1000000007;
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        
        long[] ar = new long[n];
        for (int i = 0; i < n; ++i) {
            ar[i] = input.nextLong();
        }
    
        for (int j = 0; j < k; ++j) {
            long sum = 0;
            for (int i = 0; i < n; ++i) {
                sum += ar[i];
                ar[i] = sum % div;
            }
        }
        
        System.out.print(ar[0]);
        for (int i = 1; i < n; ++i) {
            System.out.print(" " + ar[i]);
        }
        System.out.println();
    }
}
