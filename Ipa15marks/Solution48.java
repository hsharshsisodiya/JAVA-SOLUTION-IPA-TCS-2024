/* Group the employees by city 

 * Input:
 * ----------------
 * Employee |      City
 * ---------------------
 * Arijit       Kolkata
 * Minaz        Mumbai
 * Rahul        Chennai
 * Rajesh       Kolkata
 * Sekhar       Chennai
 * Kasim        Chennai

 * Output:
 * ----------------
 * Kolkata: Arijit,Rajesh
 * Mumbai: Minaz
 * Chennai: Rahul,Sekhar,Kasim
 */
import java.util.*;
public class Solution48 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        LinkedHashMap <String,String> map = new LinkedHashMap<>();
        System.out.print("Typre how many enployee:");
        int size = sc.nextInt(); sc.nextLine();
        for(int i=0;i<size;i++){
            System.out.print((i+1)+" Enter name:");
            String emp = sc.nextLine();
            System.out.print((i+1)+" Enter city:");
            String city = sc.nextLine();
            map.put(emp,city);
        }
        for(HashMap.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println();
        LinkedHashMap <String,String> up = new LinkedHashMap<>();
        for(HashMap.Entry<String,String> entry : map.entrySet()){
            if(!up.containsKey(entry.getValue())){
                up.put(entry.getValue(),entry.getKey());
            }
            else{
                up.put(entry.getValue(),up.get(entry.getValue())+","+entry.getKey());
            }
        }
        for(HashMap.Entry<String,String> entry : up.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        } 
    }
}
