/*Count the number of words in a sentence that start and end with the same letter.

Input: Anna asked about the Ginseng recipe
Output: 2

Explanation: There are two words in the sentence that start and end with the same letter - "Anna" and "Ginseng". */
import java.util.*;
public class Solution47 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String []arr = str.split(" ");
        int count = 0;
        for(int i=0;i<arr.length;i++){
            String temp = arr[i];
            if(temp.charAt(0) == temp.charAt(temp.length()-1)){
                count++;
            }
        }
        if(count>0)
        System.out.println(count);
        else
        System.out.println("No Word Found!!");
    }
}
