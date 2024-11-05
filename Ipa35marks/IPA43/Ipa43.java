import java.util.*;
public class Ipa43 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student[] arr = new Student[4];
        for (int i = 0; i < arr.length; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            int f = sc.nextInt();sc.nextLine();
            double g = sc.nextDouble();sc.nextLine();

            arr[i] = new Student(a,b,c,d,e,f,g);
        }
        String course = sc.nextLine();
        double res1 = calculateAverageGPA(arr);
        if(res1 == 0)
        System.out.println("Sorry - No students are available");
        else
        System.out.println(res1);

        Student []res = getStudentsByCourse(arr, course);
        if(res != null){
            for(int i=0;i<res.length;i++){
                System.out.println(res[i].getN());
                System.out.println(res[i].getR());
                System.out.println(res[i].getGpa());
            }
        }
        else
        System.out.println("Sorry - No students are available for the given course");
    }
    public static Student[] getStudentsByCourse(Student []arr, String course){
        Student []ans = new Student[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getC().equalsIgnoreCase(course)){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        return ans;
    }
    public static double calculateAverageGPA(Student []arr){
        double avg = 0;
        for(int i=0;i<arr.length;i++){
            avg += arr[i].getGpa();
        }
        if(avg == 0)
        return 0;
        else
        return avg/arr.length;
    }
}
class Student
{
    String n, r;
    int a;
    char g;
    String c;
    int s;
    double gpa;
    public Student(String n, String r, int a, char g, String c, int s, double gpa) {
        this.n = n;
        this.r = r;
        this.a = a;
        this.g = g;
        this.c = c;
        this.s = s;
        this.gpa = gpa;
    }
    public String getN() {
        return n;
    }
    public void setN(String n) {
        this.n = n;
    }
    public String getR() {
        return r;
    }
    public void setR(String r) {
        this.r = r;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public char getG() {
        return g;
    }
    public void setG(char g) {
        this.g = g;
    }
    public String getC() {
        return c;
    }
    public void setC(String c) {
        this.c = c;
    }
    public int getS() {
        return s;
    }
    public void setS(int s) {
        this.s = s;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
}