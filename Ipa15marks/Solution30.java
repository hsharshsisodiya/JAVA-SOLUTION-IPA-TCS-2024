/* 12 4 8
    5 7 6
    4 8 13
    
    Maxumum prime of the 2 diagonals 13
*/ 

import java.util.*;
public class Solution30 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]arr = new int[n][n];
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max price is:"+max);
    }
}
