package example.one;

public class FileComponent extends FileSystemComponent {
	private long size;

	public FileComponent(String cName, long sz) {
		super(cName);
		size = sz;
		// TODO Auto-generated constructor stub
	}

	@Override
	public long getComponetSize() {
		// TODO Auto-generated method stub
		return size;
	}

}
