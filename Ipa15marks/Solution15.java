/* Count number of even digit in a number
 * If the count greater than or equal to 3, then print "True" otherwise "False"
 */
import java.util.Scanner;
public class Solution15 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while(num > 0){
            int temp = num%10;
            if(temp%2 == 0)
            count++;
            num /= 10;
        }
        if(count >= 3)
        System.out.println("True");
        else
        System.out.println("False");

    }
}
