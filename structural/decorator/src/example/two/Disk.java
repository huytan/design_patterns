package example.two;

public class Disk extends ComputerDecorator {
	Computer computer;

	public Disk(Computer computer) {
		this.computer = computer;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return computer.description() + " and a disk";
	}

}
