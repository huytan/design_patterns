package exercise.one;

public abstract class FileSystemComponent implements Component {
	private String name;

	public FileSystemComponent() {
		// TODO Auto-generated constructor stub
	}

	public FileSystemComponent(String name) {
		this.name = name;

	}

	public void addComponent(FileSystemComponent fc) throws CompositeException {
		throw new CompositeException("Not support for FileComponent");
	}

	public FileSystemComponent getComponent(int location)
			throws CompositeException {
		throw new CompositeException("Not support for FileComponent");
	}

	// public long getComponetSize() throws CompositeException {
	// return 0;
	// }

	public abstract long getComponetSize() throws CompositeException;
}
