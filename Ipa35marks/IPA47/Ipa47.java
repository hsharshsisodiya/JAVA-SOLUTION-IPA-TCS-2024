import java.util.*;
public class Ipa47{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt(); sc.nextLine();
    int []arr = new int[size];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt(); sc.nextLine();
    }

    String ans1 = findValidScores(arr);
        if(ans1 != null)
        System.out.println("Valid scores are = "+ans1);
        else
        System.out.println("No valid score found");
    }

    public static boolean validateScore(int num){
        if(num <= 100 && num > 0)
        return true;
        else
        return false;
    }
    
    public static String findValidScores(int []arr){
        int [] ans = new int[0];
        for(int i=0;i<arr.length;i++){
            if(validateScore(arr[i]) == true){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        if(ans.length > 0){
            String res = Arrays.toString(ans);
            return res;
        }
        else
        return null;
    }
}