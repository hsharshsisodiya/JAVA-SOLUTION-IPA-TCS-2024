/* Minimum Ascii valued character in a String */
import java.util.*;
public class Solution49 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int min = Integer.MAX_VALUE;
        char c = ' ';
        for(int i=0;i<str.length();i++){
            if(min > str.charAt(i)){
                min = str.charAt(i);
                c = str.charAt(i);
            }
        }
        System.out.println(c+" "+min);
    }
}
