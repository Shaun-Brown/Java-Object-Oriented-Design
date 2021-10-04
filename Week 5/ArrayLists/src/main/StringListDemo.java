package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringListDemo {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("Penis");
        list.add("Bum");
        list.add("Boobs");
        list.add("I am a creepy man");
        list.add("Waste of my time");
        list.add("I have troubled thoughts");

        list.set(1, "BBQ sauce all over my tiddies");

        System.out.println(list);

        for (String l: list) {
            System.out.println(l.toUpperCase());
        }

        list.forEach(l -> System.out.println(l.toUpperCase()));

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Penis");
        list2.add("Bum");
        list2.add("Boobs");
        list2.add("I am a creepy man");
        list2.add("Waste of my time");
        list2.add("I have troubled thoughts");

        list2.remove(2);
        list2.set(2, "BBQ sauce all over my tiddies");



        System.out.println(list2);

        System.out.println("\n");

        if(list.equals(list2)) {
            System.out.println("The lists are the same!");
        } else if(!list.equals(list2)) {
            System.out.println("The lists are different!");
        } else {
            System.out.println("There is an error in this statement!");
        }



    }

}
