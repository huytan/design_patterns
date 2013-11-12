package exercise.two;

public class SupportRequest {
	private int ID;
	private String description;
	private String typeRequest;

	public SupportRequest() {
		// TODO Auto-generated constructor stub
	}

	public SupportRequest(int iD, String description, String type) {
		ID = iD;
		this.description = description;
		this.typeRequest = type;
	}

	public String getTypeRequest() {
		return typeRequest;
	}

	public String getDescription() {
		return description;
	}

	public int getID() {
		return ID;
	}

}
