package example.two;

import java.util.Vector;

public class ListPermission {
	Vector permission = new Vector();

	public Vector getPermission() {
		return permission;
	}

	public ListPermission(Vector v) {
		// TODO Auto-generated constructor stub
		permission = v;
	}

	public void setPermissions(Vector permission) {
		this.permission = permission;
	}

}
