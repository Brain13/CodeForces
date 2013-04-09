// 5C - Longest Regular Bracket Sequence
import java.util.*;
public class LongRegBrackSeq {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        String paren = input.nextLine();
        int p = 0;
        int length = 0;
        int maxLength = 0;
        int count = 0;
        for (int i = 0; i < paren.length(); ++i) {
            char c = paren.charAt(i);
            // add the ( or )
            if (c == '(') {
                ++p;
            }
            else {
                --p;
                if (p == -1) {
                    p = 0;
                    length = 0;
                }
                else {
                    length += 2;
                    if (length > maxLength) {
                        maxLength = length;
                        count = 1;
                    }
                    else if (length == maxLength) {
                        ++count;
                    }
                }
            }
            // check if still valid
            /*if (p  == -1) {
                p = 0;
                length = 0;
            }
            else if (p == 0) {
                ++length;
                if (length > maxLength) {
                    maxLength = length;
                    count = 1;
                }
                else if (length == maxLength) {
                    ++count;
                }
            }
            else {
                ++length;
            }*/
        }
        
        if (maxLength == 0)
            System.out.println("0 1");
        else
            System.out.println(maxLength + " " + count);
    }
}
