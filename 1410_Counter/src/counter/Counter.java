package counter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Creates a JFrame to count the number of times the background color changes to
 * red. The background color is set to change at random.
 * 
 * @author melissamoffitt
 *
 */
public class Counter extends JFrame {
	
	private Color[] colors = { Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.MAGENTA };
	private final Random rand = new Random();
	private int randIndex = rand.nextInt(5);
	private int verifiedIndex = 0;
	private int count = 0;
	private JPanel contentPane;
	private JLabel lblRedCounter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counter frame = new Counter();
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
	public Counter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panelMain = mainPanel();
		contentPane.add(panelMain, BorderLayout.CENTER);

		redCounter(panelMain);

		JButton btnClickMe = clickMe();
		panelMain.add(btnClickMe);

		JLabel lblTitle = title();
		contentPane.add(lblTitle, BorderLayout.SOUTH);
	}

	/**
	 * Returns the formatted title of the JFrame
	 * 
	 * @return
	 */
	private JLabel title() {
		JLabel lblTitle = new JLabel("Melissa's GUI");
		lblTitle.setOpaque(true);
		lblTitle.setBackground(new Color(220, 220, 220));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBorder(new EmptyBorder(5, 5, 5, 5));
		return lblTitle;
	}

	/**
	 * Returns the formatted button clickMe. Also has an action performed when
	 * clicked, which will count and return how many times the background color
	 * changes to red
	 * 
	 * @return
	 */
	private JButton clickMe() {
		JButton btnClickMe = new JButton("Click Me");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do {
					randIndex = rand.nextInt(5);
				} while (randIndex == verifiedIndex);
				verifiedIndex = randIndex;
				btnClickMe.setBackground(colors[verifiedIndex]);

				if (btnClickMe.getBackground().equals(Color.RED)) {
					count += 1;
				}
				String sCount = String.format("%02d", count);

				lblRedCounter.setText("Red Counter: " + sCount);

			}
		});
		btnClickMe.setFont(new Font("Courier", Font.PLAIN, 20));
		btnClickMe.setForeground(new Color(255, 255, 255));
		btnClickMe.setBackground(new Color(0, 0, 255));
		btnClickMe.setOpaque(true);
		btnClickMe.setBorderPainted(false);
		return btnClickMe;
	}

	/**
	 * Creates the redCounter in the main JPanel
	 * 
	 * @param panelMain
	 */
	private void redCounter(JPanel panelMain) {
		lblRedCounter = new JLabel("Red Counter: 00");
		lblRedCounter.setFont(new Font("monospaced", Font.PLAIN, 20));
		lblRedCounter.setBackground(new Color(192, 192, 192));
		lblRedCounter.setOpaque(true);
		lblRedCounter.setFont(new Font("Courier", Font.PLAIN, 20));
		lblRedCounter.setHorizontalAlignment(SwingConstants.CENTER);
		panelMain.add(lblRedCounter);
	}

	/**
	 * Creates the main JPanel in which the redCounter and clickMe button are
	 * located
	 * 
	 * @return
	 */
	private JPanel mainPanel() {
		JPanel panelMain = new JPanel();
		panelMain.setLayout(new GridLayout(0, 2, 0, 0));
		return panelMain;
	}

}
