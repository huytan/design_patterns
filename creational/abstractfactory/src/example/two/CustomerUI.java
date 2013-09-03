package example.two;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import example.two.factory.CustomerUtil;
import example.two.factory.ICustomerFactory;
import example.two.factory.LocalCustomerFactory;
import javax.swing.JTabbedPane;

public class CustomerUI extends JFrame {

	public static final String REMOTE = "Remote";
	public static final String LOCAL = "Local";

	public static final String SAVE = "Save";
	public static final String EXIT = "Exit";

	private JPanel contentPane;
	private JComboBox<String> cbbConnectTo;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtAddress;
	private JTextField txtState;
	private JLabel lblState;
	private JLabel lblCity;
	private JTextField txtCity;
	private JLabel lblCardExpdate;
	private JTextField txtCardExpdate;
	private JTextField txtCardNumber;
	private JLabel lblCardNumber;
	private JLabel lblCardType;
	private JTextField txtCardType;
	private JButton btnSave;
	private JButton btnExit;
	private ServerUI serverUI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerUI frame = new CustomerUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CustomerUI(ServerUI serverUI) {
		// TODO Auto-generated constructor stub
		this.serverUI = serverUI;
	}

	/**
	 * Create the frame.
	 */
	public CustomerUI() {
		setTitle("Customer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblConnect = new JLabel("Connect to:");
		lblConnect.setBounds(10, 34, 73, 14);
		contentPane.add(lblConnect);

		cbbConnectTo = new JComboBox();
		cbbConnectTo.setBounds(93, 31, 109, 20);
		cbbConnectTo.addItem(CustomerUI.LOCAL);
		cbbConnectTo.addItem(CustomerUI.REMOTE);
		contentPane.add(cbbConnectTo);

		txtFirstName = new JTextField();
		txtFirstName.setToolTipText("");
		txtFirstName.setBounds(93, 62, 109, 20);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);

		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(10, 68, 73, 14);
		contentPane.add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(10, 99, 73, 14);
		contentPane.add(lblLastName);

		txtLastName = new JTextField();
		txtLastName.setToolTipText("");
		txtLastName.setColumns(10);
		txtLastName.setBounds(93, 93, 109, 20);
		contentPane.add(txtLastName);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(10, 130, 73, 14);
		contentPane.add(lblAddress);

		txtAddress = new JTextField();
		txtAddress.setToolTipText("");
		txtAddress.setColumns(10);
		txtAddress.setBounds(93, 124, 109, 20);
		contentPane.add(txtAddress);

		txtState = new JTextField();
		txtState.setToolTipText("");
		txtState.setColumns(10);
		txtState.setBounds(93, 186, 109, 20);
		contentPane.add(txtState);

		lblState = new JLabel("State:");
		lblState.setBounds(10, 192, 73, 14);
		contentPane.add(lblState);

		lblCity = new JLabel("City:");
		lblCity.setBounds(10, 161, 73, 14);
		contentPane.add(lblCity);

		txtCity = new JTextField();
		txtCity.setToolTipText("");
		txtCity.setColumns(10);
		txtCity.setBounds(93, 155, 109, 20);
		contentPane.add(txtCity);

		lblCardExpdate = new JLabel("Card ExpDate:");
		lblCardExpdate.setBounds(10, 285, 73, 14);
		contentPane.add(lblCardExpdate);

		txtCardExpdate = new JTextField();
		txtCardExpdate.setToolTipText("");
		txtCardExpdate.setColumns(10);
		txtCardExpdate.setBounds(93, 279, 109, 20);
		contentPane.add(txtCardExpdate);

		txtCardNumber = new JTextField();
		txtCardNumber.setToolTipText("");
		txtCardNumber.setColumns(10);
		txtCardNumber.setBounds(93, 248, 109, 20);
		contentPane.add(txtCardNumber);

		lblCardNumber = new JLabel("Card Number:");
		lblCardNumber.setBounds(10, 254, 73, 14);
		contentPane.add(lblCardNumber);

		lblCardType = new JLabel("Card Type:");
		lblCardType.setBounds(10, 223, 73, 14);
		contentPane.add(lblCardType);

		txtCardType = new JTextField();
		txtCardType.setToolTipText("");
		txtCardType.setColumns(10);
		txtCardType.setBounds(93, 217, 109, 20);
		contentPane.add(txtCardType);

		btnSave = new JButton("");
		btnSave.setBounds(10, 321, 89, 23);
		btnSave.setText(CustomerUI.SAVE);
		contentPane.add(btnSave);

		btnExit = new JButton("");
		btnExit.setBounds(113, 321, 89, 23);
		btnExit.setText(CustomerUI.EXIT);
		contentPane.add(btnExit);

		ButtonHandlerClient buttonHandler = new ButtonHandlerClient(this);
		btnSave.addActionListener(buttonHandler);
		btnExit.addActionListener(new ButtonHandlerClient());

	}

	public ServerUI getServerUI() {
		if (serverUI == null) {
			serverUI = new ServerUI();
		}
		return serverUI;
	}

	public String getCbbConnectTo() {
		return (String) cbbConnectTo.getSelectedItem();
	}

	public String getTxtFirstName() {
		return txtFirstName.getText();
	}

	public String getTxtLastName() {
		return txtLastName.getText();
	}

	public String getTxtAddress() {
		return txtAddress.getText();
	}

	public String getTxtState() {
		return txtState.getText();
	}

	public String getTxtCity() {
		return txtCity.getText();
	}

	public String getTxtCardExpdate() {
		return txtCardExpdate.getText();
	}

	public String getTxtCardNumber() {
		return txtCardNumber.getText();
	}

	public String getTxtCardType() {
		return txtCardType.getText();
	}
}// end class

class ButtonHandlerClient implements ActionListener {
	CustomerUI customerUI;
	ServerUI serverUI;

	public ButtonHandlerClient(CustomerUI customerUI) {
		// TODO Auto-generated constructor stub
		this.customerUI = customerUI;
	}

	public ButtonHandlerClient(ServerUI serverUI) {
		// TODO Auto-generated constructor stub
		this.serverUI = serverUI;
	}

	public ButtonHandlerClient() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals(CustomerUI.EXIT)) {
			System.exit(1);
		}
		if (e.getActionCommand().equals(CustomerUI.SAVE)) {
			String vhConnectTo = customerUI.getCbbConnectTo();
			ICustomerFactory factory = CustomerUtil.getCustFactory(vhConnectTo);
			IAccount account = null;
			IAddress address = null;
			ICreditCard credit = null;
			try {
				account = factory.getAccount();
				account.setFirstName(customerUI.getTxtFirstName());
				account.setLastName(customerUI.getTxtLastName());
				address = factory.getAddress();
				address.setAddress(customerUI.getTxtAddress());
				address.setCity(customerUI.getTxtCity());
				address.setState(customerUI.getTxtState());
				credit = factory.getCreditCard();
				credit.setCardType(customerUI.getTxtCardType());
				credit.setCardNumber(customerUI.getTxtCardNumber());
				credit.setCardExpDate(customerUI.getTxtCardExpdate());
			} catch (Exception e1) {
				// TODO: handle exception
				e1.printStackTrace();
			}
			if (vhConnectTo.equalsIgnoreCase(CustomerUI.LOCAL)) {
				try {

					if (account.save() && address.save() && credit.save()) {
						System.out.println("Local OK");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			} else if (vhConnectTo.equalsIgnoreCase(CustomerUI.REMOTE)) {
				// customerUI.getServerUI().setVisible(true);
				new ServerUI().setVisible(true);
			}
		}
	}
}
