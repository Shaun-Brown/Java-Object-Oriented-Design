package lib;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

    @Test
    public void testDefaultConstructor(){
        BankAccount account = new BankAccount();

        assertEquals("AccountNo field should be initialised with ''", "", account.getAccountNo());
        assertEquals("Balance field should be initialised with 0", 0, account.getBalance());
    }

    @Test
    public void testConstructor1(){
        BankAccount account = new BankAccount();
        account = new BankAccount("SHAUN109");
        account.deposit(50);

        assertEquals("AccountNo field should be initialised with ''", "SHAUN109", account.getAccountNo());
        assertEquals("Balance field should be initialised with 0", 50, account.getBalance());
    }

    @Test
    public void testGetAccountNo(){
        BankAccount account = new BankAccount();
        account = new BankAccount("SHAUN109");

        assertEquals("AccountNo field should be initialised with ''","SHAUN109", account.getAccountNo());
    }

    @Test
    public void testGetBalance(){
        BankAccount account = new BankAccount();
        account.deposit(50);

        assertEquals("AccountNo field should be initialised with ''", 50, account.getBalance());
    }

    @Test
    public void testDeposit(){
        BankAccount account = new BankAccount();
        account.deposit(50);

        assertEquals("AccountNo field should be initialised with ''", 50, account.getBalance());
    }

    @Test
    public void testWithdraw(){
        BankAccount account = new BankAccount();
        account.deposit(50);
        account.withdraw(25);

        assertEquals("AccountNo field should be initialised with ''", 25, account.getBalance());
    }

    @Test
    public void testEqualsTrue() {
        BankAccount account = new BankAccount("SHAUN109");
        BankAccount account2 = new BankAccount("SHAUN109");

        assertTrue("The equals method should return true for two objects with the same state", account.equals(account2));
    }

    @Test
    public void testEqualsFalse() {
        BankAccount account = new BankAccount("SHAUN109");
        BankAccount account2 = new BankAccount("SHAUN104");

        assertNotEquals("The equals method should return false for two objects with different account numbers", account, account2);

    }

    @Test
    public void testEqualsNull() {
        BankAccount account = new BankAccount("SHAUN109");
        BankAccount account2 = null;

        assertNotEquals("The equals method should safely return false as the argument is null", account, account2);
    }

    @Test
    public void testEqualsClassType() {
        BankAccount account = new BankAccount("SHAUN109");
        String s = "food";

        assertNotEquals("The equals method should safely return false as the argument is of a different class type", account, s);
    }

    @Test
    public void testToString(){
        BankAccount account = new BankAccount("Shaun109");
        account.deposit(50);
        String toStr = account.toString();

        assertTrue("The toString method should be in the standard convention format",
                toStr.startsWith("Bank Account:[account number=" + account.getAccountNo()) &&
                        toStr.endsWith("balance=" + account.getBalance() + "]"));
    }

}
