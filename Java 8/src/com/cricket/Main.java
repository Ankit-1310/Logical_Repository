package com.cricket;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Player player = new Player("Ankit",54,"Bastman");
		Player player1 = new Player("Ram",34,"Bowller");
		Player player2 = new Player("Shyam",65,"Bastman");
		Player player3 = new Player("Pratik",23,"Bowller");
		List<Player> listOfPlayer = new ArrayList<>();
		listOfPlayer.add(player);
		listOfPlayer.add(player1);
		listOfPlayer.add(player2);
		listOfPlayer.add(player3);
		
		Team team = new Team();
		team.setlistOfPlayer(listOfPlayer);
		
		int totalScore = team.getScore();
		System.out.println(totalScore);
	}
}
