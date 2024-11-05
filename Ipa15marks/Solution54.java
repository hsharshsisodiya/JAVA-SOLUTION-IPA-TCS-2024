/* Count the sum of prime digits in a given number
 * 
 * Input: 2345678910
 * Output: 17
 * 
 * Explaination: 2+3+5+7 = 17
 */
import java.util.*;
public class Solution54 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(checkPrice(ch)){
                sum += Integer.parseInt(String.valueOf(ch));
            }
        }
        System.out.println("Prime Digits sum is: "+sum);
    }
    public static boolean checkPrice(char ch){
        int n = Integer.parseInt(String.valueOf(ch));
        if(n < 2)
        return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
