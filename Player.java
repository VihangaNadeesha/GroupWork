
public class Player {
	private String playerName;
	private String playerAge;
	private String playerType;
	private double playerStats;
	
	public Player (String playerName, String playerAge, String playerType, double playerStats ){
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.playerType = playerType;
		this.playerStats = playerStats;
	}
	void Addplayers (){
		System.out.println("Enter players Name ");
		playerName = input.nextline;
		System.out.println("Enter players age ");
		playerage = input.nextInt;
		System.out.println("Enter players Type ");
		playerType = input.nextline;
		System.out.println("Enter playersstatus  ");
		playerStats = input.nextline;
	
	
	}
	
	public void displayPlayerDetails () {
		System.out.println("Player Name: " + playerName);
		System.out.println("Player Age: " + playerAge);
		System.out.println("Player Type: " + playerType);
		System.out.println("Player Stats: " + playerStats);
	}
	
	void average () { 
		
	}
}
