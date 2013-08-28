package exercise.one;

import java.util.regex.Pattern;

public class CreditCard {
	private static final String NUMBER_PATTERNS = "[+-]?[\\d,]+\\.?\\d+";


	private boolean validation(String numberCredit) {
		// Pattern pattern = Pattern.compile(NUMBER_PATTERNS);
		// Matcher matcher = pattern.matcher(numberCredit);
		return Pattern.matches(NUMBER_PATTERNS, numberCredit);
	}

	public void check(String a) {
		if (validation(a)) {
			System.out.println("OK");
		} else {
			System.out.println("Fail");
		}
	}
}
