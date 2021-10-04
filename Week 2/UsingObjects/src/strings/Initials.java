package strings;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fullName = sc.nextLine();

        int x = fullName.indexOf(" ");

        String initials = fullName.charAt(0) + "" + fullName.charAt(x+1);

        System.out.println("The initials for " + fullName + " are " + initials);

        System.out.println(fullName + "'s email address is " + initials.toLowerCase() + "@email.dmu.ac.uk");

    }


}
