/*
Write a Java program to implement a simple calculator. The program should prompt the user to enter two numbers and an 
operator (+, -, *, or /) and then perform the corresponding operation and display the result.

For example, if the user enters 4, 5, and +, the program should display 9 as the result. Similarly, if the user enters 10, 3, 
and *, the program should display 30 as the result.

Your program should handle invalid inputs gracefully, for example, if the user enters an operator that is not one of the four 
allowed operators or if the user enters non-numeric inputs. 
*/

import java.util.*;
import java.util.Scanner;
public class Solution3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;
        try{
            a = sc.nextInt();
            b = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("You enter non-numeric number");
            return;
        }
        char c = sc.next().charAt(0);
        if(!(c == '+' || c == '-' || c == '*' || c == '/')){
        System.out.println("You enter invalid operator.");
        return;
        }

        switch(c){
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '/' :
                if(b != 0)
                System.out.println(a/b);
                else
                System.out.println("Cann't Divide.");
                break;
            default:
                System.out.println("No operator are present."); 
        }
    }
}
