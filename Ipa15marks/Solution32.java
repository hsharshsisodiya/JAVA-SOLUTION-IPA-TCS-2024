/*
 *Input : 1 2 4 8 9 11 12 14
 *Output : 3 5 6 7 10 13
*/
import java.util.*;
public class Solution32 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = sc.nextInt();
        int []arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 1;
        int j=0;
        ArrayList <Integer> list = new ArrayList<>();
        while(count < arr[arr.length-1]){
            if(arr[j] == count){
                j++;
                count++;
            }
            else{
                list.add(count);
                count++;
            }
        }
        for(Integer i:list){
            System.out.println(i);
        }
    }
}
