package main;

import lib.employees.*;

import java.util.ArrayList;
import java.util.List;

public class AbstractEmployeeDemo {

    public static void main(String[] args) {

//        List<Employee> employee = new ArrayList<>();
//        //campaign.add(new Advert(1000)); causes error - cannot instantiate Advert
//        employee.add(new BonusEmployee(500.35, new Name("Shaun", "Brown"), new Date(10,4,1994), Gender.MALE, 9.60 ,40, new Date(24,8,2021)));
//        employee.add(new BonusEmployee(250.12, new Name("Samantha", "Brown"), new Date(16,2,1997), Gender.FEMALE, 8.40 ,35, new Date(30,7,2021)));
//        employee.add(new FlexiEmployee(25, new Name("Michael", "Brown"), new Date(14,3,1999), Gender.MALE, 9.24 ,55, new Date(25,7,2021)));
//        employee.add(new FlexiEmployee(15, new Name("Tom", "Curtis"), new Date(5,7,1992), Gender.MALE, 12.21 ,35, new Date(16,7,2021)));
//        employee.add(new OvertimeEmployee(new Name("Ashim", "Ghale"), new Date(30,10,1991), Gender.MALE, 11.42 ,42, new Date(12,7,2021), 6, 12.55));
//        employee.add(new OvertimeEmployee(new Name("Emily", "Turbert"), new Date(20,4,1998), Gender.FEMALE, 9.87 ,60, new Date(17,7,2021), 16, 16.20));
//
//        for (Employee emp : employee) {
//            System.out.println(emp.toString());
//            System.out.println("Cost of employee: " + emp.calculatePay() + "\n");
//        }

        List<Employee> employees = new ArrayList<>();
        employees.add(new OvertimeEmployee(65, 7.5, 5, 15));
        employees.add(new FlexiEmployee(65, 7.5, -5));
        employees.add(new BonusEmployee(65, 7.5, 50));

        for (Employee emp : employees) {
            System.out.println(emp.toString());
            System.out.println("Cost of employee: " + emp.calculatePay() + "\n");
        }

    }

}
