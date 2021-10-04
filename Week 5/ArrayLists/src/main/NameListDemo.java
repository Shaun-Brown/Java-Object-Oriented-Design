package main;

import lib.Name;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameListDemo {

    public static void main(String[] args) {

        List<Name> register = new ArrayList<>();
/*
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter you first name:");
            String fName = scan.nextLine();
            System.out.println("Enter you last name:");
            String lName = scan.nextLine();
            Name reg = new Name(fName, lName);
            register.add(reg);
        }

        for (Name r: register) {
            System.out.println(r.getFullName());
        }

        boolean exists = register.stream().anyMatch(nm -> nm.getFamilyName().equals("Smith"));

        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter you first name:");
            String fName = scan.nextLine();
            System.out.println("Enter you last name:");
            String lName = scan.nextLine();
            Name reg = new Name(fName, lName);
            register.add(reg);
        }

        register.stream().filter(name -> name.getFullName().length() > 10).forEach(name -> System.out.println(name.getFullName()));
*/
        Name myName = new Name("Shaun","Brown");
        register.add(new Name ("Tom", "Curtis"));
        register.add(new Name ("Steve", "Jobs"));
        register.add(new Name ("Joe", "Bloggs"));
        register.add(new Name ("Ashim", "Gale"));
        register.add(new Name ("Michael", "Evans"));
        register.add(new Name ("Emily", "Turbert"));
        register.add(new Name ("Shaun","Brown"));

        register.forEach(System.out::println);

        if(register.contains(myName)){
            System.out.println("They match!");
        } else {
            System.out.println("Error, something is wrong");
        }

    }

}
