import java.util.*;
public class Ipa20 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Engine []arr = new Engine[4];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();

            arr[i] = new Engine(a,b,c,d);
        }
        String type = sc.nextLine();
        String name = sc.nextLine();
        int res1 = findAvgEnginePriceByType(arr, type);
        if(res1 == 0)
        System.out.println("There are no engine with given type");
        else
        System.out.println(res1);

        Engine []res = searchEngineByName(arr, name);
        if(res == null)
        System.out.println("There are no engine with the given name");
        else{
            for(int i=0;i<res.length;i++){
                System.out.println(res[i].getId());
            }
        }
    }
    static Engine[] searchEngineByName(Engine []arr, String name){
        Engine []ans = new Engine[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getName().equalsIgnoreCase(name)){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        Arrays.sort(ans,(a,b)->a.getId() - b.getId());
        if(ans.length > 0)
        return ans;
        else
        return null;
    }
    static int findAvgEnginePriceByType(Engine []arr, String type){
        int avg = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getType().equalsIgnoreCase(type)){
                avg += arr[i].getPrice();
                count++;
            }
        }
        if(avg == 0)
        return 0;
        else
        return avg/count;
    }
}
class Engine
{
    private int id;
    private String name;
    private String type;
    private double price;
    public Engine(int id, String name, String type, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
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
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    
}