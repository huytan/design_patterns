package example.one_abstract;

public class NonLuxurySUV implements ISUV {

	private String name;

	public NonLuxurySUV(String sName) {
		this.name = sName;
	}

	@Override
	public String getSUVName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getSUVFeatures() {
		// TODO Auto-generated method stub
		return "Non-Luxury SUV Features";
	}

}
