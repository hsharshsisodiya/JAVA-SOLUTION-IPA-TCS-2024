/* Find largest word from a given sentence
 * 
 Input: He is so funny boy
 Output: funny
 */

import java.util.*;
public class Solution25 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String []arr = str.split(" ");
        int max = 0;
        String large = "";
        for(int i=0;i<arr.length;i++){
            if(max < arr[i].length()){
                max = arr[i].length();
                large = arr[i];
            }
        }
        System.out.println(large);
    }
}
