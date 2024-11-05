import java.util.Scanner;
public class Ipa5 {
    public static void main(String [] args){
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
        String cavFacility = sc.nextLine();
        int user1 = totalNoOfRoomsBooked(arr,cavFacility);
        if(user1 == 0)
        System.out.println("No such rooms booked");
        else
        System.out.println(user1);

    }

    static int totalNoOfRoomsBooked(Hotel []arr,String cavFacility){
        int total = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getCabFacility().equalsIgnoreCase(cavFacility) && arr[i].getNoOfRoomsBooked() > 5){
                total += arr[i].getNoOfRoomsBooked();
            }
        }
        return total;
    }
}

class Hotel{
    int id,noOfRoomBooked;
    String name,dateOfBooking,cabFacility;
    double totalBill;

    Hotel(int id,String name,String dateOfBooking,int noOfRoomsBooked,String cavFacility,double totalBill){
        this.id = id;
        this.name = name;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomBooked = noOfRoomsBooked;
        this.cabFacility = cavFacility;
        this.totalBill = totalBill;
    }

    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getDateOfBooking(){
        return dateOfBooking;
    }
    int getNoOfRoomsBooked(){
        return noOfRoomBooked;
    }
    String getCabFacility(){
        return cabFacility;
    }
    double getTotaoBill(){
        return totalBill;
    }
    
    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void setDateOfBooking(String dateOfBooking){
        this.dateOfBooking = dateOfBooking;
    }
    void setNoOfRoomsBooked(int noOfRoomBooked){
        this.noOfRoomBooked = noOfRoomBooked;
    }
    void setCabFacility(String cabFacility){
        this.cabFacility =  cabFacility;
    }
    void setTotaoBill(double totalBill){
        this.totalBill = totalBill;
    }
    
}

