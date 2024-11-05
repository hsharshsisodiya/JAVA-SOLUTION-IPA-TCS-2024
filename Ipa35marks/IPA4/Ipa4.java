import java.util.Scanner;
import java.util.Arrays;
public class Ipa4 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); sc.nextLine();
        College []arr = new College[size];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            String d = sc.nextLine();
            int e = sc.nextInt(); sc.nextLine();

            arr[i] = new College(a,b,c,d,e);
        }
        String address = sc.nextLine();

        College user1 = findCollegeWithMaximumPincode(arr);
        if(user1 == null)
        System.out.println("No college found with mentioned attribute.");
        else{
            System.out.println("id-"+user1.getId());
            System.out.println("name-"+user1.getName());
            System.out.println("contactNo-"+user1.getContactNo());
            System.out.println("address-"+user1.getAddress());
            System.out.println("pinCode-"+user1.getPinCode());
        }

        College user2 = searchCollegeByAddress(arr, address);
        if(user2 == null)
        System.out.println("No college found with mentioned attribute.");
        else{
            System.out.println("id-"+user2.getId());
            System.out.println("name-"+user2.getName());
            System.out.println("contactNo-"+user2.getContactNo());
            System.out.println("address-"+user2.getAddress());
            System.out.println("pinCode-"+user2.getPinCode());

        }
    }

    static College searchCollegeByAddress(College []arr, String address){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getAddress().equalsIgnoreCase(address)){
                return arr[i];
            }
        }
        return null;
    }

    static College findCollegeWithMaximumPincode(College []arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getPinCode() > max){
                max = arr[i].getPinCode();
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i].getPinCode() == max){
                return arr[i];
            }
        }
        return null;
        // Arrays.sort(arr, (a,b) -> a.getPinCode() - b.getPinCode());
        // if(arr.length == 0)
        // return null;
        // else
        // return arr[arr.length-1];
    }
}

class College{
    private int id,contactNo,pinCode;
    private String name,address;

    College(int id, String name, int contactNo, String address, int pinCode){
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pinCode = pinCode;
    }

    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    int getContactNo(){
        return contactNo;
    }
    String getAddress(){
        return address;
    }
    int getPinCode(){
        return pinCode;
    }

    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void setContactNo(int contactNo){
        this.contactNo = contactNo;
    }
    void setAddress(String address){
        this.address = address;
    }
    void setPinCode(int pinCode){
        this.pinCode = pinCode;
    }
}
