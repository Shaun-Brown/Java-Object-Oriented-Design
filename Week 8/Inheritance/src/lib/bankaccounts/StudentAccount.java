package lib.bankaccounts;

public class StudentAccount extends BankAccount {

    private int overdraftLimit;

    public StudentAccount() {
        overdraftLimit = 0;
    }

    public StudentAccount(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public StudentAccount(int balance, int overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(int amount){
        if (super.getBalance() - amount >= -overdraftLimit) {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "[overdraftLimit=" + overdraftLimit + "]";
    }

    @Override
    public boolean equals(Object obj){
        if (!super.equals(obj)){
            return false;
        }

        StudentAccount other = (StudentAccount) obj;

        return this.overdraftLimit == other.overdraftLimit;
    }
}
