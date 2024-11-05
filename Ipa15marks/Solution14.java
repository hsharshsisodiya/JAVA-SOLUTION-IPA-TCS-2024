/* Count number of vowel, consonent and digit into a string */

import java.util.Scanner; 
public class Solution14 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int cVowel = 0;
        int cConsonent = 0;
        int cDigit = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    cVowel++;
                }
                else
                cConsonent++;
            }
            else if(Character.isDigit(ch))
            cDigit++;
        }
        System.out.println(cVowel);
        System.out.println(cConsonent);
        System.out.println(cDigit);
    }
}
