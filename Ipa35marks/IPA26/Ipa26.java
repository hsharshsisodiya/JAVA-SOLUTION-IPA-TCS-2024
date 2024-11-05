import java.util.*;
public class Ipa26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player2[] arr = new Player2[4];
        for(int i=0; i<4; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();

            arr[i] = new Player2(a,b,c,d,e);
        }
        int target = sc.nextInt(); sc.nextLine();
        double []res = findAverageOfRuns(arr, target);
        if(res == null){
            System.out.println("No match with target.");
        }
        else{
            for(int i=0;i<res.length;i++){
                if(res[i] <= 100 && res[i] >= 80)
                System.out.println("Grade A");
                else if(res[i] <= 79 && res[i] >= 50)
                System.out.println("Grade B");
                else
                System.out.println("Grade C");
            }
        }
        
    }
    static double[] findAverageOfRuns(Player2 []arr, int target){
        double []ans = new double[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getMatch() >= target){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = (arr[i].getRun()/arr[i].getMatch());
            }
        }
        if(ans.length > 0)
        return ans;
        else
        return null;
    }
}
class Player2
{
    private int id;
    private String name;
    private int rank, match, run;

    public Player2(int id, String name, int rank, int match, int run)
    {
        this.id = id;
        this.name = name;
        this.rank = rank;
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

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
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