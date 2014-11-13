package example.one.refactor;

public class InsuranceStrategyLow extends InsuranceStrategy {

	protected InsuranceStrategyLow(double income) {
		super(income);
	}

	protected int getConstant() {
		return 0;
	}

	protected double getWeight() {
		return 0.365;
	}

	protected int getAdjustment() {
		return 0;
	}

}
