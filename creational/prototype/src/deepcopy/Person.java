package deepcopy;

public class Person implements Cloneable {
	// lower-level object
	private Car car;
	private String name;

	public Car getCar() {
		return car;
	}

	public String getName() {
		return name;
	}

	public void setName(String sName) {
		name = sName;
	}

	public Person(String s, String t) {
		name = s;
		car = new Car(t);
	}

	public Object clone() {
		// deep copy
		Person p = new Person(name, car.getName());
		return p;
	}
}
