/* Input : 123Arijit1998Arijit10

 * Process :
 * -----------
 * Array : [123, Arijit, 1998, Arijit, 10]
 * Now you should sum up the position of that array where numbers are stored.
 * 123 + 1998 = 2121
 * 
 * Output :
 * --------------
 * 2131
 */
import java.util.*;
public class Solution57 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        int temp = 0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                temp = temp*10+(Integer.parseInt(String.valueOf(str.charAt(i))));
            }
            else{
                sum += temp;
                temp = 0;
            }
        }
        System.out.println(sum);
    }
}
