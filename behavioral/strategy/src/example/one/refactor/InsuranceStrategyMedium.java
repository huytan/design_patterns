package example.one.refactor;

public class InsuranceStrategyMedium extends InsuranceStrategy {

	protected InsuranceStrategyMedium(double income) {
		super(income);
	}

	protected int getConstant() {
		return 35600;
	}

	protected double getWeight() {
		return 0.2;
	}

	protected int getAdjustment() {
		return 10000;
	}

}
