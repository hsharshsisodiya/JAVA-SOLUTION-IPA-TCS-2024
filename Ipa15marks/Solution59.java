/*
Problem Statement
Write a Java program to print the unique characters present in the given string in the same sequence as they appear(the first occurrence) in the input.

Note:
All the characters should be in lowercase only.

i/p -> 
xperience

o/p -> 
xperinc
*/
import java.util.*;
public class Solution59 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        ArrayList <Character> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(!list.contains(str.charAt(i))){
                list.add(str.charAt(i));
                ans += str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
