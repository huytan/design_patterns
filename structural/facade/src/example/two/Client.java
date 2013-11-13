package example.two;

//http://www.javacodegeeks.com/2012/11/facade-design-pattern-design-standpoint.html
public class Client {
	public static void main(String[] args) {
		OrderFacade orderFacade = new OrderFacade();
		orderFacade.placeOrder("OR123456");
		System.out.println("Order processing completed");
	}
}
