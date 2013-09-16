package exercise.three;

public class PItem extends ProductSystemComponent {
	double dollar;

	public PItem(String name, double dollar) {
		super(name);
		this.dollar = dollar;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDollarComponent() {
		// TODO Auto-generated method stub
		return dollar;
	}
}
