package exercise.one;

public abstract class FileSystemComponent {
	private String name;

	public FileSystemComponent(String name) {
		this.name = name;
	}

	public void addComponent(FileSystemComponent f) throws CompositeException {
		throw new CompositeException("Incalid Operation. Not Supported");
	}

	FileSystemComponent getComponent(int component) throws CompositeException {
		throw new CompositeException("Incalid Operation. Not Supported");
	}

}
