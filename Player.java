
public class Player {
	private String playerName;
	private String playerAge;
	private String playerType;
	private double playerStats;
	
	public static void main(String[] args);
	public Player (String plyName, String plyAge, String plyType, double plyStats ){
		playerName = plyName;
		playerAge = plyAge;
		playerType = plyType;
		playerStats = plyStats;
	}
		public void displayPlayerDetails () {
			System.out.println("Player Name: " + playerName);
			System.out.println("Player Age: " + playerAge);
			System.out.println("Player Type: " + playerType);
			System.out.println("Player Stats: " + playerStats);
		}
}