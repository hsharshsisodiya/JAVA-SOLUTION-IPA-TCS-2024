import java.util.*;
public class Ipa34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player3[] arr = new Player3[n];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();

            arr[i] = new Player3(a,b,c,d,e);
        }
        String country = sc.nextLine();
        int run = sc.nextInt(); sc.nextLine();

        Player3 []res = findPlayerName(arr, country, run);
        if(res != null){
            for(int i=0;i<res.length;i++){
                for(int j=i+1;j<res.length;j++){
                    if(res[i].getName().compareTo(res[j].getName()) > 0){
                        Player3 temp = res[i];
                        res[i] = res[j];
                        res[j] = temp; 
                    }
                }
            }
            for(int i=0;i<res.length;i++){
                System.out.println(res[i].getId()+" : "+res[i].getName());
            }
        }
        else
        System.out.println("No player found");
    }
    public static Player3[] findPlayerName(Player3 []arr, String country, int run){
        Player3 []ans = new Player3[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getCountry().equalsIgnoreCase(country) && arr[i].getRun() > run){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        return ans;
    }
}
class Player3
{
    private int id;
    private String name;
    private String country;
    private int match;
    private int run;

    public Player3(int id, String name, String country, int match, int run) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.match = match;
        this.run = run;
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
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getMatch() {
        return match;
    }
    public void setMatch(int match) {
        this.match = match;
    }
    public int getRun() {
        return run;
    }
    public void setRun(int run) {
        this.run = run;
    }
    
}