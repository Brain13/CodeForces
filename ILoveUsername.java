// 155A - I_love_%username%
import java.util.*;
public class ILoveUsername {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int contests = input.nextInt();
        
        int max = input.nextInt();
        int min = max;
        int amazing = 0;
        
        for (int i = 1; i < contests; ++i) {
            int t = input.nextInt();
            if (t > max) {
                max = t;
                ++amazing;
            }
            else if (t < min) {
                min = t;
                ++amazing;
            }
        }
        System.out.println(amazing);
    }
}
