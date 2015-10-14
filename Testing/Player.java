package draftkings;

public class Player {
	private String name;
	private int score;
	private int rank;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public Player() {
		super();
	}
	
	@Override
	public String toString(){
		return this.name;
	}
	
}
