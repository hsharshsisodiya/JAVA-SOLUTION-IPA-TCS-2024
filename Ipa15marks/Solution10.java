/* Find number of upper case in a string
 * AriJIt = 3
 */
import java.util.*;
public class Solution10 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i)))
            count++;
        }
        System.out.println(count);
    }
}
