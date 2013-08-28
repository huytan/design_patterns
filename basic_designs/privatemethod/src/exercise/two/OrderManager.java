package exercise.two;

public class OrderManager {

	private int orderID = 0;
	//whew constructor is private, there is a error message "The constructor OrderManager() is not visible"
	// private OrderManager() {
	// // TODO Auto-generated constructor stub
	// }

	private int getNextID() {
		++orderID;
		return orderID;
	}

	public void saveOrder(String item, int qty) {
		int ID = getNextID();
		System.out.println("Order ID=" + ID + "; Item=" + item + "; Quantity="
				+ qty + " is saved");
	}

}
