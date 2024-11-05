/* Count number of spaces and characters in a string 
 * Input
 * ---------
 * Arijit is bad boy
 * 
 * Output
 * ------------------
 * Number of space : 3
   Number of character : 14
*/
import java.util.*;
public class Solution51 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sp = 0;
        int ch = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                sp++;
            }
            else{
                ch++;
            }
        }
        System.out.println("Number of space : "+sp);
        System.out.println("Number of character : "+ch);
    }
}
