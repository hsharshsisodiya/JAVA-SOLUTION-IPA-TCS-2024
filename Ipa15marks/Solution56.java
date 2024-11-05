/* Write a Java program to find the sum of all even numbers in an array of integers.

Here's an example of the expected input and output:

Input array: {10, 5, 20, 8, 13}
Output: 
Sum of even numbers: 38

*/
import java.util.*;
public class Solution56 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0)
            sum += arr[i];
        }
        System.out.println("Sum of even numbers:"+sum);
    }  
}
