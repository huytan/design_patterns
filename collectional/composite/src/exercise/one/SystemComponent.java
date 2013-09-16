package exercise.one;


public abstract class SystemComponent {
	String name;

	public SystemComponent(String name) {
		super();
		this.name = name;
	}

	public abstract String displayURL(int depth);

	public void addComponent(SystemComponent component) throws Exception {
		throw new CompositeException("Incalid Operation. Not Supported");
	}

	public SystemComponent getComponent(int component) throws Exception {
		throw new CompositeException("Incalid Operation. Not Supported");
	}
}
