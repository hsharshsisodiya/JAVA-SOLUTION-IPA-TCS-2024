import java.util.Scanner;
import java.util.Arrays;
public class Ipa2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Footwear []arr = new Footwear[5];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Footwear(a,b,c,d);
        }
        System.out.print("Type:");
        String type = sc.nextLine();
        System.out.print("Name:");
        String name = sc.nextLine();
        sc.close();

        int user1 = getCountByType(arr,type);
        if(user1 > 0)
        System.out.println(user1);
        else
        System.out.println("Footwear not available.");

        Footwear user2 = getSecondHighestPriceByBrand(arr, name);
        if(user2 == null)
        System.out.println("Brand not available.");
        else{
            System.out.println(user2.getId());
            System.out.println(user2.getName());
            System.out.println(user2.getPrice());
        }

    }
    static Footwear getSecondHighestPriceByBrand(Footwear []arr,String name){
        Footwear []ans = new Footwear[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getName().equalsIgnoreCase(name)){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }

        Arrays.sort(ans,(a,b) -> a.getPrice() - b.getPrice());

        // for(int i=0;i<ans.length-1;i++){
        //     for(int j=0;j<ans.length-1-i;j++){
        //         if(ans[j].getPrice() > ans[j+1].getPrice()){
        //             Footwear temp = ans[j];
        //             ans[j] = ans[j+1];
        //             ans[j+1] = temp;
        //         }
        //     }
        // }

        if(ans.length < 1)
        return null;
        else
        return ans[ans.length-2];
    }

    static int getCountByType(Footwear []arr, String type){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getType().equalsIgnoreCase(type)){
                count++;
            }
        }
        return count;
    }
}

class Footwear{
    private int id,price;
    private String name,type;

    Footwear(int id, String name, String type, int price){
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public int getPrice(){
        return price;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
