package exercise.two;

public class ServerII extends SupportHandler {

	// public ServerII(String name) {
	// super(name);
	// // TODO Auto-generated constructor stub
	// }
	public ServerII() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean resolving(SupportRequest request) {
		if (request.getTypeRequest().equalsIgnoreCase(Key.PASS)) {
			System.out
					.println("Vấn đề - " + request.getID()
							+ request.getDescription()
							+ " đã dc ServerII giải quyết");
			return true;
		} else if (request.getTypeRequest().equalsIgnoreCase(Key.INCONNECT)) {
			System.out.println("Vấn đề - " + request.getID()
					+ request.getDescription() + " đã dc ServerII giải quyết");
			return true;
		} else {
			return getNextHandler().resolving(request);
		}
	}

}
