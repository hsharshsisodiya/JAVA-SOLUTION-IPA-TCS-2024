/* Reverse of a string
 * Arijit = tijirA
 */
import java.util.*;
public class Solution46 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // 1
        // StringBuilder sb = new StringBuilder();
        // for(int i=str.length()-1;i>=0;i--){
        //     sb.append(str.charAt(i));
        // }
        //2
        // sb.append(str);
        // sb.reverse();
        // 3
        // StringBuffer sbf = new StringBuffer(str);
        // sbf.reverse();
        //4
        String ans = "";
        char []arr = str.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            ans += arr[i];
        }
        System.out.println(ans);
    }
}
