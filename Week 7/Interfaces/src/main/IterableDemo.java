package main;

import lib.polymorphism.MultipleDice;
import lib.polymorphism.Die;

public class IterableDemo {

    public static void main(String[] args) {

        MultipleDice multiDie = new MultipleDice(6);

        for (Die d: multiDie){
            String result = d.toString();
            System.out.println(result);
        }

        System.out.println("\n");

        multiDie.forEach(Die -> System.out.println(Die.toString()));

    }

}
