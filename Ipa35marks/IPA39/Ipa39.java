import java.util.*;
public class Ipa39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veg[] arr = new Veg[4];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            arr[i] = new Veg(a,b,c,d);
        }
        int rating = sc.nextInt(); sc.nextLine();
        Veg res = findMinimumPriceByRating(arr, rating);
        if(res == null)
        System.out.println("No such Vegetables");
        else
        System.out.println(res.getId());
        
    }
    public static Veg findMinimumPriceByRating(Veg []arr, int rating){
        int min = Integer.MAX_VALUE;
        Veg minpri = null;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getRating() > rating && min > arr[i].getPrice()){
                min = arr[i].getPrice();
                minpri = arr[i];
            }
        }
        return minpri;
    }
}
class Veg
{
    private int id;
    private String name;
    private int price;
    private int rating;
    public Veg(int id, String name, int price, int rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
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
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    
}