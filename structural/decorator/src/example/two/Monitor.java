package example.two;

public class Monitor extends ComputerDecorator {
	Computer computer;

	public Monitor(Computer computer) {
		this.computer = computer;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return computer.description() + " and a Moniter";
	}
}
