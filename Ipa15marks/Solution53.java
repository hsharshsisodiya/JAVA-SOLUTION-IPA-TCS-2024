/* Write a function that takes a list of numbers as input and returns the sum of all the even numbers in the list.

For example:

Enter size of Array: 4
Create an array:
10 15 20 25
The array is: [10, 15, 20, 25]
Sum of even numbers in the array: 30

 */
import java.util.*;
public class Solution53 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = evenSum(num);
        System.out.println("Sum of even numbers in the array: "+ans);
    }
    public static int evenSum(int num){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[num];
        int sum = 0;
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
