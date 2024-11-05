/* Find Characters of a string at odd index
 * Arijit = rjt
 * priyanka = ryna
*/
import java.util.Scanner;
public class Solution4 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = "Arijit";
        System.out.println(oddString(str));
        String str1 = "priyanka";
        System.out.println(oddString(str1));


    }
    public static String oddString(String s){
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(i%2!=0){
                ans = ans+s.charAt(i);
            }
        }
        return ans;
    }
}
