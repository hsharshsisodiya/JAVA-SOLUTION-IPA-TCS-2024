/* Last Character of each word of a sentence

 * Input: Kalyani Government Engineering College
 * Output: itge
 */
import java.util.*;
public class Solution26 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String []arr = str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i].charAt(arr[i].length()-1));
        }
    }
}
