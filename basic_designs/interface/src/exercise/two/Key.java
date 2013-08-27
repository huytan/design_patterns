package exercise.two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Key {
	 Pattern pattern;
	 Matcher matcher;
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public Key() {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}

	public  boolean checkvalidation(final String email) {
		matcher = pattern.matcher(email);
		return matcher.matches();
	}
}
