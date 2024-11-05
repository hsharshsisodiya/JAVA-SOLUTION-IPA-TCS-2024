/*Count the number of words in a sentence that contain at least two consecutive vowels (a, e, i, o, u) in them.
Here's a sample input and output:

Input: I enjoy eating spaghetti and meatballs for dinner
Output: 2

Explanation: There are two words in the sentence that contain at least two consecutive vowels - "enjoy" and "meatballs".
 */

import java.util.Scanner;
public class Solution7 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String []arr = str.split(" ");
        int count = 0;
        for(int i=0;i<arr.length;i++){
            String temp = arr[i].toLowerCase();
            for(int j=0;j<temp.length()-1;j++){
                if(temp.length() > 1){
                char ch = temp.charAt(j);
                char ch1 = temp.charAt(j+1);
                if((ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch=='u') &&
                (ch1 == 'a' || ch1 == 'e' || ch1 =='i' || ch1 == 'o' || ch1=='u') ){
                    count++;
                    break;
                }
                }
            }
        }
        System.out.println(count);
    }
}
