import java.util.*;
public class Ipa50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Beach[] arr = new Beach[4];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            int d = sc.nextInt();
            sc.nextLine();
            arr[i] = new Beach(a,b,c,d);
        }
        String name = sc.nextLine();
        int cost = sc.nextInt(); sc.nextLine();
        int res = findLeastRatingWithName(arr, name, cost);
        if(res == 0)
        System.out.println("No beach found");
        else
        System.out.println(res);
    }
    public static int findLeastRatingWithName(Beach []arr, String name, int cost){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getName().equalsIgnoreCase(name) && arr[i].getCost() > cost && min > arr[i].getRating()){
                min = arr[i].getRating();
            }
        }
        if(min == Integer.MAX_VALUE)
        return 0;
        else
        return min;
    }
}
class Beach
{
    private int id;
    private String name;
    private int rating;
    private int cost;
    public Beach(int id, String name, int rating, int cost) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.cost = cost;
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
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
}