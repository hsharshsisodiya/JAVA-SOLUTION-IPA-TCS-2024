import java.util.*;
public class Ipa41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] arr = new BankAccount[3];
        for(int i=0; i<3; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();

            arr[i] = new BankAccount(a,b,c);
        }
        int acNumber = sc.nextInt(); sc.nextLine();
        double res1 = withdraw(arr, acNumber);
        if(res1 == -2)
        System.out.println("Sorry - Account not found");

        int acNumber1 = sc.nextInt(); sc.nextLine();
        double res2 = deposit(arr, acNumber1);

        if(res1 >= 0)
        System.out.println(res1);
        else if(res1 == -1)
        System.out.println("Sorry - Insufficient balance");
        
        if(res2 == -1)
        System.out.println("Sorry - Account not found");
        else
        System.out.println(res2);
    }
    public static double deposit(BankAccount []arr, int acNumber){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            if(arr[i].getAcNo() == acNumber){
                double depAmt = sc.nextDouble(); sc.nextLine();
                arr[i].setBalance(arr[i].getBalance() + depAmt);
                return arr[i].getBalance();
            }
        }
        return -1;
    }
    public static double withdraw(BankAccount []arr, int acNumber){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            if(arr[i].getAcNo() == acNumber){
                double withAmt = sc.nextDouble(); sc.nextLine();
                if(arr[i].getBalance() >= withAmt){
                    arr[i].setBalance(arr[i].getBalance() - withAmt);
                    return arr[i].getBalance();
                }
                return -1;
            }
        }
        return -2;
    }
}
class BankAccount
{
    private int acno;
    private String acname;
    private double balance;
    public BankAccount(int acno, String acname, double balance)
    {
        this.acno = acno;
        this.acname = acname;
        this.balance = balance;
    }
    public int getAcNo()
    {
        return acno;
    }
    public void setAcNo(int acno)
    {
        this.acno = acno;
    }
    public String getAcName()
    {
        return acname;
    }
    public void setAcName(String acname)
    {
        this.acname = acname;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
}