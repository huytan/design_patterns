package example.one;

public class PurchaseRequest {
	private int ID;
	private String description;
	private double amount;

	public PurchaseRequest() {
		// TODO Auto-generated constructor stub
	}

	public PurchaseRequest(int iD, String description, double amount) {
		ID = iD;
		this.description = description;
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ID +" : " + description;
	}

}
