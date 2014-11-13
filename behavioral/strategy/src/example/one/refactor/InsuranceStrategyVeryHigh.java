package example.one.refactor;

public class InsuranceStrategyVeryHigh extends InsuranceStrategy {

	protected InsuranceStrategyVeryHigh(double income) {
		super(income);
	}

	protected int getConstant() {
		return 105600;
	}

	protected double getWeight() {
		return 0.02;
	}

	protected int getAdjustment() {
		return 60000;
	}
}
