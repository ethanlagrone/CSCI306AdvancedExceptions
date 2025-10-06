package bank;

public class ATM {
	BankAccount bankacct;//idk what will actually be in this

	public ATM() {
		super();
		this.bankacct = new BankAccount(500);
	}
	
	public void handleTransactions() {
		try {
			bankacct.withdraw(600);
		}
		catch(NegativeBalanceException e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		try {
			bankacct.quickWithdraw(600);
		}
		catch(NegativeBalanceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.handleTransactions();
		
	}
	
}
