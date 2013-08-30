package example.two;

import java.rmi.Remote;

public interface ICreditCard extends Remote {
	public boolean isValid() throws Exception;

	public boolean save() throws Exception;

	public String getCardType();

	public String getCardNumber();

	public String getCardExpDate();
	public void setCardType(String cardType);

	public void setCardNumber(String cardNumber);

	public void setCardExpDate(String cardExpDate);
}
