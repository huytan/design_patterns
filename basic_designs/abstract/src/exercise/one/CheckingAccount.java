package exercise.one;

public class CheckingAccount extends Account {
	@Override
	void checking() {
		// TODO Auto-generated method stub
		System.out.println("CheckingAccount no checking....");
	}

	@Override
	double chargeServiceFee() {
		// TODO Auto-generated method stub
		// return 0.01;
		return 3;
	}

	@Override
	double giveInterest() {
		// TODO Auto-generated method stub
		// return 0.02;
		return 1;
	}

}
