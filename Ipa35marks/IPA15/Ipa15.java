import java.util.Scanner;
public class Ipa15 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Phone []arr = new Phone[4];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Phone(a,b,c,d);
        }
        String brand = sc.nextLine();
        String os = sc.nextLine();
        int res1 = findPriceForGivenBrand(arr, brand);
        if(res1 == 0)
        System.out.println("The given Brand is not available");
        else
        System.out.println(res1);

        Phone res2 = getPhoneIdBasedOnOs(arr, os);
        if(res2 == null)
        System.out.println("No phones are available with specified os and price range");
        else
        System.out.println(res2.getId());

    }
    static Phone getPhoneIdBasedOnOs(Phone []arr, String os){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getOs().equalsIgnoreCase(os) && arr[i].getPrice() >= 5000 )
            return arr[i];
        }
        return null;
    }

    static int findPriceForGivenBrand(Phone []arr, String brand){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getBrand().equalsIgnoreCase(brand)){
                sum += arr[i].getPrice();
            }
        }
        return sum;
    }
}
class Phone
{
    int id,price;
    String os,brand;

    public Phone(int id, String os, String brand, int price)
    {
        this.id = id;
        this.os = os;
        this.brand=brand;
        this.price = price;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getOs()
    {
        return os;
    }
    public void setOs(String os)
    {
        this.os = os;
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
}