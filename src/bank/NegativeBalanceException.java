package bank;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class NegativeBalanceException extends Exception {
	double negativeBalance = 0.0;

	public NegativeBalanceException() {
		super("Error: Negative Balance");
	}

	public NegativeBalanceException(double negativeBalance) throws FileNotFoundException {
		super("Amount exceeds balnce by: " + negativeBalance);
		this.negativeBalance = negativeBalance;
		PrintWriter out = new PrintWriter("log.txt");
		out.write("Amount exceeds balnce by: " + negativeBalance);
		out.close();
	}

	@Override
	public String toString() {
		//stub generated
		return "Balance of " + negativeBalance + " not allowed.";
	}
	
	public static void main(String[] args) throws NegativeBalanceException, FileNotFoundException {
		double balance = -1.0;
		if(balance < 0.0) {
			throw new NegativeBalanceException();
		}
	}


	
}
