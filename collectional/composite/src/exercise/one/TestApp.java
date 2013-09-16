package exercise.one;


public class TestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SystemComponent host = new SubDomain("Domain.com");
		SystemComponent subDomain1 = new SubDomain("sub1");
		SystemComponent subDomain2 = new SubDomain("sub2");
		SystemComponent html1 = new HTML("HTML1.txt");
		SystemComponent html2 = new HTML("HTML2.txt");

		try {
			host.addComponent(subDomain1);
			host.addComponent(subDomain2);
			subDomain1.addComponent(html1);
			subDomain1.addComponent(html2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("" + host.displayURL(0));
	}

}
