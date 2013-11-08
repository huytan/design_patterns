package example.six;

public class DecoratedWindow implements Window {
	private Window privateWindowRefernce = null;

	public DecoratedWindow(Window window) {
		// TODO Auto-generated constructor stub
		this.privateWindowRefernce = window;
	}

	@Override
	public void renderWindow() {
		privateWindowRefernce.renderWindow();
	}
}
