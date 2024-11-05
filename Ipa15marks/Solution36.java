/* Check a string is palindrome or not
 * Input: pop
 * Output: Palindrome
 * 
 * Input: Papa
 * Output: None
 */

import java.util.*;
public class Solution36 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp = "";
        for(int i=str.length()-1;i>=0;i--){
            temp += str.charAt(i);
        }
        if(str.equalsIgnoreCase(temp))
        System.out.println("Palindrome");
        else
        System.out.println("None");
    }
}
