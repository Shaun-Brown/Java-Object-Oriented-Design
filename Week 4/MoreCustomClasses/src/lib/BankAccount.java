package lib;

public class BankAccount {

    private static String accountNo;
    private int balance;

    public BankAccount() {
        accountNo = "";
        balance = 0;
    }

    BankAccount(String accountNo){
        BankAccount.accountNo = accountNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int balance){
        this.balance += balance;
    }

    public void withdraw(int balance){
        if(this.balance - balance >= 0){
            this.balance -= balance;
        }
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        BankAccount other = (BankAccount) obj;
        return this.balance == other.balance;
    }

    @Override
    public String toString(){
        return "Bank Account:[account number=" + accountNo + ", balance=" + balance + "]";
    }
}
