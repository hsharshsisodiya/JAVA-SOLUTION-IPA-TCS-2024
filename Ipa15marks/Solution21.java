/* Find first letter of each word in a string 
    Input : Kalyani Govt. Eng. College
    Output : KGEC
*/ 
import java.util.Scanner;
public class Solution21 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String []arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(Character.isLetter(arr[i].charAt(0)))
            sb.append(arr[i].charAt(0));
        }
        System.out.println(sb);
    }
}
