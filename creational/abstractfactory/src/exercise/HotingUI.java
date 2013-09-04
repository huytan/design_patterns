package exercise;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;

import exercise.factory.IPlatformFactory;
import exercise.factory.PlatformFactory;

public class HotingUI extends JFrame {

	public static final String newline = "\n";
	public static final String SEARCH = "Search";
	public static final String EXIT = "Exit";
	public static final String CAR = "Car";
	public static final String SUV = "SUV";
	private JComboBox cbbPlatform;
	private JComboBox cbbType;
	JLabel lblResult;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotingUI frame = new HotingUI();
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
	public HotingUI() {
		setTitle("Abstract Factory");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblVehicleCategory = new JLabel("Vehicle Category:");
		lblVehicleCategory.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVehicleCategory.setBounds(52, 46, 119, 25);
		contentPane.add(lblVehicleCategory);

		JLabel lblVehicletype = new JLabel("VehicleType:");
		lblVehicletype.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVehicletype.setBounds(52, 82, 94, 25);
		contentPane.add(lblVehicletype);

		JLabel lblSearchResult = new JLabel("Search Result:");
		lblSearchResult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSearchResult.setBounds(52, 120, 94, 25);
		contentPane.add(lblSearchResult);

		cbbPlatform = new JComboBox();
		cbbPlatform.setModel(new DefaultComboBoxModel(new String[] { "Window",
				"Unix" }));
		cbbPlatform.setToolTipText("");
		cbbPlatform.setBounds(181, 50, 139, 20);
		contentPane.add(cbbPlatform);

		cbbType = new JComboBox();
		cbbType.addItem(ContantDataManager.BASIC);
		cbbType.addItem(ContantDataManager.PREMIUM);
		cbbType.addItem(ContantDataManager.PREMIUM_PLUS);
		cbbType.setBounds(181, 86, 139, 20);
		contentPane.add(cbbType);

		lblResult = new JLabel("Please click on Search button");
		lblResult.setBounds(181, 118, 243, 25);
		contentPane.add(lblResult);

		JButton btnSearch = new JButton(HotingUI.SEARCH);
		btnSearch.setBounds(82, 171, 89, 23);
		btnSearch.setMnemonic(KeyEvent.VK_S);
		contentPane.add(btnSearch);

		JButton btnExit = new JButton(HotingUI.EXIT);
		btnExit.setBounds(191, 171, 89, 23);
		btnExit.setMnemonic(KeyEvent.VK_E);
		contentPane.add(btnExit);

		ButtonHandler objButtonHandler = new ButtonHandler(this);
		btnSearch.addActionListener(objButtonHandler);
		btnExit.addActionListener(new ButtonHandler());
	}

	public String getSelectedPlatform() {
		return (String) cbbPlatform.getSelectedItem();
	}

	public String getSelectedType() {
		return (String) cbbType.getSelectedItem();
	}

	public void setResult(String searchResult) {
		lblResult.setText(searchResult);
	}
}

class ButtonHandler implements ActionListener {
	HotingUI objAutoSearchUI;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String searchResult = null;

		if (e.getActionCommand().equals(HotingUI.EXIT)) {
			System.exit(1);
		}
		if (e.getActionCommand().equals(HotingUI.SEARCH)) {
			// get input values
			String vhPlatform = objAutoSearchUI.getSelectedPlatform();
			String vhType = objAutoSearchUI.getSelectedType();

			// get one of Luxury or NonLuxury vehicle factories
			IPlatformFactory vf = PlatformFactory
					.getPlatformFactory(vhPlatform);

			if (vhType.equals(ContantDataManager.BASIC)) {
				IBasic basic = vf.getBasic();
				searchResult = "  Features: " + basic.getBasicFeature();

			}
			if (vhType.equals(ContantDataManager.PREMIUM)) {
				IPremium basic = vf.getPremium();
				searchResult = "  Features: " + basic.getPremiumFeature();
			}
			if (vhType.equals(ContantDataManager.PREMIUM_PLUS)) {
				IPremiumPlus basic = vf.getPremiumPlus();
				searchResult = "  Features: " + basic.getPremiumPlusFeature();
			}
			objAutoSearchUI.setResult(searchResult);
		}

	}

	public ButtonHandler() {
	}

	public ButtonHandler(HotingUI inObjAutoSearchUI) {
		objAutoSearchUI = inObjAutoSearchUI;
	}
}
