package example.three;

//the class which the adapter will make the adaptee adapt to
public class TeaBag {
	boolean teaBagIsSteeped;

	public TeaBag() {
		teaBagIsSteeped = false;
	}

	public void steepTeaInCup() {
		teaBagIsSteeped = true;
		System.out.println("tea bag is steeping in cup");
	}
}
