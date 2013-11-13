package example.three;

public class TestFacade {

	/**
	 * @param args
	 * 
	 *            http://www.fluffycat.com/Java-Design-Patterns/Facade/
	 */
	public static void main(String[] args) {
		FacadeCuppaMaker cuppaMaker = new FacadeCuppaMaker();
		FacadeTeaCup teaCup = cuppaMaker.makeACuppa();
		System.out.println(teaCup);
	}

}
