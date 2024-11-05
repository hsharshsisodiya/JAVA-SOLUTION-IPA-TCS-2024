import java.util.*;
public class Ipa36 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        MobileDetails[] arr = new MobileDetails[5];
        for (int i = 0; i < arr.length; i++) 
        {
            int a = sc.nextInt();sc.nextLine();
            int b = sc.nextInt();sc.nextLine();
            String c = sc.nextLine();
            boolean d = sc.nextBoolean();sc.nextLine();

            arr[i] = new MobileDetails(a, b, c, d);
        }
        String brand = sc.nextLine();
        int res1 = getTotalPrice(arr, brand);
        if(res1 == 0)
        System.out.println("There are no mobile with given brand");
        else
        System.out.println(res1);

        MobileDetails []res2 = getSecondMin(arr);
        if(res2 != null){
            for(int i=0;i<res2.length;i++){
                System.out.println(res2[i].getBrand()+" : "+res2[i].getPrice());
            }
        }
        else
        System.out.println("No second highest Price");
    }
    public static MobileDetails[] getSecondMin(MobileDetails []arr){
        // Arrays.sort(arr,(a,b)->a.getPrice()-b.getPrice());
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!list.contains(arr[i].getPrice()))
            list.add(arr[i].getPrice());
        }
        Collections.sort(list);
        int secondHighest = list.get(1);
        //int secondHighest = arr[1].getPrice(); 
        MobileDetails [] ans = new MobileDetails[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getPrice() == secondHighest){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        return ans;
    }
    public static int getTotalPrice(MobileDetails []arr, String brand){
        int total = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getBrand().equalsIgnoreCase(brand)){
                total += arr[i].getPrice();
            }
        }
        return total;
    }
}
class MobileDetails
{
    private int id;
    private int price;
    private String brand;
    private boolean isFlagShip;
    
    public MobileDetails(int id, int price, String brand, boolean isFlagShip) {
        this.id = id;
        this.price = price;
        this.brand = brand;
        this.isFlagShip = isFlagShip;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public boolean isFlagShip() {
        return isFlagShip;
    }
    public void setFlagShip(boolean isFlagShip) {
        this.isFlagShip = isFlagShip;
    }
    
}