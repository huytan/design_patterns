package example.one.approach1;


public class VCard {
	private String name;
	private String title;
	FlyweightIntr objFW;

	public VCard(String name, String title, FlyweightIntr objFW) {
		super();
		this.name = name;
		this.title = title;
		this.objFW = objFW;
	}

	public void print() {
		System.out.println(name);
		System.out.println(title);
		System.out.println(objFW.getAddress() + "-" + objFW.getCity() + "-"
				+ objFW.getState() + "-" + objFW.getZip());
		System.out.println("-----------------------------------");
	}
}
