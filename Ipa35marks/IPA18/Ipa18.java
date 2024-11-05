import java.util.*;
public class Ipa18 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Antenna []arr = new Antenna[4];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();

            arr[i] = new Antenna(a,b,c,d);
        }
        String name = sc.nextLine();
        double VSWR = sc.nextDouble(); sc.nextLine();
        int res1 = searchAntennaByName(arr, name);
        if(res1 == 0)
        System.out.println("There is no antenna with the given parameter");
        else
        System.out.println(res1);

        Antenna []res = sortAntennaByVSWR(arr, VSWR);
        if(res == null)
        System.out.println("No Antenna found");
        else{
            for(int i=0;i<res.length;i++){
                System.out.println(res[i].getLead());
            }
        }
    }
    static Antenna[] sortAntennaByVSWR(Antenna []arr, double VSWR){
        Antenna []ans = new Antenna[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getVSWR() < VSWR){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        for(int i=0;i<ans.length-1;i++){
            for(int j=0;j<ans.length-i-1;j++){
                if(ans[j].getVSWR() > ans[j+1].getVSWR()){
                Antenna temp = ans[j];
                ans[j] = ans[j+1];
                ans[j+1] = temp;
                }
            }
        }
        if(ans.length > 0)
        return ans; 
        else
        return null;
    }
    static int searchAntennaByName(Antenna []arr, String name){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getName().equalsIgnoreCase(name)){
                return arr[i].getId();
            }
        }
        return 0;
    }
}
class Antenna
{
	private int id;
	private String name,lead;
	private double VSWR;
	public Antenna(int id, String name, String lead, double VSWR)
	{
		this.id = id;
		this.name = name;
		this.lead = lead;
		this.VSWR = VSWR;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getLead()
	{
		return lead;
	}
	public void setLead(String lead)
	{
		this.lead = lead;
	}
	public double getVSWR()
	{
		return VSWR;
	}
	public void setVSWR()
	{
		this.VSWR=VSWR;
	}
}