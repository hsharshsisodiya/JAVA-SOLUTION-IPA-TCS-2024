//a2b3c1 = aabbbc

import java.util.*;
public class Solution43 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        for(int i=0;i<str.length()-1;i=i+2){
            int count = Character.getNumericValue(str.charAt(i + 1)); // Convert char to int
            for(int j=0;j<count;j++){
                ans += str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
