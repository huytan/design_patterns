package example;

public class OrderManager {

	private int orderID = 0;

	private int getNextID() {
		++orderID;
		return orderID;
	}

	public void saveOrder(String item, int qty) {
		int ID = getNextID();
		System.out.println("Order ID=" + ID + "; Item=" + item + "; Quantity="
				+ qty + "is saved");
	}

}
