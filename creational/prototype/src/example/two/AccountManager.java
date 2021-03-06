package example.two;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class AccountManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Create Prototypical Objects
		 */
		Vector supervisorPermissions = getPermissionsFromFile("supervisor.txt");
		UserAccount supervisor = new UserAccount();
		supervisor.setPermissions(supervisorPermissions);
		// exercise 1
		// UserAccount supervisor = new UserAccount(supervisorPermissions);
		// supervisor.getPermissions().setPermissions(supervisorPermissions);

		Vector accountRepPermissions = getPermissionsFromFile("accountrep.txt");
		UserAccount accountRep = new UserAccount();
		accountRep.setPermissions(accountRepPermissions);
		// exercise 1
		// UserAccount accountRep = new UserAccount(accountRepPermissions);
		// accountRep.getPermissions().setPermissions(accountRepPermissions);

		AccountPrototypeFactory factory = new AccountPrototypeFactory(
				accountRep, supervisor);

		/* Using protype objects to create other user accounts */

		UserAccount newSupervisor = factory.getSupervisor();
		newSupervisor.setUserName("PKuchana");
		newSupervisor.setPassword("Everest");
		// exercise 1
		// Vector v = new Vector();
		// v.add("print,read");
		// newSupervisor.getPermissions().setPermissions(v);

		System.out.println("newSupervisor :" + newSupervisor);

		// System.out.println("orginal:" + supervisor);

		UserAccount anotherSupervisor = factory.getSupervisor();
		anotherSupervisor.setUserName("SKuchana");
		anotherSupervisor.setPassword("Everest");
		System.out.println("another:" + anotherSupervisor);

		UserAccount newAccountRep = factory.getAccountRep();
		newAccountRep.setUserName("VKuchana");
		newAccountRep.setPassword("Vishal");
		System.out.println("accReP:" + newAccountRep);
	}

	public static Vector getPermissionsFromFile(String fileName) {
		Vector v = new Vector();
		String inputLine;
		try {
			File inFile = new File(fileName);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(inFile)));

			while ((inputLine = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(inputLine, ",");
				String resource = st.nextToken();
				String permission = st.nextToken();
				v.addElement(new Permission(resource, permission));
			}
			br.close();
		} // Try
		catch (FileNotFoundException ex) {
			//
		} catch (IOException ex) {
			//
		}
		return (v);
	}

}
