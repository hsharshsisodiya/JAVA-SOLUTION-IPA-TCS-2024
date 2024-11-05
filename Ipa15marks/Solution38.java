import java.util.*;
public class Solution38 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double p = Math.sqrt(num);
        if((int) p*p == num){
            System.out.println("Perfect Square");
        }
        else
        System.out.println("Not Perfect Square");
    }
}
