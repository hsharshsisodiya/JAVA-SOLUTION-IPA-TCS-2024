import java.util.Scanner;
import java.util.Arrays;

public class Ipa14{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Movie []arr = new Movie[4];
        for(int i=0;i<arr.length;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Movie(a,b,c,d);
        }
        String genre = sc.nextLine();

        Movie []res = getMoviebyGenre(arr, genre);
        for(int i=0;i<res.length;i++){
            if(arr[i].getBudget() > 80000000)
            System.out.println("High Budget Movie.");
            else
            System.out.println("Low Budget Movie.");
        }
    }
    static Movie[] getMoviebyGenre(Movie []arr, String genre){
        Movie []ans = new Movie[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getGenre().equalsIgnoreCase(genre)){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        return ans;
    }
}

class Movie
{
    String mname, company, genre;
    int budget;

    public Movie(String mname, String company, String genre, int budget)
    {
        this.mname = mname;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    
}

