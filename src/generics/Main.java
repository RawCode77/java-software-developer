package generics;

public class Main {

	public static void main(String[] args) {
	/**	ArrayList<Integer> items = new ArrayList<>();
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);
		items.add(5);
		
		printDoubled(items);

	}
	
	private static void printDoubled(ArrayList<Integer> n) {
		for(int i : n) {
			System.out.println(i * 2);
		}
  **/	
		
	FootballPlayer zach = new FootballPlayer("Zach Collaros");
	BaseballPlayer larry = new BaseballPlayer("Larry Walker");
	SoccerPlayer alphonso = new SoccerPlayer("Alphonso Davies");
	
	Team<FootballPlayer> allouettes = new Team<FootballPlayer>("Allouettes");
	allouettes.addPlayer(zach);
	//allouettes.addPlayer(larry);
	//allouettes.addPlayer(alphonso);
	
	System.out.println(allouettes.numPlayers());
	
	Team<BaseballPlayer> expos = new Team<BaseballPlayer>("Montreal Expos");
	expos.addPlayer(larry);
	
	Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
	brokenTeam.addPlayer(alphonso);
	
	}

}
