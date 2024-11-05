/* Find number of lower case in a string
 * AriJIt = 3
 */

import java.util.*;
public class Solution9 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        // for(int i=0;i<str.length();i++){
        //     if(Character.isLowerCase(str.charAt(i)))
        //     count++;
        // }
        for(char ch : str.toCharArray()){
            if(Character.isLowerCase(ch))
            count++;
        }
        System.out.println(count);
    }
}
