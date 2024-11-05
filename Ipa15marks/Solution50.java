/* Sort name by dictionary order
    Input
    -----------------
    Arijit
    Minaz
    Arnab

    Output
    -------------------
    Arijit
    Arnab
    Minaz
 */
import java.util.*;
public class Solution50 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter name size:");
        int size = sc.nextInt(); sc.nextLine();
        String []arr = new String[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr);
        for(String s : arr){
            System.out.println(s);
        }
        
    }
}
