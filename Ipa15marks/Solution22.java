/* Find the index number of a character in a String
 * Input1 :
 --------------
  Carrot
  a
 
 * Output:
 ---------------
   1

 * Input2:
 ----------------
   Carrot
   z

 * Output:
  --------------
   NA
 */

import java.util.*;
public class Solution22 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        boolean c = false;
        for(int i=0;i<str.length();i++){
          if(str.charAt(i)==ch){
            System.out.println(i);
            c = true;
            break;
          }
        }
        if(c == false)
        System.out.println("NA");
    }
}
