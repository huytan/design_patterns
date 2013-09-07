package exercise.two;

import example.one.HostingPlan;
import example.one.HostingPlanKit;

public class VehicleManager {
	public static VehicleKit getVehicleKit(String category) {
		Vehicle car = null;
		Vehicle suv = null;

		if (category.equalsIgnoreCase("Luxury")) {
			car = new LuxuryCar();
			suv = new LuxurySUV();
		}
		if (category.equalsIgnoreCase("Non-Luxury")) {
			car = new NonLuxuryCar();
			suv = new NonLuxurySUV();

		}
		return new VehicleKit(car, suv);
	}
}
