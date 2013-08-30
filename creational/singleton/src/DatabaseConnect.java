public class DatabaseConnect {
	private static DatabaseConnect connect;

	private DatabaseConnect() {
	}

	public static DatabaseConnect getInstance() {
		if (connect == null) {
			connect = new DatabaseConnect();
		}
		return connect;
	}

	public synchronized void connectDatabase() {
		System.out.println("connecting...");
	}
}
