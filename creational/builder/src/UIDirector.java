public class UIDirector {
	private UIBuilder builder;

	public UIDirector(UIBuilder builder) {
		this.builder = builder;
	}

	public void build() {
		builder.addUIControls();
		builder.initialize();
	}
}
