package example.three;

public class GPRSDecorator implements ICar {
	ICar existObject;

	public GPRSDecorator(ICar car) {
		this.existObject = car;
		// TODO Auto-generated constructor stub
	}

	public String TurnOnGPRS() {
		return "Turn on GPRS";
	}

	@Override
	public String Start() {
		// TODO Auto-generated method stub
		return this.existObject.Start() + " and " + TurnOnGPRS();
	}

	@Override
	public String Stop() {
		// TODO Auto-generated method stub
		return this.existObject.Stop() + " and " + TurnOnGPRS();
	}

}
