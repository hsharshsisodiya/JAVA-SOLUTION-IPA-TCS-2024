// Majority of an element means if an element is present in an array for more than n/2 times, 
//  where n is the length of the Array
//  Array = {3, 3, 4, 2, 4, 4, 2, 4, 4} => 4

import java.util.*;
public class Solution27 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of elements:");
        int size = sc.nextInt();
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<size;i++){
            int temp = sc.nextInt();
            hm.put(temp,hm.getOrDefault(temp,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() > size/2)
            System.out.println(entry.getKey());
        }
        System.out.println("Done");

    }
}
