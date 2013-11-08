package example.four;

//the second concrete decorator which adds horizontal scrollbar functionality
public class HorizontalScrollBarDecorator extends WindowDecorator {

	public HorizontalScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		super.draw();
		drawHorizontalScrollBar();
	}

	private void drawHorizontalScrollBar() {
		// draw the horizontal scrollbar
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", including horizontal scrollbars";
	}
}
