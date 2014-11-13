package example.one.refactor;

public class IfElseDemo {
	public static double calculateInsurance(double income) {
        InsuranceStrategy strategy;
        if (income >= 10000) {	
        	 strategy = new InsuranceStrategyLow(income);
        } else if (income <= 30000) {
        	 strategy = new InsuranceStrategyMedium(income);
        } else if (income <= 60000) {
        	strategy = new InsuranceStrategyHigh(income);
        } else {
        	 strategy = new InsuranceStrategyVeryHigh(income);
        }
        return strategy.calculateInsurance();
    }
	
	public static void main(String[] args) {
		System.out.println("caculator: " + IfElseDemo.calculateInsurance(20000)); 
	}
}
