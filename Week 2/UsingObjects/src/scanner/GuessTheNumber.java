package scanner;

import java.util.*;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int target = 24;
        int answer = 0;
        int attempt = 5;

        System.out.println("\t****Hello and Welcome to Shaun Brown's number targeting game!****\t\n\n");
        while (answer!=target) {
            if(true) {
                if (attempt == 5) {
                    System.out.println("Please enter a number...: " + "(" + attempt + " tries left)");
                } else if (attempt == 0) {
                    System.out.println("Sorry, you didn't manage to guess the number within the given attempts. Better luck next time!");
                    break;
                } else {
                    System.out.println("That is incorrect! Please guess again!" + "(" + attempt + " tries left)");
                }
                answer = sc.nextInt();
                attempt--;

                if (answer == target) {
                    System.out.println("Congratulations! You guessed it with " + attempt + " attempts left! You clever bunny you");
                    break;
                }
            } else {
                    System.out.println("Error, there was an issue with the value entered");
                }

        }

        sc.close();

    }
}
