package example.one;

public class UIDirector {
	private UIBuilder builder;

	public UIDirector(UIBuilder builder) {
		this.builder = builder;
	}

	public void build() {
		builder.addUIcontrols();
		builder.initialize();
	}
}
