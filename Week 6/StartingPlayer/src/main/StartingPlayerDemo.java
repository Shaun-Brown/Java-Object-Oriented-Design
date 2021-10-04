package main;

import lib.Die;
import lib.Name;
import lib.PairOfDice;
import lib.Player;

public class StartingPlayerDemo {

    public static void main(String[] args) {

        Player player1 = new Player(new Name("Shaun", "Brown"), new PairOfDice(new Die(6), new Die(6)));

        System.out.println(player1.getName());

        Player player2 = new Player();
        player2.setName(new Name("Shaun", "Brown"));

        System.out.println(player2.getName());


        player1.rollDice();
        player2.rollDice();

        System.out.println(player1.getDiceScore());
        System.out.println(player1.getPairOfDice());

        System.out.println(player2.getDiceScore());
        System.out.println(player2.getPairOfDice());

        if (player1.getDiceScore() > player2.getDiceScore()) {
            System.out.println("Player 1 wins!");
        } else if (player1.getDiceScore() < player2.getDiceScore()) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Draw!");
        }

    }
}
