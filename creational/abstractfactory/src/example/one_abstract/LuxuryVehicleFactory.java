package example.one_abstract;

public class LuxuryVehicleFactory extends VehicleFactory {

	@Override
	ICar getCar() {
		// TODO Auto-generated method stub
		return new LuxuryCar("L-C");
	}

	@Override
	ISUV getSUV() {
		// TODO Auto-generated method stub
		return new LuxurySUV("L-S");
	}

}
