package exercise.one_diferrent_ways_to_implemet_singletion;

public class LazyInitialization {
	private static volatile LazyInitialization instance = null;

	private LazyInitialization() {
	}

	public static LazyInitialization getInstance() {
		if (instance == null) {
			synchronized (LazyInitialization.class) {
				if (instance == null) {
					instance = new LazyInitialization();
				}
			}
		}
		return instance;
	}
}
