package generics;

/**
 * Add players to a specific sporting team and track games
 */
import java.util.ArrayList;

public class Team<T extends Player> {
	private String name;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;
	
	private ArrayList<T> members = new ArrayList<>();
	
	public Team(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;

	}
	
	public boolean addPlayer(T player) {
		if (members.contains(player)) {
			System.out.println( player.getName() + " is already on the team");
			return false;
		} else {
			members.add(player);
			System.out.println( player.getName() + " picked for team " + this.name);
			return true;
		}
		
	}
	
	public int numPlayers() {
		return this.members.size();
	}
	
	public void matchResults(Team opponent, int ourScore, int theirScore) {
		if(ourScore > theirScore) {
			won++;
		} else if(ourScore == theirScore) {
			tied++;
		} else {
			lost++;
		}
		
		played++;
		if(opponent != null) {
			opponent.matchResults(null, theirScore, ourScore);
		}
		
	}
	
	public int ranking() {
		return (won * 2) + tied;
	}
	
	
}