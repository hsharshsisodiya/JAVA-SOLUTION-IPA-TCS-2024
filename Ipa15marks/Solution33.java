/* Find the occurance of each character in a string
 * Input: Hello world
 * Output:
 *  H: 1
    e: 1
    l: 3
    o: 2
    w: 1
    r: 1
    d: 1
*/
import java.util.*;
public class Solution33 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>(); // this used for sequence of the char.
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
