package example.one;

public class NonLuxuryCar implements ICar {

	private String name;

	public NonLuxuryCar(String sName) {
		this.name = sName;
	}

	@Override
	public String getCarName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getCarFeatures() {
		// TODO Auto-generated method stub
		return "Non-Luxury Car Features";
	}

}
