package exercise.one_diferrent_ways_to_implemet_singletion;

public class StaticBlockInitialization {

	private static final StaticBlockInitialization instance;

	static {
		try {
			instance = new StaticBlockInitialization();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("Darn, an error occurred!", e);
		}
	}

	public static StaticBlockInitialization getInstance() {
		return instance;
	}

	private StaticBlockInitialization() {
	}

}
