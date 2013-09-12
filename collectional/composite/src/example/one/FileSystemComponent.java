package example.one;

public abstract class FileSystemComponent {

	String name;

	public FileSystemComponent(String cName) {
		this.name = cName;
	}

	void addComponent(FileSystemComponent component) throws CompositeException {
		throw new CompositeException("Incalid Operation. Not Supported");
	}

	FileSystemComponent getComponent(int component) throws CompositeException {
		throw new CompositeException("Incalid Operation. Not Supported");
	}

	abstract long getComponetSize();

}
