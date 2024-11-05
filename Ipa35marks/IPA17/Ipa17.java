import java.util.Scanner;
import java.util.Arrays;

public class Ipa17 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Stud []arr = new Stud[4];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            
            arr[i] = new Stud(a,b,c,d,e);
        }
        char grade = sc.nextLine().charAt(0);
        int month = sc.nextInt(); sc.nextLine();

        Stud []res = findStudentByGradeAndMonth(arr, grade, month);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i].getName());
            System.out.println(res[i].getSub());
        }
        System.out.println(res.length);

    }
    static Stud[] findStudentByGradeAndMonth(Stud []arr, char grade, int month){
        Stud []ans = new Stud[0];
        for(int i=0;i<arr.length;i++){
            String []m = arr[i].getDate().split("/");
            if(arr[i].getGrade() == grade && Integer.parseInt(m[1]) == month){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        Arrays.sort(ans,(a,b) -> a.getRoll() - b.getRoll());
        if(ans.length == 0)
        return null;
        else
        return ans;
    }
}
class Stud
{
    private int roll;
    private String name;
    private String sub;
    private char grade;
    private String date;

    public Stud(int roll, String name, String sub, char grade, String date)
    {
        this.roll = roll;
        this.name = name;
        this.sub = sub;
        this.grade = grade;
        this.date = date;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}