package example.four;

public class VerticalScrollBarDecorator extends WindowDecorator {

	public VerticalScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		drawVerticalScrollBar();
	}

	private void drawVerticalScrollBar() {
		// draw the vertical scrollbar
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", including vertical scrollbars";
	}
}
