package exercise.one;

public class Order {
	private String id;
	private String item;
	private String quantity;
	private boolean active;

	public String getId() {
		return id;
	}

	public String getItem() {
		return item;
	}

	public String getQuantity() {
		return quantity;
	}

	public boolean isActive() {
		return active;
	}

	public void setId(String newValue) {
		id = newValue;
	}

	public void setItem(String newValue) {
		item = newValue;
	}

	public void setQuantity(String newValue) {
		quantity = newValue;
	}

	public void setActive(boolean newValue) {
		active = newValue;
	}

}
