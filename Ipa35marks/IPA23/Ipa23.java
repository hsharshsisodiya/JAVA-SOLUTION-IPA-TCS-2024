import java.util.*;
public class Ipa23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Institute[] arr = new Institute[4];
        for (int j = 0; j < arr.length; j++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();
            String f = sc.nextLine();

            arr[j] = new Institute(a, b, c, d, e, f);
        }
        String location = sc.nextLine();
        String name = sc.nextLine();
        int res1 = FindNumClearancedByLoc(arr,location);
        if(res1 == 0){
            System.out.println("There are no cleared students in this particular location");
        }
        else
        System.out.println(res1);
        
        Institute res2 = UpdateInstitutionGrade(arr, name);
        if(res2 == null)
        System.out.println("No Institute is available with the specified name");
        else{
            int rating = (res2.getPlaced() * 100) / res2.getClear();
            if(rating >= 80)
            System.out.println(res2.getName()+"::A");
            else
            System.out.println(res2.getName()+"::B");
        }
    }
    static Institute UpdateInstitutionGrade(Institute []arr, String name){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getName().equalsIgnoreCase(name)){
                return arr[i];
            }
        }
        return null;
    }
    static int FindNumClearancedByLoc(Institute []arr, String location){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getLocation().equalsIgnoreCase(location)){
                sum += arr[i].getClear();
            }
        }
        return sum;
    }
}
class Institute
{
    private int id,placed,clear;
    private String name, location, grade;
    public Institute(int id, String name, int placed, int clear, String location, String grade) {
        this.id = id;
        this.clear = clear;
        this.name = name;
        this.placed = placed;
        this.location = location;
        this.grade = grade;
    }
    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getClear() {
        return clear;
    }
    public void setClear(int clear) {
        this.clear = clear;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPlaced() {
        return placed;
    }
    public void setPlaced(int placed) {
        this.placed = placed;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}