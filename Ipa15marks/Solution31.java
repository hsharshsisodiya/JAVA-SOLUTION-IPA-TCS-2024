/* Find maximum prime from diagonals of a matrix
 * 7 8 9
 * 4 5 6
 * 1 2 3
 * Max prime of two diagonal = 7
 */

import java.util.*;
public class Solution31 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int [][]arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boolean res = true;
                for(int k=2;i<=arr[i][j]/2;k++){
                    if(arr[i][j]%k == 0){
                        res = false;
                    }
                }
                if(max < arr[i][j] && res == true){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max diagonal is:"+max);

    }
}
