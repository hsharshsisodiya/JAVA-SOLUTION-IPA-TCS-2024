import java.util.*;
public class Ipa37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Song[] arr = new Song[5];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();

            arr[i] = new Song(a,b,c,d);
        }
        String artist = sc.nextLine();
        double res1 = findSongDurationForArtist(arr, artist);
        if(res1 == 0)
        System.out.println("There are no songs with given artist");
        else
        System.out.println(res1);

        Song []res2 = getSongsInAscendingOrder(arr, artist);
        if(res2 != null){
            for(int i=0;i<res2.length;i++){
                System.out.println(res2[i].getId()+" "+res2[i].getTitle());
            }
        }
        else
        System.out.println("There are no songs with given artist");
    }
    public static Song[] getSongsInAscendingOrder(Song []arr, String artist){
        Song []ans = new Song[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getArtist().equalsIgnoreCase(artist)){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        for(int i=0;i<ans.length-1;i++){
            for(int j=0;j<ans.length-i-1;j++){
                if(ans[j].getDuration() > ans[j+1].getDuration()){
                    Song temp = ans[j];
                    ans[j] = ans[j+1];
                    ans[j+1] = temp;
                }
            }
        }
        if(ans.length > 0)
        return ans;
        else
        return null;
    }
    public static double findSongDurationForArtist(Song []arr, String artist){
        double sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getArtist().equalsIgnoreCase(artist)){
                sum += arr[i].getDuration();
            }
        }
        return sum;
    }
}

class Song
{
    int id;
    String title;
    String artist;
    double duration;
    public Song(int id, String title, String artist, double duration) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public double getDuration() {
        return duration;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }
    
}