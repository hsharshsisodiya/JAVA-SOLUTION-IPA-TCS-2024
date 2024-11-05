import java.util.*;
public class Ipa44 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Rectangle[] arr = new Rectangle[2];
        for (int i = 0; i < arr.length; i++) {
            double a = sc.nextDouble();sc.nextLine();
            double b= sc.nextDouble();sc.nextLine();

            arr[i] = new Rectangle(a, b);
        }
        double []res1 = calculateArea(arr);
        double []res2 = calculatePerimeter(arr);
        if(res1 != null && res2 != null){
            for(int i=0;i<res1.length;i++){
                System.out.println(res1[i]);
                System.out.println(res2[i]);
            }
        }
    }
    public static double[] calculateArea(Rectangle []arr) {
        double []ans = new double[0];
        for(int i=0;i<arr.length;i++){
            double temp = arr[i].getL() * arr[i].getB();
            ans = Arrays.copyOf(ans,ans.length+1);
            ans[ans.length-1] = temp;
        }
        return ans;
    } 

    public static double[] calculatePerimeter(Rectangle []arr){
        double []ans = new double[0];
        for(int i=0;i<arr.length;i++){
            double temp = 2 * (arr[i].getL() + arr[i].getB());
            ans = Arrays.copyOf(ans,ans.length+1);
            ans[ans.length-1] = temp;
        }
        return ans;
    }
}
class Rectangle
{
    private double l;
    private double b;
    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }
    public double getL() {
        return l;
    }
    public void setL(double l) {
        this.l = l;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    } 
}