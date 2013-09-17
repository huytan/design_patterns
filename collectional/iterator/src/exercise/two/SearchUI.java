package exercise.two;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class SearchUI extends JFrame {

	JPanel contentPane;
	JTextField txtSearch;
	JComboBox cbbType;
	JTextArea txtContent;
	JButton btnSearch;
	JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchUI frame = new SearchUI();
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
	public SearchUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(10, 11, 46, 14);
		contentPane.add(lblType);

		txtSearch = new JTextField();
		txtSearch.setBounds(57, 35, 117, 20);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);

		cbbType = new JComboBox();
		cbbType.setBounds(57, 8, 117, 20);
		cbbType.addItem("Author");
		cbbType.addItem("Book");
		contentPane.add(cbbType);

		txtContent = new JTextArea();
		txtContent.setEnabled(false);
		txtContent.setBounds(10, 77, 414, 174);
		contentPane.add(txtContent);

		btnSearch = new JButton("Search");
		btnSearch.setBounds(215, 7, 89, 23);
		contentPane.add(btnSearch);

		btnExit = new JButton("Exit");
		btnExit.setBounds(314, 7, 89, 23);
		contentPane.add(btnExit);

		ButtionAction action = new ButtionAction(this);
		btnSearch.addActionListener(action);
		btnExit.addActionListener(action);
	}

	public String getCbbType() {
		return (String) cbbType.getSelectedItem();
	}

	public void setTxtContent(String txtContent) {
		this.txtContent.setText(txtContent);
	}

}

class ButtionAction implements ActionListener {
	SearchUI manager;

	public ButtionAction() {
	}

	public ButtionAction(SearchUI manager) {
		super();
		this.manager = manager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Exit")) {
			System.exit(1);
		} else {
			String txtSearch = manager.txtSearch.getText();
			Iterator dataAuthor;
			String str = null;

			AuthorCollection ac;
			try {
				ac = new AuthorCollection();

				if (manager.getCbbType().equals("Author")) {
					dataAuthor = ac.getAuthor(txtSearch);

					while (dataAuthor.hasNext()) {
						Author c = (Author) dataAuthor.next();
						str = "\n" + c.getNameAuthor() + " - "
								+ c.getBookTitle();
					}
				}
				if (manager.getCbbType().equals("Book")) {
					dataAuthor = ac.getBook(txtSearch);

					while (dataAuthor.hasNext()) {
						Author c = (Author) dataAuthor.next();
						str = "\n" + c.getNameAuthor() + " - "
								+ c.getBookTitle();
					}
				}
				if (str == null) {
					manager.setTxtContent("Not found!!!");
				} else {
					manager.setTxtContent(str);
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
