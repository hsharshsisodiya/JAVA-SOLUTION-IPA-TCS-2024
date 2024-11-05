import java.util.Scanner;
import java.util.Arrays;
public class Ipa7 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Sim []arr = new Sim[5];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble(); sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Sim(a,b,c,d,e);
        }
        String circle1 = sc.nextLine();
        String circle2 = sc.nextLine();

        Sim [] res = transferCustomerCircle(arr, circle1, circle2);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i].getSimId()+" "+res[i].getCustomerName()+" "+res[i].getCircle()+" "+res[i].getRatePerSecond());
        }
    }

    static Sim[] transferCustomerCircle(Sim []arr,String circle1,String circle2){
        Sim []ans = new Sim[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getCircle().equalsIgnoreCase(circle1)){
                ans = Arrays.copyOf(ans,ans.length+1);
                arr[i].setCircle(circle2);
                ans[ans.length-1] = arr[i];
            }
        }
        for(int i=0;i<ans.length-1;i++){
            for(int j=0;j<ans.length-i-1;j++){
                if(ans[j].getRatePerSecond() < ans[j+1].getRatePerSecond()){
                    Sim temp = ans[j];
                    ans[j] = ans[j+1];
                    ans[j+1] = temp;
                }
            }
        }
        return ans;
    }
}

class Sim
{
    int simId;
    String customerName, circle;
    double balance, ratePerSecond;

    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle)
    {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId()
    {
        return simId;
    }
    public void setSimId(int simId)
    {
        this.simId = simId;
    }
    public String getCustomerName()
    {
        return customerName;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double getRatePerSecond()
    {
        return ratePerSecond;
    }
    public void setRatePerSecond(double ratePerSecond)
    {
        this.ratePerSecond = ratePerSecond;
    }
    public String getCircle()
    {
        return circle;
    }
    public void setCircle(String circle)
    {
        this.circle = circle;
    }
}
