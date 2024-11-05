import java.util.Scanner;
public class Ipa29 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); sc.nextLine();
        double b = sc.nextDouble(); sc.nextLine();
        double c = sc.nextDouble(); sc.nextLine();
        Account ac = new Account(a,b,c);

        int num = sc.nextInt(); sc.nextLine();
        double res = calInterest(ac,num);

        System.out.format("%.3f", res);

    }
    static double calInterest(Account ac, int num){
        double per = ac.getRate() * 100 / num;
        double interest = per + ac.getRate();
        return interest;
    }
}

class Account{
    private int id;
    private double bal;
    private double rate;

    public Account(int id,double bal,double rate){
        this.id = id;
        this.bal = bal;
        this.rate = rate;
    }

    public int getId(){
        return id;
    }
    public double getBal(){
        return bal;
    }
    public double getRate(){
        return rate;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setBal(double bal){
        this.bal = bal;
    }
    public void setRate(double rate){
        this.rate = rate;
    }
}
