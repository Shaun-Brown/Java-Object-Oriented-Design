package lib.bankaccounts;

public class IsaAccount extends InterestAccount {

    private int depositRemaining;

    public IsaAccount() {
        depositRemaining = 0;
    }

    public IsaAccount(int depositRemaining) {
        this.depositRemaining = Math.max(depositRemaining, 0);
    }

    public IsaAccount(int balance, int interestRate, int minimumBalance, int depositRemaining) {
        super(balance, interestRate, minimumBalance);
        this.depositRemaining = Math.max(depositRemaining, 0);
    }

    public void deposit(int amount) {
        if (depositRemaining - amount >= 0) {
            super.deposit(amount);
            this.depositRemaining = depositRemaining - amount;
        }
    }

    public int getDepositRemaining() {
        return depositRemaining;
    }

    public void resetDepositRemaining(){
        this.depositRemaining = 5000;
    }

    @Override
    public String toString() {
        return super.toString() + "[depositRemaining=" + depositRemaining + ']';
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)){
            return false;
        }

        IsaAccount other = (IsaAccount) obj;

        return this.depositRemaining == other.depositRemaining;
    }
}
