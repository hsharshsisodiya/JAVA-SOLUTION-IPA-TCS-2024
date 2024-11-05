// Find the first non repeated character substring
//Arijit = Arij
import java.util.*;
public class Solution19 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(nonRapeatedSubstring(str));
    }
    public static String nonRapeatedSubstring(String str){
        for(int i=0;i<str.length();i++){
            HashSet <Character> set = new HashSet<>();  //for character is unique.
            StringBuilder sb = new StringBuilder();     //for adding a unique character.
            for(int j=i;j<str.length();j++){
                char currChar = str.charAt(j);         // store current char.
                if(set.contains(currChar)){            // if char in present in set then break the program.
                    break;
                }
                sb.append(currChar);                   // add in string.bz it's unique character.
                set.add(currChar);                     // add in set. bz it's unique character.
            }
            if(sb.length() == set.size())              // if both length is same then return the first non repeted string.
            return sb.toString();
        }
        return null;
    }
}
