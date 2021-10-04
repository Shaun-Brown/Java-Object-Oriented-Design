package main;

import lib.Player;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PlayerApp {

	public static String execute(ArrayList<Player> players, String fullName) {

		Player player1 = new Player();
		player1.setFullPlayerName(fullName);
		players.set(0, player1);

		return players.stream()
				.filter(player -> player.getName().getFullName().contains("a"))
				.map(player -> player.getName().getFirstName().toLowerCase() + ", " + player.getName().getFamilyName().toUpperCase() + "\n")
				.collect(Collectors.joining(""));

	}
	
}
