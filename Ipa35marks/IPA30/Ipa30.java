import java.util.*;
public class Ipa30 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        Document[] arr = new Document[4];
        for(int i =0; i<4; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            
            arr[i] = new Document(a,b,c,d);
        }
        Document []res = docsWithOddPages(arr);
        if(res != null){
            for(int i=0;i<res.length;i++){
                System.out.println(res[i].getId()+" "+res[i].getTitle()+" "+res[i].getFolderName()+" "+res[i].getPages());
            }
        }
        else
        System.out.println("No odd pages Here.");
        
    }
    public static Document[] docsWithOddPages(Document[] arr){
        Document []ans = new Document[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getPages()%2!=0){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = arr[i];
            }
        }
        Arrays.sort(ans,(a,b) -> a.getId() - b.getId());
        if(ans.length > 0)
        return ans;
        else
        return null;
    }
}
class Document
{
    int id; 
    String title; 
    String folderName; 
    int pages;
    
    public Document(int id, String title, String folderName, int pages)
    {
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }
    
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getFolderName()
    {
        return folderName;
    }
    public void setFolderName(String folderName)
    {
        this.folderName = folderName;
    }
    public int getPages()
    {
        return pages;
    }
    public void setPages(int pages)
    {
        this.pages = pages;
    }
}

