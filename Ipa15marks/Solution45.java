/* Input: "Hello@123World456"

Process:
Array: ["Hello", "@", "123", "World", "456"]
Now you should concatenate all the strings in the array and multiply it with the sum of the position of that array where 
numbers are stored.
Sum of positions of numbers in the array = 3 + 5 = 8
Concatenated string = "Hello@123World456"
Result = 8 * "Hello@123World456" = "Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456
Hello@123World456Hello@123World456Hello@123World456"

Output:
"Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456
Hello@123World456"

*/
import java.util.*;
public class Solution45 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String []arr = new String[0];
        String c = "";
        String smbol = "";
        String num = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                c += ch;
                if(smbol!=""){
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1] = smbol;
                    smbol = "";
                }
                else if(num!=""){
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1]= num;
                    num = "";
                }
            }
            else if(Character.isDigit(ch)){
                num += ch;
                if(c!=""){
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1] = c;
                    c = "";
                }
                else if(smbol!=""){
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1] = smbol;
                    smbol = "";
                }
            }
            else{
                smbol += ch;
                if(c!=""){
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1] = c;
                    c = "";
                }
                else if(num!=""){
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1] = num;
                    num = "";
                }
            }
        }
        if(c!=""){
            arr = Arrays.copyOf(arr,arr.length+1);
            arr[arr.length-1] = c;
            c = "";
        }
        else if(num!=""){
            arr = Arrays.copyOf(arr,arr.length+1);
            arr[arr.length-1] = num;
            num = "";
        }
        else{
            arr = Arrays.copyOf(arr,arr.length+1);
            arr[arr.length-1] = smbol;
            smbol = "";
        }

        String ar = "";
        int pos = 0;
        for(int i=0;i<arr.length;i++){
            ar += arr[i];
            if(Character.isDigit(arr[i].charAt(0))){
                pos += i+1;
            }
        }
        System.out.println("the array Converston:"+ar);
        for(int i=0;i<pos;i++){
            System.out.print(ar);
        }
    }
}
