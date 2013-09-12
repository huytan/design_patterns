package example.one_abstract;

public class LuxurySUV implements ISUV {

	private String name;

	public LuxurySUV(String sName) {
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
		return "Luxury SUV Features";
	}

}
