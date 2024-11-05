/* Remove Vowel From A String 

 * Input : Arijit Ghosh
 * Output : rjt Ghsh
 */

import java.util.*;
public class Solution40 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        for(char ch : str.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch == 'U');
            else
            ans += ch;
        }
        System.out.println(ans);
    }
}
