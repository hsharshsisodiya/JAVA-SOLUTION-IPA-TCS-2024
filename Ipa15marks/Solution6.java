// aabbbcc = a2b3c2
// abbccc = a1b2c3

import java.util.Scanner;
public class Solution6 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        char ch = str.charAt(0);
        for(int i=0;i<str.length();i++){
            if(ch == str.charAt(i)){
                count++;
            }
            else{
                System.out.print(ch+""+count);
                ch = str.charAt(i);
                count = 0;
                i--;
            }
            if(ch == str.charAt(str.length()-1) && i == str.length()-1)
            System.out.println(ch+""+count);
        }
    }
}
