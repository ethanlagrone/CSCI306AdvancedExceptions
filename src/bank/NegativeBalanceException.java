package bank;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class NegativeBalanceException extends Exception {

	double negativeBalance;

	public NegativeBalanceException() {
		//no provided argument
		super("Error: Negative Balance");
	}

	public NegativeBalanceException(double negativeBalance) {
		super("Amount exceeds balance by: " + negativeBalance);
		this.negativeBalance = negativeBalance;
		//using printWriter per rubric
		try {
			PrintWriter out = new PrintWriter("log.txt");
			out.write("Amount exceeds balance by: " + negativeBalance);
			out.close();
		}
		catch(FileNotFoundException e) {
			//this should never happen in this project
			System.out.println("Error: There was a problem opening log.txt");
		}
	}

	@Override
	public String toString() {
		//rubric dictated this output format
		//if quickWithdraw used
		if(negativeBalance==0) {
			return "Negative balance not allowed.";
		}
		else {
		return "Balance of " + -1*negativeBalance + " not allowed.";
		}
	}
	
}
