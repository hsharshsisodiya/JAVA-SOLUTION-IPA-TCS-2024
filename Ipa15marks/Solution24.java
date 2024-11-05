/*
Write a program that reads in a list of integers and prints out the smallest and largest integer in the list.

Your program should first ask the user to enter the number of integers they want to input. Then it should prompt the user to 
enter each integer one by one.

After all the integers have been entered, the program should output the smallest and largest integer in the list.

Input
-------------------------
Enter the number of integers: 5
Enter integer 1: 10
Enter integer 2: -5
Enter integer 3: 20
Enter integer 4: 0
Enter integer 5: 15

Output
-------------------------
Smallest integer: -5
Largest integer: 20

 */

import java.util.*;
public class Solution24 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want??");
        int size = sc.nextInt();
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
    }
}
