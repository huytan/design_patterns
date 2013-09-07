package exercise.two;

public abstract class Vehicle implements Cloneable {

	@Override
	protected Object clone() {
		// TODO Auto-generated method stub
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			return null;
		}

	}

	public abstract String getFeatures();

}
