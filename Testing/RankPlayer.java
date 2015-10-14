package draftkings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import draftkings.ScoreComparator;

public class RankPlayer {
	public static void main(String[] arg){
		ArrayList<Player> player = new ArrayList<>();
		String[] name = {"Vinno", "Jane", "Todd", "Andrew", "Alex"};
		int[] score = {80, 78, 95, 90, 83};
		for (int i=0; i<5; i++){
			player.add(new Player(name[i], score[i]));
		}
		
		System.out.println("Before sorting: ");
		Iterator<Player> itr = player.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		
		Collections.sort(player, new ScoreComparator());
		System.out.println("\nAfter sorting: ");
		itr = player.iterator();
		int i = 0;
		while (itr.hasNext()){
			Player ptemp = itr.next();
			ptemp.setRank(++i);
			System.out.println(ptemp + " " + ptemp.getRank());
		}
		
	}
}
