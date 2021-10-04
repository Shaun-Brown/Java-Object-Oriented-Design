package scanner;

import java.util.Scanner;

public class SentenceGuesser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\t***Welcome to the Sentence Guesser Game!***\t");

        System.out.println("Please enter a sentence... : ");
        String sentence = sc.nextLine();
        System.out.println("Your sentence is : '" + sentence + "'");

        char[] vowel = {'a', 'e', 'i', 'o', 'u'};

        String[] split = sentence.split(" ");

        System.out.println("Your sentence has " + split.length + " words");

        int vowelcount = 0;

        for (int i = 0; i < sentence.length(); i++){
            char ch = sentence.charAt(i);
                for (char s: vowel){
                if (ch == s) {
                    vowelcount ++;
                }
            }
        }
        System.out.println("Your sentence has " + vowelcount + " vowels");

        double sentenceLength = sentence.length();
        double vowelPercentage = vowelcount / sentenceLength * 100.00;
        double toTwoDecimal = Math.round(vowelPercentage * 100.00) / 100.00;

        System.out.println("The percentage of vowels in your sentence is: " + toTwoDecimal + "%");

        sc.close();

    }

}
