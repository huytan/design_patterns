package example.two;

public class AccountPrototypeFactory {
	private UserAccount accountRep;
	private UserAccount supervisor;

	public AccountPrototypeFactory(UserAccount accountRep,
			UserAccount supervisor) {
		this.accountRep = accountRep;
		this.supervisor = supervisor;
	}

	public UserAccount getAccountRep() {
		return (UserAccount) accountRep.clone();
	}

	public UserAccount getSupervisor() {
		return (UserAccount) supervisor.clone();
	}

}
