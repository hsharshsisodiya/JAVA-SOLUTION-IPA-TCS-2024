import java.util.Scanner;
import java.util.Arrays;
public class Ipa12 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Medicine []arr = new Medicine[4];
        for(int i=0;i<arr.length;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Medicine(a,b,c,d);
        }
        String disease = sc.nextLine();
        Medicine []res = getPriceByDisease(arr, disease);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i].getPrice());
        }

    }
    static Medicine[] getPriceByDisease(Medicine []arr, String disease){
        Medicine []ans = new Medicine[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getDisease().equals(disease)){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        
        for(int i=0;i<ans.length-1;i++){
            for(int j=0;j<ans.length-i-1;j++){
                if(ans[j].getPrice() > ans[j+1].getPrice()){
                    Medicine temp = ans[j];
                    ans[j] = ans[j+1];
                    ans[j+1] = temp;
                }
            }
        }
        return ans;
    }
}

class Medicine
{
    String name;
    String batch;
    String disease;
    int price;

    public Medicine(String name, String batch, String disease, int price)
    {
        this.name = name;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getBatch()
    {
        return batch;
    }
    public void setBatch(String batch)
    {
        this.batch = batch;
    }
    public String getDisease()
    {
        return disease;
    }
    public void setDisease(String disease)
    {
        this.disease = disease;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
}
