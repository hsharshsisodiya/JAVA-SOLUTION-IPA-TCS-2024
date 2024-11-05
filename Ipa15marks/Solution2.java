/* Find average of a number array between two limit numbers (except the two numbers)
 * Input
 * ---------------
 *  5
    1 
    2
    3
    4
    5
 *  1
 *  4
 * 
 * Output
 * ---------------
 * 2
 */

import java.util.Scanner;
public class Solution2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int start = sc.nextInt();
        int last = sc.nextInt();

        int ans = calAvg(arr, start, last);
        System.out.println(ans);

    }
    public static int calAvg(int []arr , int start, int last){
        int sum = 0;
        int count = 0;
        for(int i=start-1;i<last;i++){
            sum += arr[i];
            count++;
        }
        return sum/count;
    }
}
