package draftkings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import draftkings.ScoreComparator;

public class RankPlayer2 {
	public static void main(String[] arg){
		
//		//USING ARRAYLIST
//		ArrayList<Player> player = new ArrayList<>();
//		String[] name = {"Vinno", "Jane", "Todd", "Andrew", "Alex"};
//		int[] score = {80, 78, 95, 90, 83};
//		for (int i=0; i<5; i++){
//			player.add(new Player(name[i], score[i]));
//		}
//		
//		System.out.println("Before sorting: ");
//		Iterator<Player> itr = player.iterator();
//		while (itr.hasNext()){
//			System.out.println(itr.next());
//		}
//		
//		Collections.sort(player, new ScoreComparator());
//		//Collections.sort(player, Collections.reverseOrder(new ScoreComparator()));
//		System.out.println("\nAfter sorting: ");
//		itr = player.iterator();
//		int i = 0;
//		while (itr.hasNext()){
//			Player ptemp = itr.next();
//			ptemp.setRank(++i);
//			System.out.println(ptemp + " " + ptemp.getRank());
//		}
		
		
		//USING STATIC ARRAY
		
		Player[] players = { new Player("Vinno", 80),new Player("Jane", 78),new Player("Todd", 95),new Player("Andrew", 90),new Player("Alex", 83)};
		
		
		//Before sorting
		System.out.println("Before sorting: ");
		for(Player p : players){
			System.out.println(p + " " + p.getRank());
		}
		
		
		//After sorting
		Arrays.sort(players, new ScoreComparator());
		System.out.println("\nAfter sorting: ");
		int i = 0;
		for(Player p : players){
			p.setRank(++i);
			System.out.println(p + " " + p.getRank());
		}
		
		
	}
}
