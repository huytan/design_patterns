package exercise.two;

public class TestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameSet frameset1 = new FrameSet("frameset", "row=\"20%,80%\"");
		FrameSet frameset2 = new FrameSet("frameset", "row=\"100,200\"");
		FrameSet frameset3 = new FrameSet("frameset", "row=\"100,200\"");
		Frame frame1 = new Frame("frame", "src=\"frame1.html\"");
		Frame frame2 = new Frame("frame", "src=\"frame2.html\"");
		Frame frame3 = new Frame("frame", "src=\"frame3.html\"");
		Frame frame4 = new Frame("frame", "src=\"frame4.html\"");

		frameset1.addComponent(frameset2);
		frameset1.addComponent(frame4);

		frameset2.addComponent(frame1);
		frameset2.addComponent(frame2);
		frameset2.addComponent(frameset3);
		frameset3.addComponent(frame4);

		frameset1.getSourceFiles(0);

	}
}
