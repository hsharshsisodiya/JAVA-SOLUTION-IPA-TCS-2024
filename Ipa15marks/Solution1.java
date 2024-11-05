/*Write a Java program to check if a given number is an Armstrong number or not.

Here's an example of the expected input and output:

Input number: 153
Output: "Yes, the number is an Armstrong number."

*/

import java.util.*;
public class Solution1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = checkArmstrong(num);
        if(ans == true)
        System.out.println("Yes, the number is an Armstrong number.");
        else
        System.out.println("No, the number is not an Armstrong number.");


    }
    public static boolean checkArmstrong(int num){
        int num1 = num;
        int count = 0;
        while(num1 != 0){
            int temp = num1%10;
            count++;
            num1 /= 10;
        }
        num1 = num;
        double sum = 0;
        while(num1 != 0){
            int temp = num1%10;
            sum += Math.pow(temp, count);
            num1 /= 10;
        }

        if(sum == num)
        return true;
        else 
        return false;
    }
}
