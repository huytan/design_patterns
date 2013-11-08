package example.six;

public class ScrollableWindow extends DecoratedWindow {
	private Object scrollBarObjectRepresentation = null;

	public ScrollableWindow(Window window) {
		super(window);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void renderWindow() {

		// render scroll bar
		renderScrollBarObject();

		// render decorated window
		super.renderWindow();
	}

	private void renderScrollBarObject() {

		// prepare scroll bar
		scrollBarObjectRepresentation = new Object();

		// render scrollbar

	}
}
