/* Find the palindrome words from the sentence and print them and also count
 * 
 * Input:
 * ----------------
 * My name is nitin and I can speak malayalam
 * 
 * Output:
 * ----------------
 * nitin
 * I
 * malayalam
 * 3
 */

import java.util.*;
public class Solution35 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String []arr = str.split(" ");
        int count = 0;
        for(int i=0;i<arr.length;i++){
            String temp = "";
            for(int j=arr[i].length()-1;j>=0;j--){
                temp += arr[i].charAt(j);
            }
            if(arr[i].equalsIgnoreCase(temp)){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println(count);

    }
}
