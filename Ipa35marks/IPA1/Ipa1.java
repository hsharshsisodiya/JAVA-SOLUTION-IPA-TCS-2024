import java.util.Scanner;
import java.util.Arrays;
public class Ipa1{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Course []arr = new Course[4];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            int e = sc.nextInt(); sc.nextLine();

            arr[i] = new Course(a,b,c,d,e);
        }
        System.out.print("Type Admin:");
        String admin = sc.nextLine();
        System.out.print("Type Handson:");
        int handson = sc.nextInt();
        sc.close();

        int user1 = findAvgOfQuizByAdmin(arr,admin);
        if(user1 == 0)
        System.out.println("No Couse found!!");
        else
        System.out.println(user1);

        Course []res = sortCourseByHandsOn(arr,handson);
        if(res == null)
        System.out.println("No Course found with mentioned Attribute.");
        else{
            for(int i=0;i<res.length;i++){
                System.out.println(res[i].getName());
            }
        }
    }

    static Course[] sortCourseByHandsOn(Course []arr, int handson){
        Course []ans = new Course[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getHandson() < handson){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        Arrays.sort(ans, (a,b) -> a.getHandson() - b.getHandson());
        if(ans.length == 0)
        return null;
        else
        return ans;
    }

    static int findAvgOfQuizByAdmin(Course []arr, String admin){
        int count = 0;
        int avg = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getAdmin().equalsIgnoreCase(admin)){
                avg += arr[i].getQuiz();
                count++;
            }
        }
        if(avg == 0)
        return 0;
        else
        return avg/count;
    }
}

class Course{
    private int id;
    private String name;
    private String admin;
    private int quiz;
    private int handson;

    Course(int id, String name, String admin, int quiz, int handson){
        this.id = id;
        this.name = name;
        this.admin = admin;
        this.quiz = quiz;
        this.handson = handson;
    }

    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getAdmin(){
        return admin;
    }
    int getQuiz(){
        return quiz;
    }
    int getHandson(){
        return handson;
    }

    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void setAdmin(String admin){
        this.admin = admin;
    }
    void setQuiz(int quiz){
        this.quiz = quiz;
    }
    void setHandson(int handson){
        this.handson = handson;
    }
}