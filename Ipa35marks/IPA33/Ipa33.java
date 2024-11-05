import java.util.*;
public class Ipa33 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Newspaper[] arr = new Newspaper[4];

        for(int i=0; i<arr.length; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            int d = sc.nextInt();

            arr[i] = new Newspaper(a,b,c,d);
        }
        int publicationYear = sc.nextInt(); sc.nextLine();
        String name = sc.nextLine();

        int res1 = findTotalPriceByPublicationYear(arr, publicationYear);
        if(res1 > 0)
        System.out.println(res1);
        else
        System.out.println("No Newspaper found with the mentioned attribute");

        Newspaper res2 = searchNewspaperByName(arr, name);
        if(res2 != null){
            System.out.println("RegNo-"+res2.getRegNo());
            System.out.println("Name-"+res2.getName());
            System.out.println("PublicationYear-"+res2.getPublicationYear());
            System.out.println("Price-"+res2.getPrice());
        }
        else
        System.out.println("No Newspaper found with the given name.");

    }
    public static Newspaper searchNewspaperByName(Newspaper []arr,String name){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getName().equalsIgnoreCase(name)){
                return arr[i];
            }
        }
        return null;
    }
    public static int findTotalPriceByPublicationYear(Newspaper []arr,int publicationYear){
        int total = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getPublicationYear() == publicationYear){
                total += arr[i].getPrice();
            }
        }
        return total;
    }
}
class Newspaper{
    int regNo;
    String name;
    int publicationYear;
    int price;

    public Newspaper(int regNo, String name, int publicationYear, int price)
    {
        this.regNo = regNo;
        this.name = name;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public int getRegNo()
    {
        return regNo;
    }
    public void setRegno(int regNo)
    {
        this.regNo=regNo;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getPublicationYear()
    {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear)
    {
        this.publicationYear = publicationYear;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
}