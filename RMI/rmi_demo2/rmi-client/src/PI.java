import java.io.Serializable;
import java.math.BigDecimal;

import saqib.rasul.Task;

public class PI implements Task, Serializable {
	private static final long serialVersionUID = 3942967283733335029L;

	/** constants used in pi computation */
	private static final BigDecimal FOUR = BigDecimal.valueOf(4);

	/** rounding mode to use during pi computation */
	private static final int roundingMode = BigDecimal.ROUND_HALF_EVEN;

	/** digits of precision after the decimal point */
	private final int digits;

	/**
	 * Construct a task to calculate pi to the specified precision.
	 */
	public PI(int digits) {
		this.digits = digits;
	}

	@Override
	public BigDecimal execute() {
		// TODO Auto-generated method stub
		return computePi(digits);
	}

	private BigDecimal computePi(int digits2) {
		// TODO Auto-generated method stub
		java.math.BigDecimal bd = new java.math.BigDecimal(String.valueOf(digits2));
		return bd;
	}

}
