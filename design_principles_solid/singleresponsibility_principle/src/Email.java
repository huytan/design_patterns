import util.IContent;
import util.IEmail;

public class Email implements IEmail {
	String sender, receiver = null;

	@Override
	public void setContent(IContent content) {
		// TODO Auto-generated method stub
		String content_mail = content.getAsString();
		System.out.println("----------------------------");
		System.out.println("Sender:" + this.sender);
		System.out.println("Receiver:" + this.receiver);
		System.out.println("Content:" + content_mail);
	}

	@Override
	public void setReceiver(String receiver) {
		// TODO Auto-generated method stub
		this.receiver = receiver;
	}

	@Override
	public void setSender(String sender) {
		// TODO Auto-generated method stub
		this.sender = sender;
	}
}
