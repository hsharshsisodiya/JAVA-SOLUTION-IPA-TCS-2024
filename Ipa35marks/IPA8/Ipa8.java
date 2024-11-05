import java.util.Scanner;
public class Ipa8 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Hotel []arr = new Hotel[4];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble(); sc.nextLine();

            arr[i] = new Hotel(a,b,c,d,e,f);
        }
        String month = sc.nextLine();
        String wifi = sc.nextLine();

        int user1 = noOfRoomsBookedInGivenMonth(arr, month);
        if(user1 == 0)
        System.out.println("No rooms booked in the given month");
        else
        System.out.println(user1);

        Hotel user2 = searchHotelByWifiOption(arr, wifi);
        if(user2 == null)
        System.out.println("No such option available");
        else
        System.out.println(user2.getId());
        
    }

    static Hotel searchHotelByWifiOption(Hotel []arr,String wifi){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j].getBill() > arr[j+1].getBill()){
                    Hotel temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        if(arr[arr.length-2].getWifi().equalsIgnoreCase(wifi))
        return arr[arr.length-2];
        else 
        return null;
    }

    static int noOfRoomsBookedInGivenMonth(Hotel []arr,String month){
        int total = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getDate().contains(month)){
                total += arr[i].getRoom();
            }
        }
        return total;
    }
}

class Hotel{
    private int id;
    private String name;
    private String date;
    private int room;
    private String wifi;
    private double bill;

    public Hotel(int id, String name, String date, int room, String wifi, double bill)
    {
        this.id = id;
        this.name = name;
        this.date = date;
        this.room = room;
        this.wifi = wifi;
        this.bill = bill;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getDate()
    {
        return date;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public int getRoom()
    {
        return room;
    }
    public void setRoom(int room)
    {
        this.room = room;
    }
    public String getWifi()
    {
        return wifi;
    }
    public void setWifi(String wifi)
    {
        this.wifi = wifi;
    }
    public double getBill()
    {
        return bill;
    }
    public void setBill(double bill)
    {
        this.bill = bill;
    }
}