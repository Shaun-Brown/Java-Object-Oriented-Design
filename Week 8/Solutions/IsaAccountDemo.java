package main;

import lib.bankaccounts.IsaAccount;

public class IsaAccountDemo {

	public static void main(String[] args) {
		IsaAccount isa = new IsaAccount();
		
		System.out.println("Initial deposit remaining? " + isa.getDepositRemaining());
		System.out.println("Initial balance? " + isa.getBalance());
		
		
		System.out.println("\nAttempting to deposit 4000");
		isa.deposit(4000);
		
		System.out.println("Deposit remaining? " + isa.getDepositRemaining());
		System.out.println("Balance? " + isa.getBalance());
		
		
		System.out.println("\nAttempting to deposit 600");
		isa.deposit(600);
		
		System.out.println("Deposit remaining? " + isa.getDepositRemaining());
		System.out.println("Balance? " + isa.getBalance());
		
		
		System.out.println("\nAttempting to deposit 600");
		isa.deposit(600);
		
		System.out.println("Deposit remaining? " + isa.getDepositRemaining());
		System.out.println("Balance? " + isa.getBalance());
	}

}
