package bank;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class NegativeBalanceException extends Exception {
	double negativeBalance;

	public NegativeBalanceException() {
		//no provided argument
		super("Error: Negative Balance");
	}

	public NegativeBalanceException(double negativeBalance) throws FileNotFoundException {
		super("Amount exceeds balnce by: " + negativeBalance);
		this.negativeBalance = negativeBalance;
		//using printWriter per rubric
		PrintWriter out = new PrintWriter("log.txt");
		out.write("Amount exceeds balnce by: " + negativeBalance);
		out.close();
	}

	@Override
	public String toString() {
		//rubric dictated this output format
		return "Balance of " + negativeBalance + " not allowed.";
	}
	
}
