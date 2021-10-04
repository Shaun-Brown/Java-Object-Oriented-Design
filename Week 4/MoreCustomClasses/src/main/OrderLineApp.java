package main;

import lib.OrderLine;

public class OrderLineApp {

    public static void main(String[] args) {

        OrderLine[] order = new OrderLine[6];

        order[0]= new OrderLine("1234", 4 , 15);
        order[1] = new OrderLine("1235", 16, 10);
        order[2]= new OrderLine("1236", 15 , 105);
        order[3] = new OrderLine("1237", 8, 52);
        order[4]= new OrderLine("1238", 32 , 6);
        order[5] = new OrderLine("1239", 5, 75);

        for (OrderLine orderLine : order){
            System.out.println(orderLine.toString());
        }

    }

}
