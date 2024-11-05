import java.util.*;
public class Ipa24
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Inventory[] arr = new Inventory[4];
        for (int i = 0; i < arr.length; i++) {
            String a = sc.nextLine();
            int b = sc.nextInt();sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            arr[i] = new Inventory(a, b, c, d);
        }
        int limit = sc.nextInt(); sc.nextLine();
        Inventory []res = Replenish(arr,limit);
        for(int i=0;i<res.length;i++){
            if(res[i].getTh() > 75)
            System.out.println(res[i].getId()+" "+"Critical Filling");
            else if(res[i].getTh() >= 50 && res[i].getTh() <= 75)
            System.out.println(res[i].getId()+"Moderate Filling");
            else
            System.out.println(res[i].getId()+"Non-Critical Filling");
        }
    } 
    static Inventory[] Replenish(Inventory []arr, int limit){
        Inventory []ans = new Inventory[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getTh() <= limit){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        return ans;
    }
}

class Inventory
{
    private String id;
    private int max, cur, th;
    public Inventory(String id, int max, int cur, int th) {
        this.id = id;
        this.max = max;
        this.cur = cur;
        this.th = th;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }
    public int getCur() {
        return cur;
    }
    public void setCur(int cur) {
        this.cur = cur;
    }
    public int getTh() {
        return th;
    }
    public void setTh(int th) {
        this.th = th;
    }

    
}