package bank;

import java.io.FileNotFoundException;

public class BankAccount {
	double balance = 0.0;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	//checks for negative balance and throws exception with a parameter
	public void withdraw(double withdraw) throws NegativeBalanceException, FileNotFoundException {
		if(withdraw > balance) {
			throw new NegativeBalanceException(withdraw-balance);
		} else {
			balance -= withdraw;
		}
	}
	
	//checks for negative balance and throws exception w/o a parameter
	public void quickWithdraw(double withdraw) throws NegativeBalanceException {
		if(withdraw > balance) {
			throw new NegativeBalanceException();
		} else {
			balance -= withdraw;
		}
	}

}
