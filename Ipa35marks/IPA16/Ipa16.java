import java.util.Scanner;
public class Ipa16 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        NavalVessel []arr = new NavalVessel[4];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new NavalVessel(a,b,c,d,e);
        }
        int per1 = sc.nextInt(); sc.nextLine();
        String purpose = sc.nextLine();

        int res1 = findAvgVoyagesByPct(arr, per1);
        if(res1 == 0)
        System.out.println("No are there");
        else
        System.out.println(res1);

        NavalVessel res2 = findVesselByGrade(arr, purpose);
        if(res2 != null){
            int per = (res2.getComp()*100)/res2.getPlan();
            if(per == 100)
            System.out.println(res2.getName()+"%Star");
            else if(per <= 99 && per >= 80 )
            System.out.println(res2.getName()+"%Leadar");
            else if(per <= 79 && per >= 55)
            System.out.println(res2.getName()+"%Inspirer");
            else
            System.out.println(res2.getName()+"%Striver");
        }
        else
        System.out.println("No Naval Vessel is available with the specified purpose");
    }
    static NavalVessel findVesselByGrade(NavalVessel []arr, String purpose){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getPurpose().equalsIgnoreCase(purpose)){
                return arr[i];
            }
        }
        return null;
    }

    static int findAvgVoyagesByPct(NavalVessel []arr, int per1){
        int sum = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int calPer = (arr[i].getComp() * 100)/arr[i].getPlan();
            if(calPer >= per){
                sum += arr[i].getComp();
                count++;
            }
        }
        if(sum == 0)
        return 0;
        else
        return sum/count;
    }
}
class NavalVessel
{
    int id, plan, comp;
    String name, purpose;

    public NavalVessel(int id, String name, int plan, int comp, String purpose)
    {
      this.name=name;
        this.plan = plan;
        this.comp = comp;
        this.purpose = purpose;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }

    public int getComp() {
        return comp;
    }

    public void setComp(int comp) {
        this.comp = comp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    
    }
    
}