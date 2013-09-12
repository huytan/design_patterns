package example.two_interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.naming.Context;
import javax.naming.InitialContext;

import example.two_interface.factory.CustomerUtil;
import example.two_interface.factory.ICustomerFactory;
import example.two_interface.impl.RemoteAccountImpl;

public class ServerUI extends JFrame {

	public static final String START = "Start";
	public static final String STOP = "Stop";
	public static final String EXIT = "Exit";

	private JPanel contentPane;
	private DefaultListModel dlm;
	private JList lst;
	JLabel lblMessage;
	JButton btnStart;
	JButton btnStop;
	private JButton btnExit;
	Context ctx = null;
	private static String mode = null;
	public CustomerUI customerUI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerUI frame = new ServerUI();
					java.rmi.registry.LocateRegistry.createRegistry(1099);
					frame.DislplayInfos("server is stop…");
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
	@SuppressWarnings("unchecked")
	public ServerUI() {
		setTitle("Server");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnStart = new JButton(ServerUI.START);
		btnStart.setBounds(50, 194, 89, 23);
		contentPane.add(btnStart);

		btnStop = new JButton(ServerUI.STOP);
		btnStop.setBounds(149, 194, 89, 23);
		contentPane.add(btnStop);

		btnExit = new JButton(ServerUI.EXIT);
		btnExit.setBounds(248, 194, 89, 23);
		contentPane.add(btnExit);

		dlm = new DefaultListModel();
		lst = new JList(dlm);
		lst.setBounds(10, 11, 368, 168);
		contentPane.add(new JScrollPane(lst), BorderLayout.CENTER);

		lblMessage = new JLabel("");
		lblMessage.setBounds(20, 228, 333, 14);
		contentPane.add(lblMessage);
		DislplayInfos("server stop...");
		ButtonHandlerServer handlerServer = new ButtonHandlerServer(this, mode);

		btnExit.addActionListener(new ButtonHandlerServer());
		btnStart.addActionListener(handlerServer);
		btnStop.addActionListener(handlerServer);
	}

	public void DislplayInfos(String msg) {
		lblMessage.setText(msg);
	}

	public void addItem(String item) {
		dlm.addElement(item);
	}
}// end class

class ButtonHandlerServer implements ActionListener {
	ServerUI serverUI;
	String mode;

	public ButtonHandlerServer() {
		// TODO Auto-generated constructor stub
	}

	public ButtonHandlerServer(ServerUI serverUI, String mode) {
		// TODO Auto-generated constructor stub
		this.serverUI = serverUI;
		this.mode = mode;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// String vhConnectTo = mode;
		//
		// ICustomerFactory factory = CustomerUtil.getCustFactory(vhConnectTo);
		if (e.getActionCommand().equals(ServerUI.START)) {

			serverUI.lblMessage.setText("Calculator server is running…");

			serverUI.btnStop.setEnabled(true);
			serverUI.btnStart.setEnabled(false);
		} else if (e.getActionCommand().equals(ServerUI.STOP)) {

			serverUI.ctx = null;
			serverUI.btnStop.setEnabled(false);
			serverUI.btnStart.setEnabled(true);
			serverUI.lblMessage.setText("Calculator server is stopped…");

		} else if (e.getActionCommand().equals(ServerUI.EXIT)) {
			System.exit(0);
		}
	}
}
