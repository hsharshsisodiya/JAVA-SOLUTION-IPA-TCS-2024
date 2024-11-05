/*Write a Java program to find the first non-repeated character in a given string.

Here's an example of the expected input and output:

Input string: "minimum"
Output: "n"

*/
import java.util.*;
public class Solution20 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findNonrepeatedChar(str));
    }
    public static char findNonrepeatedChar(String str){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<str.length();i++){
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i), 0)+1);
        }
        for(char ch : str.toCharArray()){
            int temp = hm.get(ch);
            if(temp > 1);
            else
            return ch;
        }
        return ' ';
    }
}
