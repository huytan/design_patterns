package example.two;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//http://javapapers.com/design-patterns/flyweight-design-pattern/
public class Client extends JFrame {

	private static final int WIDTH = 400;
	private static final int HEIGHT = 400;
	private JPanel contentPane;
	private static final String shapes[] = { "R", "O" };
	private static final Color colors[] = { Color.red, Color.green, Color.blue };
	private static final boolean fill[] = { true, false };
	private static final String font[] = { "Arial", "Courier" };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
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
	public Client() {
		setSize(WIDTH, WIDTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		final JPanel panel = new JPanel();
		JButton btnDraw = new JButton("Draw");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Graphics g = panel.getGraphics();
				for (int i = 0; i < 20; ++i) {
					MyShape shape = ShapeFactory.getShape(getRandomShape());
					shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(),
							getRandomHeight(), getRandomColor(),
							getRandomFill(), getRandomFont());
				}
			}
		});
		contentPane.add(btnDraw, BorderLayout.SOUTH);

		contentPane.add(panel, BorderLayout.CENTER);
	}

	private String getRandomShape() {
		return shapes[(int) (Math.random() * shapes.length)];
	}

	private int getRandomX() {
		return (int) (Math.random() * WIDTH);
	}

	private int getRandomY() {
		return (int) (Math.random() * HEIGHT);
	}

	private int getRandomWidth() {
		return (int) (Math.random() * (WIDTH / 7));
	}

	private int getRandomHeight() {
		return (int) (Math.random() * (HEIGHT / 7));
	}

	private Color getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private boolean getRandomFill() {
		return fill[(int) (Math.random() * fill.length)];
	}

	private String getRandomFont() {
		return font[(int) (Math.random() * font.length)];
	}
}
