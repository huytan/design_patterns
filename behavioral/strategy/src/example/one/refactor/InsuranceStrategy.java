package example.one.refactor;

public abstract class InsuranceStrategy {
	private double myIncome;

	protected InsuranceStrategy(double income) {
		myIncome = income;
	}

	protected abstract int getAdjustment();

	protected abstract double getWeight();

	protected abstract int getConstant();

	protected double calculateInsurance() {
		return (myIncome - getAdjustment()) * getWeight() + getConstant();
	}

}