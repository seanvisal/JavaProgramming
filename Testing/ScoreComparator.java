package draftkings;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Player>{
	
	@Override
	public int compare(Player p1, Player p2){
		//ascending
		//return p1.getScore() - p2.getScore();
		//descending
		return p2.getScore() - p1.getScore();
	}
}
