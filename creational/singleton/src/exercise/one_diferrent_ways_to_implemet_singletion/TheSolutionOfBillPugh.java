package exercise.one_diferrent_ways_to_implemet_singletion;

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
