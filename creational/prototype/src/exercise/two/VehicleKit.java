package exercise.two;

public class VehicleKit {
	private Vehicle car;
	private Vehicle suv;

	public VehicleKit(Vehicle car, Vehicle suv) {
		this.car = car;
		this.suv = suv;
	}

	public Vehicle getCar() {
		// TODO Auto-generated method stub
		return (Vehicle) car.clone();
	}

	public Vehicle getSUV() {
		// TODO Auto-generated method stub
		return (Vehicle) suv.clone();
	}

}
