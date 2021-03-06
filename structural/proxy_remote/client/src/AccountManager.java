import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AccountManager extends JFrame {

	private JPanel contentPane;
	private JTextField txtFName;
	private JTextField txtLName;
	private JTextField txtAddress;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtCardNumber;
	private JTextField txtExpDate;
	private JLabel txtResult;
	private JButton btnSave;
	private JButton btnExit;
	private JComboBox cbbCardType;
	public static final String EXIT = "Exit";
	public static final String SAVE = "Save";
	public static final String VISA = "Visa";
	public static final String CREADIT_CARD = "Creadit card";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Assign security manager
					if (System.getSecurityManager() == null) {
						System.setSecurityManager(new RMISecurityManager());

					}
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 307);
		setTitle("Proxy remote");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblFirstName = new JLabel("First Name: ");
		lblFirstName.setBounds(10, 11, 71, 14);
		contentPane.add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(10, 36, 71, 14);
		contentPane.add(lblLastName);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(10, 61, 46, 14);
		contentPane.add(lblAddress);

		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(10, 86, 46, 14);
		contentPane.add(lblCity);

		JLabel lblState = new JLabel("State:");
		lblState.setBounds(10, 111, 46, 14);
		contentPane.add(lblState);

		JLabel lblCardType = new JLabel("Card Type:");
		lblCardType.setBounds(10, 136, 71, 14);
		contentPane.add(lblCardType);

		JLabel lblCardNumber = new JLabel("Card Number:");
		lblCardNumber.setBounds(10, 161, 71, 14);
		contentPane.add(lblCardNumber);

		JLabel lblExpDate = new JLabel("Exp Date:");
		lblExpDate.setBounds(10, 186, 71, 14);
		contentPane.add(lblExpDate);

		JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(10, 211, 46, 14);
		contentPane.add(lblResult);

		txtFName = new JTextField();
		txtFName.setBounds(120, 8, 206, 20);
		contentPane.add(txtFName);
		txtFName.setColumns(10);

		txtLName = new JTextField();
		txtLName.setBounds(120, 33, 206, 20);
		contentPane.add(txtLName);
		txtLName.setColumns(10);

		txtAddress = new JTextField();
		txtAddress.setBounds(120, 58, 206, 20);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);

		txtCity = new JTextField();
		txtCity.setBounds(120, 83, 206, 20);
		contentPane.add(txtCity);
		txtCity.setColumns(10);

		txtState = new JTextField();
		txtState.setBounds(120, 108, 206, 20);
		contentPane.add(txtState);
		txtState.setColumns(10);

		cbbCardType = new JComboBox();
		cbbCardType.setBounds(120, 133, 103, 20);
		cbbCardType.addItem(AccountManager.VISA);
		cbbCardType.addItem(AccountManager.CREADIT_CARD);
		contentPane.add(cbbCardType);

		txtCardNumber = new JTextField();
		txtCardNumber.setBounds(120, 158, 206, 20);
		contentPane.add(txtCardNumber);
		txtCardNumber.setColumns(10);

		txtExpDate = new JTextField();
		txtExpDate.setBounds(120, 183, 206, 20);
		contentPane.add(txtExpDate);
		txtExpDate.setColumns(10);

		txtResult = new JLabel("Please click on Validate & Save Button");
		txtResult.setBounds(120, 211, 262, 14);
		contentPane.add(txtResult);

		btnSave = new JButton(AccountManager.SAVE);
		btnSave.setBounds(120, 239, 130, 23);
		contentPane.add(btnSave);

		btnExit = new JButton("Exit");
		btnExit.setBounds(260, 239, 89, 23);
		contentPane.add(btnExit);

		ButtonHandler handler = new ButtonHandler(this);
		btnSave.addActionListener(handler);
		btnExit.addActionListener(handler);

	}

	public String getTxtFName() {
		return txtFName.getText();
	}

	public String getTxtLName() {
		return txtLName.getText();
	}

	public String getTxtAddress() {
		return txtAddress.getText();
	}

	public String getTxtCity() {
		return txtCity.getText();
	}

	public String getTxtState() {
		return txtState.getText();
	}

	public String getTxtCardNumber() {
		return txtCardNumber.getText();
	}

	public String getTxtExpDate() {
		return txtExpDate.getText();
	}

	public String getCbbCardType() {
		return (String) cbbCardType.getSelectedItem();
	}

	public void setTxtResult(String msg) {
		txtResult.setText(msg);
	}

}

class ButtonHandler implements ActionListener {
	AccountManager main;

	public ButtonHandler(AccountManager inMain) {
		this.main = inMain;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equalsIgnoreCase(AccountManager.EXIT)) {
			System.exit(0);
		} else if (e.getActionCommand().equals(AccountManager.SAVE)) {
			try {

				Registry registry = LocateRegistry.getRegistry("localhost",
						Constant.RMI_PORT);
				CustomerIntr facade = (CustomerIntr) registry
						.lookup(Constant.RMI_ID);

				/*
				 * System.out.println("hello"); Connect connect =
				 * Connect.getConnect(); CustomerIntr facade =
				 * connect.getRemote();
				 * 
				 * System.out.println("remote:" + facade.toString());
				 */
				// set data into fileds

				facade.setFName(main.getTxtFName());
				facade.setLName(main.getTxtLName());
				facade.setAddress(main.getTxtAddress());
				facade.setCity(main.getTxtCity());
				facade.setState(main.getTxtState());
				facade.setCardType(main.getCbbCardType());
				facade.setCardNumber(main.getTxtCardNumber());
				facade.setCardExpDate(main.getTxtExpDate());
				// call save method
				boolean result = facade.saveCustomerData();

				if (result != true) {
					String msgError = facade.getMessageError();
					main.setTxtResult(msgError);
				} else {
					main.setTxtResult("Saved");
				}

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
}
