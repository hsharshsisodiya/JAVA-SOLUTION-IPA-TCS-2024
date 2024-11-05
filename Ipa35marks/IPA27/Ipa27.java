import java.util.*;
public class Ipa27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim2[]  arr= new Sim2[4];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Sim2(a,b,c,d,e);
        }
        String circle = sc.nextLine();
        double rate = sc.nextDouble(); sc.nextLine();

        Sim2[] res = matchAndSort(arr, circle, rate);
        if(res != null){
            for(int i=0;i<res.length;i++){
                System.out.println(res[i].getId());
            }
        }
        else
        System.out.println("No mathc Parameters");
        
    }
    static Sim2[] matchAndSort(Sim2 []arr, String circle, double rate){
        Sim2 []ans = new Sim2[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getCircle().equalsIgnoreCase(circle) && arr[i].getRps() < rate){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        Arrays.sort(ans,(a,b) -> b.getBalance() - a.getBalance());
        if(ans.length > 0)
        return ans;
        else
        return null;
    }
}
class Sim2
{
    private int id;
    private String company;
    private int balance;
    private double rps;
    private String circle;
    public Sim2(int id, String company, int balance, double rps, String circle) {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.rps = rps;
        this.circle = circle;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public double getRps() {
        return rps;
    }
    public void setRps(double rps) {
        this.rps = rps;
    }
    public String getCircle() {
        return circle;
    }
    public void setCircle(String circle) {
        this.circle = circle;
    }

    
}