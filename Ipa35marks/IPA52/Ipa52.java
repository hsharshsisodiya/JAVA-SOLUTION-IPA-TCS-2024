import java.util.*;
public class Ipa52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] arr = new Course[4];
        for (int i = 0; i < arr.length; i++) {
            String a = sc.nextLine();
            int b = Integer.parseInt(sc.nextLine());
            String c = sc.nextLine();
            boolean d = sc.nextBoolean();sc.nextLine();

            arr[i] = new Course(a,b,c,d);
        }
        String name = sc.nextLine();
        String res = findCourseStatus(arr, name);
        if(res != null)
        System.out.println(res);
        else
        System.out.println("No course found");
    }
    public static String findCourseStatus(Course []arr, String name){
        Course temp = null;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getName().equalsIgnoreCase(name)){
                temp = arr[i];
                break;
            }
        }
        if(temp == null)
        return null;
        else if(temp.getNumber() >= 1000)
        return "High";
        else if(temp.getNumber() >= 500 && temp.getNumber() < 1000)
        return "Medium";
        else
        return "Low";
    }
}
class Course
{
    String name, mode;
    int number;
    boolean data;
    public Course(String name, int number,String mode, boolean data) {
        this.name = name;
        this.mode = mode;
        this.number = number;
        this.data = data;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public boolean isData() {
        return data;
    }
    public void setData(boolean data) {
        this.data = data;
    }
    
}