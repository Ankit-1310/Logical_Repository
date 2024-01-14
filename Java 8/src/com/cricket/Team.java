package com.cricket;

import java.util.List;

public class Team {
	private List<Player> listOfPlayer;
	public int getScore() {
		if(listOfPlayer !=null) {
			return listOfPlayer.stream().mapToInt(Player-> Player.getScore()).reduce(0, (a,b)-> a+b);
		}
		return 0;
	}
	public List<Player> getlistOfPlayer(){
		return listOfPlayer;
	}
	public void setlistOfPlayer(List<Player> listOfPlayer) {
		this.listOfPlayer=listOfPlayer;
	}
	
}
