import java.util.*;
public class Ipa21 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Fruits []arr = new Fruits[4];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b =sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Fruits(a,b,c,d);
        }
        int rating = sc.nextInt(); sc.nextLine();

        Fruits res1 = findMaximumPriceByRating(arr, rating);
        if(res1 == null)
        System.out.println("No such Fruit");
        else
        System.out.println(res1.getId());

    }
    static Fruits findMaximumPriceByRating(Fruits []arr, int rating){
        int max = 0;
        Fruits maxobj = null;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getRating() > rating && max < arr[i].getPrice()){
                max = arr[i].getPrice();
                maxobj = arr[i];
            }
        }
        return maxobj;
    }
}
class Fruits
{
	private int id;
	private String name;
	private int price;
	private int rating;

	public Fruits(int id, String name, int price, int rating)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getRating()
	{
		return rating;
	}
	public void setRating(int rating)
	{
		this.rating = rating;
	}
}