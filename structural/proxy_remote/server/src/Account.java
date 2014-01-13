public class Account {
	private String fname;
	private String lname;

	public Account(String fname, String lname) {
		// TODO Auto-generated constructor stub
		this.fname = fname;
		this.lname = lname;
	}

	public boolean isValid() {
		if (fname.equalsIgnoreCase("")) {
			return false;
		}
		if (lname.equalsIgnoreCase("")) {
			return false;
		}
		return true;
	}

	public boolean save(long id) {
		FileUtil file = new FileUtil();
		String dataLine = id + ":" + fname + ":" + lname;
		return file.writeToFile(Constant.ADDRESS_FILE, dataLine, true, true);
	}
	
	public boolean save() {
		FileUtil file = new FileUtil();
		String dataLine = fname + ":" + lname;
		return file.writeToFile(Constant.ADDRESS_FILE, dataLine, true, true);
	}

}
