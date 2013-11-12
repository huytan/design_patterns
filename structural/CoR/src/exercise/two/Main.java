package exercise.two;

public class Main {
	private ServerI serverI;
	private ServerII serverII;
	private ServerIII serverIII;

	public static void main(String[] args) {
		Main main = new Main();
		main.createSupportFlow();

		SupportRequest request = new SupportRequest(1, "Mất pass word",
				Key.PASS);
		main.serverI.resolving(request);

		request = new SupportRequest(2, "Ko kết nói dc", Key.INCONNECT);
		main.serverI.resolving(request);

		request = new SupportRequest(3, "Hư máy", Key.OTHER);
		main.serverI.resolving(request);
	}

	private void createSupportFlow() {
		serverI = new ServerI();
		serverII = new ServerII();
		serverIII = new ServerIII();

		serverI.setNextHandler(serverII);
		serverII.setNextHandler(serverIII);
	}
}
