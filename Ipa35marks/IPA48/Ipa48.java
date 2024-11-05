import java.util.*;
public class Ipa48 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); sc.nextLine();
        Bill []arr = new Bill[size];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();
            boolean e = sc.nextBoolean(); sc.nextLine();

            arr[i] = new Bill(a,b,c,d,e);
        }
        boolean status = sc.nextBoolean(); sc.nextLine();
        String connection = sc.nextLine();
        Bill []res = findBillWithMaxBillAmountBasedOnStatus(arr, status);
        if(res != null){
            double max = 0;
            for(int i=0;i<res.length;i++){
                if(max < res[i].getBillAmount()){
                    max = res[i].getBillAmount();
                }
            }
            for(int i=0;i<res.length;i++){
                if(max == res[i].getBillAmount()){
                    System.out.println(res[i].getBillNo()+"#"+res[i].getName());
                }
            }
        }
        else
        System.out.println("There are no bill with the given status");

        int res2 = getCountWithTypeOfConnection(arr, connection);
        if(res2 == 0)
        System.out.println("There are no bills with given type of connection");
        else
        System.out.println(res2);
    }
    public static int getCountWithTypeOfConnection(Bill []arr, String connection){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getTypeOfConnection().equalsIgnoreCase(connection)){
                count++;
            }
        }
        return count;
    }
    public static Bill[] findBillWithMaxBillAmountBasedOnStatus(Bill []arr, boolean status){
        Bill []ans = new Bill[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i].getStatus() == status){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        Arrays.sort(ans,(a,b)-> a.getBillNo() - b.getBillNo());
        return ans;
    }
}

class Bill{

    int billNo;
    String name;
    String typeOfConnection;
    double billAmount;
    boolean status;
    public Bill(int billNo, String name, String typeOfConnection, double billAmount, boolean status) {
        this.billNo = billNo;
        this.name = name;
        this.typeOfConnection = typeOfConnection;
        this.billAmount = billAmount;
        this.status = status;
    }
    public int getBillNo() {
        return billNo;
    }
    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTypeOfConnection() {
        return typeOfConnection;
    }
    public void setTypeOfConnection(String typeOfConnection) {
        this.typeOfConnection = typeOfConnection;
    }
    public double getBillAmount() {
        return billAmount;
    }
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
