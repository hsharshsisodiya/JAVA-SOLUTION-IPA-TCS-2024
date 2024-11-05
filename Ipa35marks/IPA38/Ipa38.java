import java.util.*;
public class Ipa38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HeadSets[] arr = new HeadSets[4];
        for (int i = 0; i < arr.length; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            boolean d = sc.nextBoolean();sc.nextLine();

            arr[i] = new HeadSets(a,b,c,d);
        }
        String brand = sc.nextLine();
        int res1 = findTotalPriceForGivenBrand(arr, brand);
        if(res1 == 0)
        System.out.println("No Headsets available with the given brand");
        else
        System.out.println(res1);

        HeadSets res = findAvailableHeadsetWithSecondMinPrice(arr);
        if(res == null)
        System.out.println("No Headsets available");
        else{
        System.out.println(res.getHname());
        System.out.println(res.getPrice());
        }
    }
    public static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets []arr){
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!list.contains(arr[i].getPrice()) && arr[i].getAvailable() == true){
                list.add(arr[i].getPrice());
            }
        }
        if(list.size() < 2)
        return null;
        Collections.sort(list);
        int secondLowest = list.get(1);
        for(int i=0;i<arr.length;i++){
            if(arr[i].getPrice() == secondLowest){
                return arr[i];
            }
        }
        return null;

    }
    public static int findTotalPriceForGivenBrand(HeadSets []arr, String brand){
        int total = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getBrand().equalsIgnoreCase(brand)){
                total += arr[i].getPrice();
            }
        }
        return total;
    }
}
class HeadSets
{
    private String hname;
    private String brand;
    private int price;
    private boolean available;
    public HeadSets(String hname, String brand, int price,boolean available)
    {
        this.hname = hname;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }
    public String getHname()
    {
        return hname;
    }
    public void setHname(String hname)
    {
        this.hname = hname;
    }
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public boolean getAvailable()
    {
        return available;
    }
    public void setAvailable(boolean available)
    {
        this.available = available;
    }
}