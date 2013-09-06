package example.two;



import java.util.Vector;

public class UserAccount implements Cloneable {
	private String userName;
	private String password;
	private String fname;
	private String lname;
	private Vector permissions;

	// exercise 1
	// ListPermission permissions;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	// exercise 1
	// public UserAccount(Vector v) {
	// // TODO Auto-generated constructor stub
	// permissions = new ListPermission(v);
	// }

	public Object clone() {
		// shallow coppy
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			return null;
		}
	}

	// exercise 1
	// public ListPermission getPermissions() {
	// return permissions;
	// }

	public void setPermissions(Vector rights) {
		permissions = rights;
	}

	// public String toString() {
	// return getUserName() + "::" + getPassword() + "::" +
	// getPermissions().getPermission();
	// }
	public String toString() {
		String str = "User: " + getUserName() + "\n" + "Permissions : \n";

		for (int i = 0; i < permissions.size(); i++) {
			str = str + (Permission) permissions.elementAt(i) + "\n";

		}
		return str;
	}
}
