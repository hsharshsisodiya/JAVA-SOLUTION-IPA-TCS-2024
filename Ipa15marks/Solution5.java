/* Find total occurance of a character in a string
    Input
    --------------
 *  Priyanka
 *  a
 
 *  Output
    ----------------
 *  2
 */

import java.util.Scanner;
public class Solution5 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == c ){
                count++;
            }
        }
        if(count > 0)
        System.out.println(count);
        else
        System.out.println("No character in this String.");
    }
}
