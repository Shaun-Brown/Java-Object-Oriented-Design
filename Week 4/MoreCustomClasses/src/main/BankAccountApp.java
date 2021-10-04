package main;

import lib.BankAccount;

public class BankAccountApp {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(150);

        System.out.println(account.getBalance());

        account.withdraw(50);
        System.out.println(account.getBalance());

        account.withdraw(200);
        System.out.println(account.getBalance());

    }
}
