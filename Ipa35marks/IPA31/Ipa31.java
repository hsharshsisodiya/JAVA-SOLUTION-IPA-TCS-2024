import java.util.*;
public class Ipa31{
        public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Music[] arr = new Music[4];
        for(int i=0; i<4; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            arr[i] = new Music(a,b,c,d);
        }
        int count = sc.nextInt(); sc.nextLine();
        int duration = sc.nextInt(); sc.nextLine();

        int res = findAvgOfCount(arr, count);
        if(res == 0)
        System.out.println("No playlist found");
        else
        System.out.println(res);

        Music []res1 = sortTypeByDuration(arr, duration);
        if(res1 != null){
            for(int i=0;i<res1.length;i++){
            // System.out.println(res1[i].getPNo());
            System.out.println(res1[i].getType());
            // System.out.println(res1[i].getCount());
            // System.out.println(res1[i].getDuration());
            }
        }
        else
        System.out.println("No playlist found with mentioned attribute");
    }
    public static Music [] sortTypeByDuration(Music []arr, int duration){
        Music []ans = new Music[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getDuration() > duration){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        for(int i=0;i<ans.length-1;i++){
            for(int j=0;j<ans.length-i-1;j++){
                if(ans[j].getDuration() > ans[j+1].getDuration()){
                    Music temp = ans[j];
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
    public static int findAvgOfCount(Music []arr, int count){
        int avg = 0;
        int count1 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getCount() > count){
                avg += arr[i].getCount();
                count1++;
            }
        }
        if(avg == 0)
        return 0;
        else
        return avg/count1;
    }
}

class Music
{
    int pNo, count;
    String type;
    double duration;
    
    public Music(int pNo, String type, int count, double duration)
    {
        this.pNo = pNo;
        this.type = type;
        this.count = count;
        this.duration = duration;
    }
    
    public int getPNo()
    {
        return pNo;
    }
    public void setPNo(int pNo)
    {
        this.pNo = pNo;
    }
    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count = count;
    }
    public double getDuration()
    {
        return duration;
    }
    public void setDuration(double duration)
    {
        this.duration = duration;
    }
}

