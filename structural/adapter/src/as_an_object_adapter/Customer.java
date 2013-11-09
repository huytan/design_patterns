package as_an_object_adapter;



public class Customer {
	public static final String US = "US";
	public static final String CANADA = "Canada";
	private String address;
	private String name;
	private String zip, state, type;

	public Customer(String address, String name, String zip, String state,
			String type) {
		super();
		this.address = address;
		this.name = name;
		this.zip = zip;
		this.state = state;
		this.type = type;
	}

	 public boolean isValidCustomerAddress() {
		    if (type.equals(Customer.US)) {
		      USAddress us = new USAddress();
		      return us.isValidAddress(address, zip, state);
		    }
		    if (type.equals(Customer.CANADA)) {
		      CAAddress objCAAddress = new CAAddress();
		      CAAddressAdapter adapter =
		        new CAAddressAdapter(objCAAddress);
		      return adapter.isValidAddress(address, zip, state);
		    }
		    return true;
		  }
}
