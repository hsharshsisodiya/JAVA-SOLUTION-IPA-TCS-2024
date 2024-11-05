/* Remove duplicate characters in a string
 * 
 * Input : Arijit Ghosh
 * Output : Arijt Ghos
 */

import java.util.*;
public class Solution39 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Character> list = new ArrayList<>();
        String str = sc.nextLine();
        String ans = "";
        for(char ch : str.toCharArray()){
            if(!list.contains(ch)){
                list.add(ch);
                ans += ch;
            }
        }
        System.out.println(ans);
    }
}
