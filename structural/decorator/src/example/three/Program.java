package example.three;

public class Program {
	public static void main(String[] args) {
		DefaultCar defaultCar = new DefaultCar();
		defaultCar.Start();
		defaultCar.Stop();

		GPRSDecorator gprsDecorator = new GPRSDecorator(defaultCar);
		gprsDecorator.TurnOnGPRS();
		gprsDecorator.Start();
		gprsDecorator.Stop();

	}
}
