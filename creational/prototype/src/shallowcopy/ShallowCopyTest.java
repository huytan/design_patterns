package shallowcopy;

public class ShallowCopyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Original Object
		Person p = new Person("Person-A", "Civic");
		System.out.println("Original (orginal values): " + p.getName() + " - "
				+ p.getCar().getName());
		// clone as shallow copy
		Person q = (Person) p.clone();
		System.out.println("Clone (before change):" + q.getName() + " - "
				+ q.getCar().getName());
		// change the primitive member
		q.setName("Person-B");
		// change the lower-level object
		q.getCar().setName("Accord");
		System.out.println("Clone (after change):" + q.getName() + " - "
				+ q.getCar().getName());
		System.out.println("Original clone is modified:" + p.getName() + " - "
				+ p.getCar().getName());
	}

}
