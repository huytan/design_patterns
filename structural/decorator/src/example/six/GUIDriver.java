package example.six;

public class GUIDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a new window

		Window window = new SimpleWindow();

		window.renderWindow();

		// at some point later
		// maybe text size becomes larger than the window
		// thus the scrolling behavior must be added

		// decorate old window
		window = new ScrollableWindow(window);

		// now window object
		// has additional behavior / state

		window.renderWindow();
	}

}
