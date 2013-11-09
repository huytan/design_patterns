package as_a_class_adapter;

public class CAAddressAdapter extends CAAdress implements AddressValidator {
	public CAAddressAdapter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isValidAddress(String inp_address, String inp_zip,
			String inp_state) {
		// TODO Auto-generated method stub
		return isValidCanadianAddr(inp_address, inp_zip, inp_state);
	}

}
