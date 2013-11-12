package exercise.two;

public class ServerIII extends SupportHandler {

	// public ServerIII(String name) {
	// super(name);
	// // TODO Auto-generated constructor stub
	// }
	public ServerIII() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean resolving(SupportRequest request) {
		if (request.getTypeRequest().equalsIgnoreCase(Key.PASS)) {
			System.out.println("Vấn đề - " + request.getID()
					+ request.getDescription()
					+ "đã dc ServerIII giải quyết");
			return true;
		} else if (request.getTypeRequest().equalsIgnoreCase(Key.INCONNECT)) {
			System.out.println("Vấn đề - " + request.getID()
					+ request.getDescription()
					+ "đã dc ServerIII giải quyết");
			return true;
		} else {
			System.out
					.println("Vấn đề - "
							+ request.getID()
							+ request.getDescription()
							+ " Chúng tôi sẽ hẹn bạn ở 1 quán cafe để giải quyết");
			return false;
		}
	}
}
