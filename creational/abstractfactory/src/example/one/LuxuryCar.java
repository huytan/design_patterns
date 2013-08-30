package example.one;

public class LuxuryCar implements ICar {
	private String name;

	public LuxuryCar(String sName) {
		name = sName;
	}

	@Override
	public String getCarName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getCarFeatures() {
		// TODO Auto-generated method stub
		return "Luxury Car Features";
	}

}
