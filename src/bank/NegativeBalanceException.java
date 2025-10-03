package bank;

public class NegativeBalanceException {
	double negativeBalace = 0.0;

	public NegativeBalanceException() {
		//stub
		super();
	}

	public NegativeBalanceException(double negativeBalace) {
		//use printwriter according to rubric
		super();
		this.negativeBalace = negativeBalace;
	}

	@Override
	public String toString() {
		//stub generated
		return "NegativeBalanceException [negativeBalace=" + negativeBalace + "]";
	}
	
	
}
