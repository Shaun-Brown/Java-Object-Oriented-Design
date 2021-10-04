package main;

import lib.OrderLine;

import java.util.ArrayList;

public class OrderLineDemo {

    public static void main(String[] args) {

        ArrayList<OrderLine> orders = new ArrayList<>();

        orders.add(new OrderLine("Milk", 100, 30));
        orders.add(new OrderLine("Bread", 130, 20));
        orders.add(new OrderLine("Eggs", 240, 50));
        orders.add(new OrderLine("Bacon", 300, 40));
        orders.add(new OrderLine("Carrots", 80, 30));
        orders.add(new OrderLine("Chocolate", 180, 20));

        int itemCosts = 0;
        int sum = orders.stream().mapToInt(OrderLine::getCost).sum();
        int average = sum/orders.size();

        for(OrderLine o: orders){
            itemCosts += o.getCost();
            System.out.println(o + " subtotal for this item = " + itemCosts);
        }
//        orders.forEach(o -> System.out.println(o + " subtotal for this item = " + o.getCost()));

        System.out.println("The total sum of the arraylist is: " + sum);

        System.out.println("The average sum of the arraylist is: " + average);

    }
}
