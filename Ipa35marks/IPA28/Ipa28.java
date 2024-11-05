import java.util.Scanner;
public class Ipa28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        Team[] arr = new Team[n];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();

            arr[i] = new Team(a,b,c,d);
        }
        int run = sc.nextInt(); sc.nextLine();
        String country = sc.nextLine();

        Team res = findPlayer(arr, run, country);
        if(res == null)
        System.out.println("No team is found from the given country and run");
        else{
            System.out.println(res.gettId());
            System.out.println(res.gettName());
            System.out.println(res.gettCountry());
            System.out.println(res.gettRun());
        }
        
    }
    static Team findPlayer(Team [] arr, int run, String country){
        for(int i=0;i<arr.length;i++){
            if(arr[i].gettCountry().equalsIgnoreCase(country) && arr[i].gettRun() > run){
                return arr[i];
            }
        }
        return null;
    }
}
class Team
{
    private int tId;
    private String tName;
    private String tCountry;
    private int tRun;
    public Team(int tId, String tName, String tCountry, int tRun) {
        this.tId = tId;
        this.tName = tName;
        this.tCountry = tCountry;
        this.tRun = tRun;
    }
    public int gettId() {
        return tId;
    }
    public void settId(int tId) {
        this.tId = tId;
    }
    public String gettName() {
        return tName;
    }
    public void settName(String tName) {
        this.tName = tName;
    }
    public String gettCountry() {
        return tCountry;
    }
    public void settCountry(String tCountry) {
        this.tCountry = tCountry;
    }
    public int gettRun() {
        return tRun;
    }
    public void settRun(int tRun) {
        this.tRun = tRun;
    }
    
}