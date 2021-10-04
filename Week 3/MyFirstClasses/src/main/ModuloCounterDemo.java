package main;

import lib.ModuloCounter;

public class ModuloCounterDemo {

    public static void main(String[] args) {

        System.out.println("\nWelcome to Shaun's Modulo Counter\n---------------------------------\n");

        ModuloCounter mod = new ModuloCounter();

        System.out.println("Our counter starts here: " + mod.getCount() + "\n");
        mod.increment();
        mod.increment();
        System.out.println("After 2 increments our counter is set to: " + mod.getCount() + "\n");
        mod.increment();
        mod.increment();
        mod.increment();
        mod.increment();
        System.out.println("After 4 more increments our counter is set to: " + mod.getCount() + "\n");
        mod.increment();
        mod.increment();
        mod.increment();
        mod.increment();
        System.out.println("After 4 more increments our counter is set to: " + mod.getCount() + "\n");
        mod.decrement();
        mod.decrement();
        mod.decrement();
        System.out.println("After 3 decrements out counter is set to: " + mod.getCount() + "\n");

        mod.setCount(124);
        System.out.println("If we set our counter 124 times, our counter will land on: " + mod.getCount() + "\n");

        System.out.println("The counter has been through: " + mod.getCycles() + " cycles\n");

    }
}
