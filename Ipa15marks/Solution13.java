/* Count number of prime digit in a Number 
 * Input : 254786135
 * Output : 5
*/

import java.util.Scanner;
public class Solution13 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        // while(num > 0){
        //     int temp = num%10;
        //     if(temp == 2 || temp == 3 || temp == 5 || temp == 7 || temp == 9)
        //     count++;
        //     num /= 10;
        // }
        while(num > 0){
            int temp = num%10;
            boolean cheack = true;
            for(int i=2;i<=temp/2;i++){
            if(temp%i == 0){
                cheack = false;
                break;
            }
            }
            if(cheack == true)
            count++;
            num /= 10;
        }
        System.out.println(count);
    }
}
