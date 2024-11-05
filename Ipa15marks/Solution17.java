/* Input : Home, Sweet Home
           Home
 * Output : Number of that word present in the sentence : 2
 * 
 * Process
 * ----------
 * The word Home present in the sentence 2 times
 */
import java.util.Scanner;
public class Solution17 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String cheack = sc.nextLine();
        String [] arr = str.split(" ");
        String ch = "";
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length();j++){
                if(Character.isLetter(arr[i].charAt(j))){
                    ch += arr[i].charAt(j);
                }
            }
            if(cheack.equals(ch)){
                count++;
            }
            ch = "";
        }
        System.out.println(count);
    }
}
