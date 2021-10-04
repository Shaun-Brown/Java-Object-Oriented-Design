package main;
import java.util.ArrayList;

import lib.bankaccounts.*;

public class BankAccountDemo {

    public static void main(String[] args) {
        /* Testing BankAccount */
    	BankAccount acc = new BankAccount(100);
        System.out.println(acc);
        acc.deposit(50);
        acc.withdraw(40);
        System.out.println(acc.getBalance()); //balance = 110
        acc.withdraw(150);
        System.out.println(acc.getBalance()); //balance = -40

        
        /* Testing InterestAccount */
        InterestAccount intAcc = new InterestAccount(3000, 5, 1000);
        System.out.println("\n" + intAcc);
        intAcc.withdraw(1800);
        System.out.println(intAcc.getBalance()); //balance = 1200
        intAcc.addInterest();
        System.out.println(intAcc.getBalance()); //balance = 1260
        intAcc.withdraw(500);
        System.out.println(intAcc.getBalance()); //balance = 1260 - no change

        
        /* Notice how an instance of a sub-class can be assigned
         * to a variable of super-class type. Dynamic method lookup
         * ensures the overridden InterestAccount withdraw(...) method
         * is invoked. However, if you try to invoke the addInterest()
         * method it will not work as BankAccount does not implement it. */
        BankAccount myAcc = new InterestAccount(1500, 2, 1000);
        System.out.println("\n" + myAcc); //displays InterestAccount even though stored in BankAccount variable
        System.out.println(myAcc.getBalance()); //balance = 1500
        myAcc.withdraw(600);
        System.out.println(myAcc.getBalance()); //balance = 1500 - no change
//        myAcc.addInterest(); // <--- try removing this comment, will give syntax error
        
        
        /* TEST StudentAccount here... */
        StudentAccount sAcc = new StudentAccount(-500,1000);
        System.out.println(sAcc);
        sAcc.deposit(50);
        sAcc.withdraw(40);
        System.out.println(sAcc.getBalance()); //balance = -490
        sAcc.withdraw(550);
        System.out.println(sAcc.getBalance()); //balance = -940
        
        
        /* TEST IsaAccount here... */
        IsaAccount isaAcc = new IsaAccount(2000);
        System.out.println(isaAcc);
        System.out.println(isaAcc.getBalance());
        System.out.println(isaAcc.getDepositRemaining());
        isaAcc.deposit(300);
        System.out.println(isaAcc.getDepositRemaining());
        System.out.println(isaAcc.getBalance());
        isaAcc.deposit(500);
        System.out.println(isaAcc.getBalance());
        System.out.println(isaAcc.getDepositRemaining());
        isaAcc.deposit(500);
        System.out.println(isaAcc.getBalance());
        System.out.println(isaAcc.getDepositRemaining());
        isaAcc.deposit(500);
        System.out.println(isaAcc.getBalance());
        System.out.println(isaAcc.getDepositRemaining());
        
        
        /* Create ArrayList to hold different types of bank account. */
        ArrayList<BankAccount> banks = new ArrayList<>();
        //Objects of type BankAccount or any of its subclasses can be added
        banks.add(new BankAccount(3000));
        banks.add(new BankAccount(1200));
        banks.add(new InterestAccount(2500, 3, 1000));
        banks.add(new InterestAccount(6000, 5, 5000));
        banks.add(new StudentAccount(200, 1000));
        banks.add(new StudentAccount(-250, 1500));
        banks.add(new IsaAccount(800, 5, 0, 1000));
        banks.add(new IsaAccount(2000, 2, 0, 1500));
        /* ADD objects of type StudentAccount and IsaAccount once implemented */
        
        System.out.println("\nProcessing bank accounts in list...");
        //different type of object can be processed uniformly, this is known as polymorphism 
        for (BankAccount b : banks) {
        	//subclass instances will either invoke inherited or overridden methods
        	System.out.println("=====\n" + b.toString());
        	System.out.println("Balance = " + b.getBalance());
        	b.deposit(300);
        	System.out.println("Balance = " + b.getBalance());
        	b.withdraw(1500);
        	System.out.println("Balance = " + b.getBalance());
        }


        
    }
}

