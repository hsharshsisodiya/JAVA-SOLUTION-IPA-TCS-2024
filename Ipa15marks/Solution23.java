// Intersection between two given set
import java.util.*;
public class Solution23 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> set1 = new ArrayList<>();
        ArrayList <Integer> set2 = new ArrayList<>();
        int []arr = new int[0];

        System.out.println("Enter values for set1");
        for(int i=0;i<4;i++){
            int temp = sc.nextInt();
            set1.add(temp);
        }
        System.out.println("Enter values for set2");
        for(int i=0;i<5;i++){
            int temp = sc.nextInt();
            set2.add(temp);
            if(set1.contains(temp)){
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
