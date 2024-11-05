/*
 * You are given a string S consisting of lowercase letters. Your task is to remove all the consecutive duplicates from
 * the string and output the result. For example, if the input string is "abbcddeff", the output should be "abcdef".
 * 
 * Input: abbcddeff
 * Output: abcdef
 */

import java.util.*;
public class Solution41 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList <Character> list = new ArrayList<>();
        String ans = "";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i) != str.charAt(i+1)){
                ans += str.charAt(i);
            }
            if(str.length()-2 == i && str.charAt(i) != str.charAt(str.length()-1)){
                ans += str.charAt(str.length()-1);
            }
            if(str.length()-2 == i && str.charAt(i) == str.charAt(str.length()-1))
            ans += str.charAt(str.length()-1);
        }
        System.out.println(ans);
    }
}
