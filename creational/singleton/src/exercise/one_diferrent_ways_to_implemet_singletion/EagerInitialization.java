package exercise.one_diferrent_ways_to_implemet_singletion;

public class EagerInitialization {
	public static final EagerInitialization instance = new EagerInitialization();

	private EagerInitialization() {
	}

	public static EagerInitialization getInstance() {
		return instance;
	}
}
