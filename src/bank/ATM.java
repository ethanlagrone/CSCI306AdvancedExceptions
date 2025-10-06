package bank;

public class ATM {
	BankAccount bankacct = new BankAccount(500);//idk what will actually be in this

	public ATM(BankAccount bankacct) {
		super();
		this.bankacct = bankacct;
	}
	
	public void handleTransactions() {
		try {
			bankacct.withdraw(600);
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		try {
			bankacct.quickWithdraw(600);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		}
	}
	
	public static void main(String[] args) {
		//stub
	}
	
}
