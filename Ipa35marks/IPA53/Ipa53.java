import java.util.*;
public class Ipa53
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] course = new Course[4];
        for (int i = 0; i < course.length; i++) {
            int a = Integer.parseInt(sc.nextLine());
            String b = sc.nextLine();
            double c = sc.nextDouble();sc.nextLine();
            String d = sc.nextLine();
            boolean e = sc.nextBoolean();sc.nextLine();
            course[i] = new Course(a, b, c, d, e);
        }
        double rating = sc.nextDouble(); sc.nextLine();
        String mode = sc.nextLine();
        int res = CountCourse(course, mode, rating);
        if(res == 0)
        System.out.println("No course found");
        else
        System.out.println(res);
    }
    public static int CountCourse(Course []arr, String mode, double rating){
        int total = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getMode().equalsIgnoreCase(mode) && arr[i].getRating() >= rating){
                total++;
            }
        }
        return total;
    }
}
class Course
{
    private int id;
    private String name;
    private double rating;
    private String mode;
    private boolean certificate;
    public Course(int id, String name, double rating, String mode, boolean certificate) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.mode = mode;
        this.certificate = certificate;
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
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }
    public boolean isCertificate() {
        return certificate;
    }
    public void setCertificate(boolean certificate) {
        this.certificate = certificate;
    }
    
}