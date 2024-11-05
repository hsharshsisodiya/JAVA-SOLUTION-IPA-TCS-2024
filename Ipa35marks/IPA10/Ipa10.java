import java.util.Scanner;
import java.util.Arrays;
public class Ipa10{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Employee []arr = new Employee[4];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();
            boolean e = sc.nextBoolean(); sc.nextLine();

            arr[i] = new Employee(a,b,c,d,e);
        }
        String branch = sc.nextLine();

        int user1 = findCountOfEmployeesUsingCompTransport(arr,branch);
        if(user1 == 0)
        System.err.println("No such Employees");
        else
        System.out.println(user1);

        Employee user2 = findEmployeeWithSecondHighestRating(arr);
        if(user2 == null)
        System.out.println("All Employees using company transport");
        else
        System.out.println(user2.getId()+" "+user2.getName());

    }
    static Employee findEmployeeWithSecondHighestRating(Employee []arr){
        Employee []ans = new Employee[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getTransport() == false){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        for(int i=0;i<ans.length-1;i++){
            for(int j=0;j<ans.length-i-1;j++){
                if(ans[j].getRating() > ans[j+1].getRating()){
                    Employee temp = ans[j];
                    ans[j] = ans[j+1];
                    ans[j+1] = temp;
                }
            }
        }
        if((ans[ans.length-2].getTransport() == false) && ans.length > 1){
            return ans[ans.length-2];
        }
        else
        return null;
    }

    static int findCountOfEmployeesUsingCompTransport(Employee []arr, String branch){
        int cal = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getBranch().equalsIgnoreCase(branch) && arr[i].getTransport() == true){
                cal++;
            }
        }
        return cal;
    }
}
class Employee
{
    private int Id;
    private String name;
    private String branch;
    private double rating;
    private boolean transport;

    public Employee(int Id, String name, String branch, double rating, boolean transport)
    {
        this.Id = Id;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.transport = transport;
    }

    public int getId()
    {
        return Id;
    }
    public void setId(int Id)
    {
        this.Id = Id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getBranch()
    {
        return branch;
    }
    public void setBranch(String branch)
    {
        this.branch = branch;
    }
    public double getRating()
    {
        return rating;
    }
    public void setRating(double rating)
    {
        this.rating = rating;
    }
    public boolean getTransport()
    {
        return transport;
    }
    public void setTransport(boolean transport)
    {
        this.transport= transport;
    }
}