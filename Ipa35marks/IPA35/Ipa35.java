import java.util.*;
public class Ipa35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] arr = new Car[5];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();

            arr[i] = new Car(a,b,c);
        }
        int id = sc.nextInt(); sc.nextLine();
        Car []res = RemoveAndRearrange(arr, id);
        if(res != null){
            for(int i=0;i<res.length;i++){
            System.out.println(arr[i].getId()+":"+res[i].getName());
            }
        }
        else
        System.out.println("There are no car with given id");
    }
    public static Car[] RemoveAndRearrange(Car []arr, int id){
        Car[] ans = new Car[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getId() != id)
            {
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        return ans;
    }
}
class Car
{
    private int id;
    private String name;
    private String type;
    public Car(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
}
