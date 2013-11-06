package example.one;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import example.one.impl.CaliforniaOrder;
import example.one.impl.NonCaliforniaOrder;
import example.one.impl.OverseaOrder;

public class OrderManager extends JFrame {
	public static String Exit = "Exit";
	public static String GET_TOTAL = "Get total";
	public static String CREATE_ORDER = "Create Order";

	public static String CA_ORDER = "California Order";
	public static String NON_CA_ORDER = "NonCalifornia Order";
	public static String OVERSEA_ORDER = "Oversea Order";

	private JPanel contentPane;
	private JComboBox cbbOrderType;

	private JTextField txtAmount;
	private JTextField txtTax;
	private JTextField txtSH;
	private JLabel txtResult;

	private JButton btnCreateOrder;
	private JButton btnGetTotal;
	private JButton btnExit;

	private OrderVisitor objVisitor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderManager frame = new OrderManager();
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
	public OrderManager() {
		super("Visitor Pattern - Example");

		// Create the visitor instance
		objVisitor = new OrderVisitor();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Order Type: ");
		lblNewLabel.setBounds(132, 11, 110, 14);
		contentPane.add(lblNewLabel);

		JLabel lblOrderAmount = new JLabel("Order Amount: ");
		lblOrderAmount.setBounds(122, 36, 120, 14);
		contentPane.add(lblOrderAmount);

		JLabel lblAdditionalTaxcaOrder = new JLabel(
				"Additional Tax(CA Order Only): ");
		lblAdditionalTaxcaOrder.setBounds(44, 61, 198, 14);
		contentPane.add(lblAdditionalTaxcaOrder);

		JLabel lblAdditionalShoversea = new JLabel(
				"Additional S&H (Oversea Orders Only):");
		lblAdditionalShoversea.setBounds(10, 86, 232, 14);
		contentPane.add(lblAdditionalShoversea);

		cbbOrderType = new JComboBox();
		cbbOrderType.setBounds(252, 11, 194, 20);
		cbbOrderType.addItem(OrderManager.CA_ORDER);
		cbbOrderType.addItem(OrderManager.NON_CA_ORDER);
		cbbOrderType.addItem(OrderManager.OVERSEA_ORDER);
		contentPane.add(cbbOrderType);

		txtAmount = new JTextField();
		txtAmount.setText("100");
		txtAmount.setBounds(252, 36, 86, 20);
		contentPane.add(txtAmount);
		txtAmount.setColumns(10);

		txtTax = new JTextField();
		txtTax.setText("10");
		txtTax.setBounds(252, 61, 86, 20);
		contentPane.add(txtTax);
		txtTax.setColumns(10);

		txtSH = new JTextField();
		txtSH.setText("5");
		txtSH.setBounds(252, 86, 86, 20);
		contentPane.add(txtSH);
		txtSH.setColumns(10);

		JLabel lblResult = new JLabel("Result: ");
		lblResult.setBounds(151, 111, 69, 14);
		contentPane.add(lblResult);

		txtResult = new JLabel("");
		txtResult.setBounds(207, 111, 217, 14);
		contentPane.add(txtResult);

		btnCreateOrder = new JButton(OrderManager.CREATE_ORDER);
		btnCreateOrder.setBounds(23, 151, 118, 23);
		contentPane.add(btnCreateOrder);

		btnGetTotal = new JButton(OrderManager.GET_TOTAL);
		btnGetTotal.setBounds(151, 151, 89, 23);
		contentPane.add(btnGetTotal);

		btnExit = new JButton(OrderManager.Exit);
		btnExit.setBounds(249, 151, 89, 23);
		contentPane.add(btnExit);

		ButonHandler action = new ButonHandler(this);
		btnCreateOrder.addActionListener(action);
		btnGetTotal.addActionListener(action);
		btnExit.addActionListener(action);
	}

	public OrderVisitor getOrderVisitor() {
		return objVisitor;
	}

	public void setTotalValue(String text) {
		txtResult.setText(text);
	}

	public String getTxtAmount() {
		return txtAmount.getText();
	}

	public String getTxtTax() {
		return txtTax.getText();
	}

	public String getTxtSH() {
		return txtSH.getText();
	}

	public String getOrderType() {
		return (String) cbbOrderType.getSelectedItem();
	}
}

class ButonHandler implements ActionListener {
	OrderManager objOrderManager;

	public ButonHandler(OrderManager orderManager) {
		objOrderManager = orderManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String totalResult = "";
		if (e.getActionCommand().equals(OrderManager.Exit)) {
			System.exit(0);
		}
		if (e.getActionCommand().equals(OrderManager.CREATE_ORDER)) {
			// get type input
			String orderType = objOrderManager.getOrderType();
			String strOrderAmount = objOrderManager.getTxtAmount();
			String strTax = objOrderManager.getTxtTax();
			String strSH = objOrderManager.getTxtSH();

			double dblOrderAmount = 0.0;
			double dblTax = 0.0;
			double dblSH = 0.0;

			if (strOrderAmount.trim().length() == 0) {
				strOrderAmount = "0.0";
			}
			if (strTax.trim().length() == 0) {
				strTax = "0.0";
			}
			if (strSH.trim().length() == 0) {
				strSH = "0.0";
			}

			dblOrderAmount = new Double(strOrderAmount).doubleValue();
			dblTax = new Double(strTax).doubleValue();
			dblSH = new Double(strSH).doubleValue();

			// create the order
			Order order = createOrder(orderType, dblOrderAmount, dblTax, dblSH);

			// get the visitor
			OrderVisitor visitor = objOrderManager.getOrderVisitor();
			// accept the visitor instance
			order.accept(visitor);
			objOrderManager.setTotalValue("Order Created Successfully");
		}
		if (e.getActionCommand().equals(OrderManager.GET_TOTAL)) {
			// get the visitor
			OrderVisitor visitor = objOrderManager.getOrderVisitor();
			totalResult = new Double(visitor.getOrderTotal()).toString();
			totalResult = "Orders total= " + totalResult;
			objOrderManager.setTotalValue(totalResult);
		}
	}

	private Order createOrder(String orderType, double orderAmount, double tax,
			double SH) {
		if (orderType.equalsIgnoreCase(OrderManager.CA_ORDER)) {
			return new CaliforniaOrder(orderAmount, tax);
		}
		if (orderType.equalsIgnoreCase(OrderManager.NON_CA_ORDER)) {
			return new NonCaliforniaOrder(orderAmount);
		}
		if (orderType.equalsIgnoreCase(OrderManager.OVERSEA_ORDER)) {
			return new OverseaOrder(orderAmount, SH);
		}
		return null;
	}
}
