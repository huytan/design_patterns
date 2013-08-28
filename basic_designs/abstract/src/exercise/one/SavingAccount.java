package exercise.one;

public class SavingAccount extends Account {

	@Override
	void checking() {
		// TODO Auto-generated method stub
		System.out.println("SavingAccount checking....");
	}

	@Override
	double chargeServiceFee() {
		// TODO Auto-generated method stub
		// return 0.04;
		return 5;
	}

	@Override
	double giveInterest() {
		// TODO Auto-generated method stub
		// return 0.05;
		return 2;
	}

}
