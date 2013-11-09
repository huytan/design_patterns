package example.four.four;

public class DocumentAdapter implements Copyable {
	private Document d;

	public DocumentAdapter(Document d) {
		this.d = d;
	}

	@Override
	public boolean isCopyable() {
		// TODO Auto-generated method stub
		return d.isValid();
	}

}
