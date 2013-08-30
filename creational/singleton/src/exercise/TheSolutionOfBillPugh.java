package exercise;

public class TheSolutionOfBillPugh {
	private TheSolutionOfBillPugh() {
		// TODO Auto-generated constructor stub
	}

	private static class SingletonHolder {
		public static final TheSolutionOfBillPugh INSTANCE = new TheSolutionOfBillPugh();
	}

	public static TheSolutionOfBillPugh getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
