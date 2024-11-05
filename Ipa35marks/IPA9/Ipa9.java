import java.util.Scanner;
public class Ipa9{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Book []arr = new Book[4];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            int b = sc.nextInt(); sc.nextLine();
            String c = sc.nextLine();
            String d = sc.nextLine();
            double e = sc.nextDouble(); sc.nextLine();

            arr[i] = new Book(a,b,c,d,e);
        }
        String title = sc.nextLine();

        Book user1 = findBookWithMaximumPrice(arr);
        if(user1 == null)
        System.out.println(user1);
        else
        System.out.println("No Book found with mentioned attribute.");

        Book user2 = searchBookByTitle(arr, title);
        if(user2 == null )
        System.out.println("No Book found with mentioned attribute.");
        else{
            System.out.println(user2.getId());
            System.out.println(user2.getTitle());
            System.out.println(user2.getPages());
        }
    }

    static Book searchBookByTitle(Book []arr, String title){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getTitle().equalsIgnoreCase(title)){
                return arr[i];
            }
        }
        return null;
    }

    static Book findBookWithMaximumPrice(Book []arr){
        double max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getPrice() > max){
                max = arr[i].getPrice();
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i].getPrice() == max){
                return arr[i];
            }
        }
        return null;
    }
}

class Book
{
    private int id, pages;
    private String title, author;
    private double price;

    public Book(int id, int pages, String title, String author, double price)
    {
        this.id = id;
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getPages()
    {
        return pages;
    }
    public void setPages(int pages)
    {
        this.pages = pages;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
}