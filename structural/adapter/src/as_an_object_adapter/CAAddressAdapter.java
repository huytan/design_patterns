package as_an_object_adapter;

public class CAAddressAdapter extends  AddressValidator {
	CAAddress objCAAdress;
	public CAAddressAdapter(CAAddress adress) {
		objCAAdress= adress;
	}
	@Override
	public boolean isValidAddress(String inp_address, String inp_zip,
			String inp_state) {
		// TODO Auto-generated method stub
		return objCAAdress.isValidCanadianAddr(inp_address, inp_zip, inp_state);
	}

}
