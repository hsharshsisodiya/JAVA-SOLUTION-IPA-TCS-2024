import java.util.Scanner;
import java.util.Arrays;
public class Ipa3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Student []arr = new Student[4];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();
            boolean e = sc.nextBoolean(); sc.nextLine();

            arr[i] = new Student(a,b,c,d,e);
        }

        int std1 = findCountOfDayScholarStudents(arr);
        if(std1 > 0)
        System.out.println(std1);
        else
        System.out.println("There are no such dayscholar students.");

        Student std2 = findStudentwithSecondHighestScore(arr);
        if(std2 == null)
        System.out.println("There are no Student from non day scholar.");
        else{
            System.out.println(std2.getRollNo());
            System.out.println(std2.getName());
            System.out.println(std2.getScore());
        }
    }

    static Student findStudentwithSecondHighestScore(Student []arr){
        Student []ans = new Student[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getDayScholar() == false){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }

        for(int i=0;i<ans.length-1;i++){
            for(int j=0;j<ans.length-i-1;j++){
                if(ans[j].getScore() > ans[j+1].getScore()){
                    Student temp = ans[j];
                    ans[j] = ans[j+1];
                    ans[j+1] = temp;
                }
            }
        }
        // Arrays.sort(ans, (a,b) -> a.getScore() - b.getScore());
        if(ans.length > 1)
        return ans[ans.length-2];
        else
        return null;
    }

    static int findCountOfDayScholarStudents(Student []arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getScore() > 80 && arr[i].getDayScholar() == true){
                count++;
            }
        }
        return count;
    }
}

class Student{
    private int rollNo;
    private String name,branch;
    private double score;
    private boolean dayScholar;

    Student(int rollNo, String name, String branch, double score, boolean dayScholar){
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;
    }

    int getRollNo(){
        return rollNo;
    }
    String getName(){
        return name;
    }
    String getBranch(){
        return branch;
    }
    double getScore(){
        return score;
    }
    boolean getDayScholar(){
        return dayScholar;
    }

    void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    void setName(String name){
        this.name = name;
    }
    void setBranch(String branch){
        this.branch = branch;
    }
    void setDayScholar(boolean dayScholar){
        this.dayScholar = dayScholar;
    }

}
