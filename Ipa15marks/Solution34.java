/* Take a number. If it odd then reverse it, otherwise print "Can not reverse"
 * 
 * Input : 123
 * Output : 321
 * 
 * Input : 234
 * Output : Can not reverse
 */

import java.util.*;
public class Solution34 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;
        if(num%2 == 0)
        System.out.println("Can not reverse");
        else{
            while(num > 0){
                int temp = num%10;
                ans = ans*10+temp;
                num = num/10;
            }
            System.out.println(ans);
        }
    }
}
