/* Marge two strings using comma

Input: 
Arijit,Ghosh
Pop:Mom

Output:
Arijit, Ghosh, Pop:Mom
*/

import java.util.*;
public class Solution28 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String []arr1 = str1.split(" ");
        String str2 = sc.nextLine();
        String []arr2 = str2.split(" ");
        for(int i=0;i<arr2.length;i++){
            arr1 = Arrays.copyOf(arr1,arr1.length+1);
            arr1[arr1.length-1] = arr2[i];
        }
        String ans = Arrays.toString(arr1);
        System.out.println(ans.substring(1,ans.length()-1));
    }
}
