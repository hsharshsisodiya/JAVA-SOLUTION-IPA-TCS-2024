import java.util.*;
public class Ipa42{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Student [] arr1 = new Student[2];
        Faculty [] arr2 = new Faculty[2];
        for(int i=0;i<arr1.length;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            String f = sc.nextLine();
            int g = sc.nextInt();sc.nextLine();
            double h = sc.nextDouble();sc.nextLine();

            arr1[i] = new Student(a,b,c,d,e,f,g,h);
        }
        for(int i=0;i<arr2.length;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            String f = sc.nextLine();
            String g = sc.nextLine();
            double h = sc.nextDouble();sc.nextLine();

            arr2[i] = new Faculty(a,b,c,d,e,f,g,h);
        }
        Student res = findHighestGPAStudent(arr1);
        if(res != null){
            System.out.println(res.getRollNo()+" "+res.getCourse()+" "+res.getGpa());
        }
        else
        System.out.println("Sorry - No student is available");

        Faculty res1 = findHighestPaidFaculty(arr2);
        if(res1 != null){
            System.out.println(res1.getEmpId()+" "+res1.getDprt()+" "+res1.getSalary());
        }
        else
        System.out.println("Sorry - No faculty is available");
    }
    public static Student findHighestGPAStudent(Student []arr){
        double max = 0;
        Student maxGpa = null;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getGpa() > max){
                max = arr[i].getGpa();
                maxGpa = arr[i];
            }
        }
        return maxGpa;
    }
    public static Faculty findHighestPaidFaculty(Faculty []arr){
        double max = 0;
        Faculty maxSal = null;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getSalary() > max){
                max = arr[i].getSalary();
                maxSal = arr[i];
            }
        }
        return maxSal;
    }
}

class Person{
    private String fName,lName;
    private int age;
    private char gender;

    public Person(String fName, String lName, int age, char gender){
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
    }

    public String getFName(){
        return fName;
    }
    public String getLName(){
        return lName;
    }
    public int getAge(){
        return age;
    }
    public char getGenger(){
        return gender;
    }

    public void setFName(String fName){
        this.fName =fName;
    }
    public void setLName(String lName){
        this.lName = lName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
}

class Student extends Person{
    private String rollNo,course;
    private int semester;
    private double gpa;

    public Student(String fName, String lName, int age, char gender,String rollNo, String course, int semester, double gpa){
        super(fName, lName, age, gender);
        this.rollNo = rollNo;
        this.course = course;
        this.semester = semester;
        this.gpa = gpa;
    }

    public String getRollNo(){
        return rollNo;
    }
    public String getCourse(){
        return course;
    }
    public int getSemester(){
        return semester;
    }
    public double getGpa(){
        return gpa;
    }

    public void setRollNo(String rollNo){
        this.rollNo = rollNo;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public void setSemester(int semester){
        this.semester = semester;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

}

class Faculty extends Person{
    private String empId,dprt,dgn;
    private double salary;

    public Faculty(String fName, String lName, int age, char gender,String empId, String dprt, String dgn, double salary){
        super(fName, lName, age, gender);
        this.empId = empId;
        this.dprt = dprt;
        this.dgn = dgn;
        this.salary = salary;
    }

    public String getEmpId(){
        return empId;
    }
    public String getDprt(){
        return dprt;
    }
    public String getDgn(){
        return dgn;
    }
    public double getSalary(){
        return salary;
    }

    public void setEmpId(String empId){
        this.empId = empId;
    }
    public void setDprt(String dprt){
        this.dprt = dprt;
    }
    public void setDgn(String dgn){
        this.dgn = dgn;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
}