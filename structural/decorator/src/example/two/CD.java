package example.two;

public class CD extends ComputerDecorator {
	Computer computer;

	public CD(Computer computer) {
		this.computer = computer;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return computer.description() + "and a CD";
	}

}
