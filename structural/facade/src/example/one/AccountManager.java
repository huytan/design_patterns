package example.one;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AccountManager extends JFrame {
	public static final String newLine = "\n";
	public static final String VISA = "Visa";
	public static final String DISCOVER = "Discover";
	public static final String MASTER = "Master";
	public static final String EXIT = "Exit";
	public static final String VALIDATE_SAVE = "Validate & Save";

	private JPanel contentPane;
	private JTextField textFName;
	private JTextField textLName;
	private JTextField textAddress;
	private JTextField textCity;
	private JTextField textState;
	private JTextField textCardNumber;
	private JTextField textExpDate;
	private JComboBox cbbType;
	private JLabel txtResult;
	private JButton btnValidateSave;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountManager frame = new AccountManager();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AccountManager() {
		super("Facade Pattern - Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(10, 11, 130, 14);
		contentPane.add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(10, 36, 130, 14);
		contentPane.add(lblLastName);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(10, 61, 130, 14);
		contentPane.add(lblAddress);

		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(10, 86, 130, 14);
		contentPane.add(lblCity);

		JLabel lblState = new JLabel("State:");
		lblState.setBounds(10, 107, 130, 14);
		contentPane.add(lblState);

		JLabel lblCardType = new JLabel("Card Type:");
		lblCardType.setBounds(10, 132, 130, 14);
		contentPane.add(lblCardType);

		JLabel lblCardNumber = new JLabel("Card Number:");
		lblCardNumber.setBounds(10, 157, 130, 14);
		contentPane.add(lblCardNumber);

		JLabel lblExpdate = new JLabel("ExpDate:");
		lblExpdate.setBounds(10, 182, 130, 14);
		contentPane.add(lblExpdate);

		textFName = new JTextField();
		textFName.setBounds(150, 11, 228, 20);
		contentPane.add(textFName);
		textFName.setColumns(10);

		textLName = new JTextField();
		textLName.setColumns(10);
		textLName.setBounds(150, 36, 228, 20);
		contentPane.add(textLName);

		textAddress = new JTextField();
		textAddress.setColumns(10);
		textAddress.setBounds(150, 61, 228, 20);
		contentPane.add(textAddress);

		textCity = new JTextField();
		textCity.setColumns(10);
		textCity.setBounds(150, 86, 228, 20);
		contentPane.add(textCity);

		textState = new JTextField();
		textState.setColumns(10);
		textState.setBounds(150, 107, 228, 20);
		contentPane.add(textState);

		cbbType = new JComboBox();
		cbbType.setBounds(150, 132, 110, 20);
		cbbType.addItem(AccountManager.VISA);
		cbbType.addItem(AccountManager.DISCOVER);
		cbbType.addItem(AccountManager.MASTER);
		contentPane.add(cbbType);

		textCardNumber = new JTextField();
		textCardNumber.setBounds(150, 157, 228, 20);
		contentPane.add(textCardNumber);
		textCardNumber.setColumns(10);

		textExpDate = new JTextField();
		textExpDate.setColumns(10);
		textExpDate.setBounds(150, 182, 228, 20);
		contentPane.add(textExpDate);

		JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(10, 207, 46, 14);
		contentPane.add(lblResult);

		txtResult = new JLabel("Please click on Validate & Save Button");
		txtResult.setBounds(53, 207, 371, 14);
		contentPane.add(txtResult);

		btnValidateSave = new JButton(AccountManager.VALIDATE_SAVE);
		btnValidateSave.setBounds(10, 232, 126, 23);
		contentPane.add(btnValidateSave);

		btnExit = new JButton(AccountManager.EXIT);
		btnExit.setBounds(146, 232, 89, 23);
		contentPane.add(btnExit);

		ButtonHandler buttonHandler = new ButtonHandler(this);
		btnExit.addActionListener(buttonHandler);
		btnValidateSave.addActionListener(buttonHandler);

	}

	public String getCbbType() {
		return (String) cbbType.getSelectedItem();
	}

	public void setTxtResult(String msg) {
		txtResult.setText(msg);
	}

	public String getTextFName() {
		return textFName.getText();
	}

	public String getTextLName() {
		return textLName.getText();
	}

	public String getTextAddress() {
		return textAddress.getText();
	}

	public String getTextCity() {
		return textCity.getText();
	}

	public String getTextState() {
		return textState.getText();
	}

	public String getTextCardNumber() {
		return textCardNumber.getText();
	}

	public String getTextExpDate() {
		return textExpDate.getText();
	}

}// End of class AccountManager

class ButtonHandler implements ActionListener {
	AccountManager accountManager;

	public ButtonHandler(AccountManager a) {
		this.accountManager = a;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String validateCheckResult = null;
		if (e.getActionCommand().equals(AccountManager.EXIT)) {
			System.exit(0);
		}
		if (e.getActionCommand().equals(AccountManager.VALIDATE_SAVE)) {
			// get input values
			String firstName = accountManager.getTextFName();
			String lastName = accountManager.getTextLName();
			String address = accountManager.getTextAddress();
			String city = accountManager.getTextCity();
			String state = accountManager.getTextState();
			String cardType = accountManager.getCbbType();
			String cardNumber = accountManager.getTextCardNumber();
			String cardExpDate = accountManager.getTextExpDate();

			CustomerFacade facade = new CustomerFacade();
			facade.setFname(firstName);
			facade.setLname(lastName);
			facade.setAddress(address);
			facade.setCity(city);
			facade.setState(state);
			facade.setCardType(cardType);
			facade.setCardNumber(cardNumber);
			facade.setCardExpDate(cardExpDate);

			// Client is not required to access subsystem components.
			boolean result = facade.saveCustomerData();

			if (result) {
				validateCheckResult = " Valid Customer Data: Data Saved Successfully ";

			} else {
				validateCheckResult = " Invalid Customer Data: Data Could Not Be Saved ";

			}
			accountManager.setTxtResult(validateCheckResult);
		}
	}

}
