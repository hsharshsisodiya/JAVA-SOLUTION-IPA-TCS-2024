import java.util.*;
public class Ipa46
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] arr = new Player[4];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();    
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            
            arr[i] = new Player(a,b,c,d);
        }
        String side = sc.nextLine();
        Player []res = searchPlayerForMatch(arr, side);
        if(res == null)
        System.out.println("No such player");
        else{
            for(int i=0;i<res.length;i++){
                System.out.println(res[i].getId());
                // System.out.println(res[i].getCountry());
                // System.out.println(res[i].getSide());
                // System.out.println(res[i].getPrice());
            }
        }
    }
    public static Player[] searchPlayerForMatch(Player []arr, String side){
        Player []ans = new Player[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getSide().equalsIgnoreCase(side)){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        Arrays.sort(ans, (a,b)-> a.getId() - b.getId());
        return ans;
    }
}
class Player
{
    int id;
    String country,side;
    double price;
    public Player(int id, String country, String side, double price) {
        this.id = id;
        this.country = country;
        this.side = side;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getSide() {
        return side;
    }
    public void setSide(String side) {
        this.side = side;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}