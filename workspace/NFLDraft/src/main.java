import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
//By: Brayton Kerekffy for Milestone 2 and Milestone 3 and Milestone 4
public class main{
	
	public static void main(String[] args){
		NFLPlayerManager playerManager = new NFLPlayerManager(); 
		playerManager.printArr();
	}
	
	public static abstract class NFLPlayers{

		private int age;

		private int playerNumber;

		private int yearsActive;

		private int injuries;

		private int awards;

		private double weight;

		private double height;

		private String position;

		private String school;

		private String player;
        
		NFLPlayers(){
			
		}
		
		NFLPlayers(int age, int playerNumber, int yearsActive, int injuries, int awards, double weight, double height, String position, String school, String player){
		this.age = age;
		this.playerNumber = playerNumber;
		this.yearsActive = yearsActive;
		this.injuries = injuries;
		this.awards = awards;
		this.weight = weight;
		this.height = height;
		this.position = position;
		this.school = school;
		this.player = player;
		}
		
		public int getAge(){
			return this.age;
		}
		public int getPlayerNumber(){
			return this.playerNumber;
		}
		public int getYearsActive(){
			return this.yearsActive;
		}
		public int geInjuries(){
			return this.injuries;
		}
		public int getAwards(){
			return this.awards;
		}
		public double getweight(){
			return this.weight;
		}
		public double getHeight(){
			//converts from meters to inches
			return this.height * 39.3701;
		}
		public String getPosition(){
			return this.position;
		}
		public String getSchool(){
			return this.school;
		}
		public String getPlayer(){
			return this.player;
		}
		public int getAmountOfLifePlayingFootball(){
			return age / yearsActive;
		}
		public String toString(){
			return "my name is " + player + " and I am " + position;
		}
	    public void setAge(int age) {
	        this.age = age;
	    }
	    public void setPlayerNumber(int playerNumber) {
	        this.playerNumber = playerNumber;
	    }
	    public void setYearsActive(int yearsActive) {
	        this.yearsActive = yearsActive;
	    }
	    public void setInjuries(int injuries) {
	        this.injuries = injuries;
	    }
	    public void setAwards(int awards) {
	        this.awards = awards;
	    }
	    public void setWeight(double weight) {
	        this.weight = weight;
	    }
	    public void setHeight(double height) {
	        this.height = height;
	    }
	    public void setPosition(String position) {
	        this.position = position;
	    }
	    public void setSchool(String school) {
	        this.school = school;
	    }
	    public void setPlayer(String player) {
	        this.player = player;
	    }
	    
	    

	}
	
	public static class offensivePlayer extends NFLPlayers{
		offensivePlayer(){
			
		}
		offensivePlayer(int age, int playerNumber, int yearsActive, int injuries, int awards, double weight, double height, String school, String player){
			super(age, playerNumber, yearsActive, injuries, awards, weight, height, "offense", school, player);
		}
	}
	
	public static class defensivePlayer extends NFLPlayers{
		defensivePlayer(){
			
		}
		defensivePlayer(int age, int playerNumber, int yearsActive, int injuries, int awards, double weight, double height, String school, String player){
			super(age, playerNumber, yearsActive, injuries, awards, weight, height, "defense", school, player);
		}
	}
	
	public static class NFLPlayerManager{
		private List<NFLPlayers> arr;
		
		NFLPlayerManager(){
			int n = 6;
        	arr = new ArrayList<NFLPlayers>(n);
        

		      // creates an player objects
		      NFLPlayers player1 = new defensivePlayer(26, 99, 2, 1, 2, 207.9, 1.9, "football university", "joe" );
		      NFLPlayers player2 = new offensivePlayer(22, 49, 7, 2, 1, 170.5, 1.7, "football university", "kim" );
		      NFLPlayers player3 = new offensivePlayer(21, 12, 1, 3, 3, 189.2, 1.2, "football university", "jim" );
		      NFLPlayers player4 = new defensivePlayer(28, 45, 2, 2, 4, 543.3, 1.8, "football university", "woe" );
		      NFLPlayers player5 = new offensivePlayer(26, 76, 4, 5, 3, 209.1, 2.1, "football university", "lim" );
		      NFLPlayers player6 = new defensivePlayer(18, 39, 2, 7, 4, 121.2, 1.9, "football university", "moe" );
		      NFLPlayers player7 = new defensivePlayer(22, 48, 3, 2, 9, 207.5, 1.5, "football university", "bob" );
		      
		      arr.add(player1);
		      arr.add(player2);
		      arr.add(player3);
		      arr.add(player4);
		      arr.add(player5);
		      arr.add(player6);
		      arr.add(player7);
		}
		
		List<NFLPlayers> getArr() {
		       return arr;
		   }
		
		void printArr() {
			System.out.println(arr);
		      
			   // Printing elements one by one 
			      for (int i=0; i<arr.size(); i++) 
			      System.out.print(arr.get(i)+" "); 
		}
	}
}
	
