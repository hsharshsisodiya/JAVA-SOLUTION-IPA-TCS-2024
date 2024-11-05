/* Find the Maximum Ascii valued character in a String
 * Arijit = t
 * priyanka = y
 * Aa = a
 */
import java.util.*;
public class Solution29 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max = 0;
        char ch = ' ';
        for(int i=0;i<str.length();i++){
            if(max < (int)str.charAt(i)){
                max = (int)str.charAt(i);
                ch = str.charAt(i);
            }
        }
        System.out.println(ch);
    }
}
