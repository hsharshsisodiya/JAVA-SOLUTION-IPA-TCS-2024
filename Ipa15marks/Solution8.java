/* Find the characters in odd position of a string which are consonent
 * 
 * Input: Arijit Ghosh
 * Output: hs
 */
import java.util.Scanner;
public class Solution8 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char []arr = {'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<str.length();i++){
            boolean cheack = true;
            for(int j=0;j<arr.length;j++){
                if((i+1)%2==0 || str.charAt(i) == arr[j] || str.charAt(i) == ' '){
                    cheack = false;
                }
            }
            if(cheack == true)
            System.out.print(str.charAt(i));
        }
    }
}
