import java.util.*;
public class Ipa51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] arr = new Employee[5];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();

            arr[i] = new Employee(a,b,c,d,e);
        }
        int salary = sc.nextInt(); sc.nextLine();
        String dept = sc.nextLine();

        String []res = findDept(arr, salary);
        if(res != null){
            for(int i=0;i<res.length;i++){
                System.out.println(res[i]);
            }
        }
        else
        System.out.println("No Department found");

        int res1 = findSecondHighestSalary(arr, dept);
        if(res1 == 0)
        System.out.println("No data found");
        else
        System.out.println(res1);

    }
    public static String[] findDept(Employee []arr, int salary){
        String []ans = new String[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getSalary() == salary && arr[i].getRating() >= 3){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i].getDept();
            }
        }
        if(ans.length > 0)
        return ans;
        else
        return null;
    }

    public static int findSecondHighestSalary(Employee []arr, String dept ){
        int []ans = new int[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getDept().equalsIgnoreCase(dept)){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i].getSalary();
            }
        }
        if(ans.length > 1){
            return ans[ans.length-2];
        }
        else
        return 0;
    }

}
class Employee
{
    int id, rating, salary;
    String name, dept;
    public Employee(int id, String name, String dept, int rating, int salary) {
        this.id = id;
        this.rating = rating;
        this.salary = salary;
        this.name = name;
        this.dept = dept;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    
}