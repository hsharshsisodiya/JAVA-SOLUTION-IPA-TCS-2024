import java.util.*;

public class Ipa32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelAgencies[] arr = new TravelAgencies[3];
        for(int i =0; i<3; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            boolean e = sc.nextBoolean();

            arr[i] = new TravelAgencies(a,b,c,d,e);
        }
        int regNo = sc.nextInt(); sc.nextLine();
        String packType = sc.nextLine();
        TravelAgencies user1 = findAgencyWithHighestPackagePrice(arr);
        if(user1 == null){
            System.out.println("No highest Pakages.");
        }
        else
        System.out.println(user1.getPrice());

        TravelAgencies user2 = agencyDetailsForGivenldAndType(arr,regNo,packType);
        if(user2 == null)
        System.out.println("No agency details found");
        else{
            System.out.println(user2.getAgencyName()+":"+user2.getPrice());
        }

    }
    public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies []arr, int regNo, String packType){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getRegno() == regNo && arr[i].getPackageType().equalsIgnoreCase(packType)){
                return arr[i];
            }
        }
        return null;
    }
    public static TravelAgencies findAgencyWithHighestPackagePrice(TravelAgencies []arr){
        int max = 0;
        TravelAgencies res = null;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getPrice() > max){
                max = arr[i].getPrice();
                res = arr[i];
            }
        }
        return arr[i];
    }
}
class TravelAgencies
{
    int regno;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;
// constructor
    public TravelAgencies(int regno, String agencyName, String packageType, int price, boolean flightFacility)
    {
        this.regno = regno;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }
// getter method, setter method
    public int getRegno()
    {
        return regno;
    }
    public void setRegno(int regno)
    {
        this.regno = regno;
    }
    public String getAgencyName()
    {
        return agencyName;
    }
    public void setAgencyName(String agencyName)
    {
        this.agencyName = agencyName;
    }
    public String getPackageType()
    {
        return packageType;
    }
    public void setPackageType(String packageType)
    {
        this.packageType = packageType;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public boolean getFlightFacility()
    {
        return flightFacility;
    }
    public void setFlightFacility(boolean flightFacility)
    {
        this.flightFacility = flightFacility;
    }
}
