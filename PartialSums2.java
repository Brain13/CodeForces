// 223C - Partial Sums
import java.util.*;
import java.math.BigInteger;
public class PartialSums2 {
    public static void main(String[] args) {
    
        long div = 1000000007;
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        
        BigInteger[] ar = new BigInteger[n];
        for (int i = 0; i < n; ++i) {
            ar[i] = BigInteger.valueOf(input.nextLong());
        }
        BigInteger[] m = new BigInteger[n];
        m[0] = BigInteger.ONE;
System.out.println(m[0]);
        BigInteger bigk = BigInteger.valueOf(k);
        BigInteger bigL = BigInteger.valueOf(div);
        for (BigInteger i = BigInteger.ONE; i.intValue() < n; i = i.add(BigInteger.ONE)) {
            int t = i.intValue();
            m[t] = m[t - 1].multiply(bigk.add(i).subtract(BigInteger.ONE)).divide(i);
System.out.println(m[t]);
        }
        
        BigInteger[] s = new BigInteger[n];
        for (int i = 0; i < n; ++i) {
            s[i] = BigInteger.ZERO;
            for (int j = 0; j <= i; ++j) {
                s[i] = s[i].add(ar[i - j].multiply(m[j]));
                //System.out.println(s[i]);
            }
            s[i] = s[i].mod(bigL);
            //System.out.println();
        }
        
        System.out.print(s[0]);
        for (int i = 1; i < n; ++i) {
            System.out.print(" " + s[i]);
        }
        System.out.println();
    }
}
