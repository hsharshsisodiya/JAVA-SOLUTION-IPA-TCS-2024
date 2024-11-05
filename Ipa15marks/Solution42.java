/* Remove a character from a string
 * Input
 * --------------
 * Arijit
 * i
 * Output
 * ---------------
 * Arjt
 */

import java.util.*;
public class Solution42 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char chOut = sc.next().charAt(0);
        String ans = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != chOut){
                ans += str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
