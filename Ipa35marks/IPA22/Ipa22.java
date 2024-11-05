import java.util.*;
public class Ipa22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Associate[] arr = new Associate[5];
        for (int i = 0; i < arr.length; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            arr[i] = new Associate(a, b, c, d);
        }
        String tech = sc.nextLine();
        Associate []res = associatesForGivenTechnology(arr, tech);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i].getId());
        }
    }
    static Associate[] associatesForGivenTechnology(Associate []arr, String tech){
        Associate []ans = new Associate[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getTech().equalsIgnoreCase(tech) && arr[i].getYear() % 5 == 0){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        if(ans.length > 0)
        return ans;
        else
        return null;
    }
}

class Associate
{
    private int id;
    private String name;
    private String tech;
    private int year;

    public Associate(int id, String name, String tech, int year) {
        this.id = id;
        this.name = name;
        this.tech = tech;
        this.year = year;
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
    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    
}
