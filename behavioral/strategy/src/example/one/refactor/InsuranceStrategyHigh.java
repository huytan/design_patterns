package example.one.refactor;

public class InsuranceStrategyHigh extends InsuranceStrategy {

	protected InsuranceStrategyHigh(double income) {
		super(income);
	}

	protected int getConstant() {
		return 76500;
	}

	protected double getWeight() {
		return 0.1;
	}

	protected int getAdjustment() {
		return 30000;
	}

}
