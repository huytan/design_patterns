package example.two;

import java.util.Vector;

public class UserAccount implements Cloneable {
	private String userName;
	private String password;
	private String fname;
	private String lname;
	private Vector permissions = new Vector();

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

	public Vector getPermissions() {
		return permissions;
	}

	public void setPermissions(Vector permissions) {
		this.permissions = permissions;
	}

	public Object clone() {
		// shallow coppy
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			return null;
		}
	}

}
