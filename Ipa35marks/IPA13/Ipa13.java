import java.util.Scanner;
public class Ipa13 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        AutonomousCar []arr = new AutonomousCar[4];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new AutonomousCar(a,b,c,d,e);
        }
        String env = sc.nextLine();
        String brand = sc.nextLine();

        int res1 = findTestPassedByEnv(arr, env);
        if(res1 == 0)
        System.out.println("There \r\n" + //
                        "are no tests passed in this particular environment");
        else
        System.out.println(res1);

        AutonomousCar res2 = updateCarGrade(arr, brand);
        if(res2 != null){
            int rating = (res2.getPass() * 100)/res2.getCon();
                if(rating >= 80){
                    System.out.println(res2.getBrand()+"::A1");
                }
                else
                System.out.println(res2.getBrand()+"::B2");
        }
        else
        System.out.println("There \r\n" + //
                        "are no tests passed in this particular Brand");

    }
    static AutonomousCar updateCarGrade(AutonomousCar []arr, String brand){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getBrand().equalsIgnoreCase(brand)){
                return arr[i];
            }
        }
        return null;
    }

    static int findTestPassedByEnv(AutonomousCar []arr, String env){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getEnv().equalsIgnoreCase(env)){
                sum += arr[i].getPass();
            }
        }
        return sum;
    }
}

class AutonomousCar
{
    private int id;
    private String brand;
    private int con;
    private int pass;
    private String env;

    public AutonomousCar(int id, String brand, int con, int pass, String env)
    {
        this.id = id;
        this.brand = brand;
        this.con = con;
        this.pass = pass;
        this.env = env;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
    
}
