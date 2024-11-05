import java.util.Scanner;
public class Ipa11 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Player []arr = new Player[4];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Player(a,b,c,d);
        }
        String skill = sc.nextLine();
        String level = sc.nextLine();
        int res1 = findPointsForGivenSkill(arr, skill);
        if(res1 == 0)
        System.out.println("The given Skill is not available");
        else
        System.out.println(res1);

        Player res2 = getPlayerBasedOnLevel(arr, level, skill);
        if(res2 == null)
        System.out.println("No player is available with specified level, skill \r\n" + //
                        "and eligibility points");
        else
        System.out.println(res2.getPlayerId());
    }

    static Player getPlayerBasedOnLevel(Player []arr,String level, String skill){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getLevel().equalsIgnoreCase(level) && arr[i].getSkill().equalsIgnoreCase(skill) && arr[i].getPoints() >= 20){
                return arr[i];
            }
        }
        return null;
    }

    static int findPointsForGivenSkill(Player []arr, String skill){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getSkill().equalsIgnoreCase(skill)){
                sum += arr[i].getPoints();
            }
        }
        return sum;
    }
}

class Player
{
	private int playerId;
	private String skill;
	private String level;
	private int points;

	public Player(int playerId, String skill, String level, int points)
	{
		this.playerId = playerId;
		this.skill = skill;
		this.level = level;
		this.points = points;
	}	
	
	public int getPlayerId()
	{
		return playerId;
	}
	public void setPlayerId(int playerId)
	{
		this.playerId = playerId;
	}
	public String getSkill()
	{
		return skill;
	}
	public void setSkill(String skill)
	{
		this.skill = skill;
	}
	public String getLevel()
	{
		return level;
	}
	public void setLevel(String level)
	{
		this.level = level;
	}
	public int getPoints()
	{
		return points;
	}
	public void setPoints(int points)
	{
		this.points = points;
	}
}