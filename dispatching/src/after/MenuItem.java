package after;

public class MenuItem {
	private String label;
	private String action;

	public MenuItem(String action, String label) {
		this.label = label;
		this.action = action;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.label;
	}

}
