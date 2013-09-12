package example.one_abstract;

public class NonLuxuryVehicleFactory extends VehicleFactory {

	@Override
	ICar getCar() {
		// TODO Auto-generated method stub
		return new NonLuxuryCar("NL-C");
	}

	@Override
	ISUV getSUV() {
		// TODO Auto-generated method stub
		return new NonLuxurySUV("NL-S");
	}

}
