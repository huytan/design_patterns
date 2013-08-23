import util.IContent;

public class Content implements IContent {
	String content = null;

	public Content(String content) {
		// TODO Auto-generated constructor stub
		this.content = content;
	}

	@Override
	public String getAsString() {
		String a = this.content;
		return a;
	}
}
