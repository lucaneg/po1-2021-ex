abstract class Transaction {
	private final double amount;
	
	protected Transaction(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
}

class Withdrawal extends Transaction {

	public Withdrawal(double amount) {
		super(amount);
	}
}

class WireTransfer extends Transaction {

	public WireTransfer(double amount) {
		super(amount);
	}
}

class Payment extends Transaction {
	private final double commission;

	public Payment(double amount, double commission) {
		super(amount);
		this.commission = commission;
	}
	
	public double getCommission() {
		return commission;
	}
}

class Bank {
	public static double accountBalance(double initialAmount, Transaction[] transactions) {
		double result = initialAmount;
		for (int i = 0; i < transactions.length; i++) {
			Transaction t = transactions[i];
			double amount = t.getAmount();
			if (t instanceof WireTransfer)
				result += amount;
			else if (t instanceof Withdrawal)
				result -= amount;
			else 
				result -= (amount + amount * ((Payment) t).getCommission());
		}
		return result;
	}
}
