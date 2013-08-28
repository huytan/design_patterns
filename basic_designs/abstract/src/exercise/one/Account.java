package exercise.one;

public abstract class Account {

	double moneyCurrent;

	public Account() {
		moneyCurrent = 1000;
	}

	abstract void checking();

	abstract double chargeServiceFee();

	abstract double giveInterest();

	public void deposits(int moneyDeposit) {
		checking();
		double interest = giveInterest();
		double serviceFee = chargeServiceFee();
		// moneyCurrent = (moneyCurrent + (moneyDeposit
		// - (moneyDeposit * serviceFee) + (moneyDeposit * interest)));
		moneyCurrent = moneyCurrent + (moneyDeposit - serviceFee + interest);

		balanceEnquiries();
	}

	public void balanceEnquiries() {

		System.out.println(toString());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Balance is: " + moneyCurrent + " USD");
	}

}
