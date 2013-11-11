package exercice.three;

public class HTMLLogger extends FileLogger {
	@Override
	public void log(String msg) {
		msg = "<HTML><BODY> <b>" + msg + "</b></BODY></HTML>";
		super.log(msg);
	}
}
