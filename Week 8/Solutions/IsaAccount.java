package lib.bankaccounts;

public class IsaAccount extends InterestAccount {

	//fields
	private int depositRemaining;
	private final int DEFAULT_DEPOSIT; //the default deposit amount to be reset to (initialised by the constructor)


	//constructors
	public IsaAccount() {
		super();
		depositRemaining = 5000;
		DEFAULT_DEPOSIT = 5000;
	}

	public IsaAccount(int balance, int interestRate, int minimumBalance, int depositRemaining) {
		super(balance, interestRate, minimumBalance);
		this.depositRemaining = depositRemaining;
		DEFAULT_DEPOSIT = depositRemaining;
	}

	//methods
	public int getDepositRemaining() {
		return depositRemaining;
	}

	public void resetDepositRemaining() {
		depositRemaining = DEFAULT_DEPOSIT;
	}
	
	public int getDefaultDeposit() {
		return DEFAULT_DEPOSIT;
	}

	@Override
	public void deposit(int amount) {
		if (amount <= depositRemaining) {
			super.deposit(amount);
			depositRemaining = depositRemaining - amount;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "[depositRemaining=" + depositRemaining + "]";
	}


}
