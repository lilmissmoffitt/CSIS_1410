package guiDice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JToggleButton;

public class LabGuiDice extends JFrame {

	private ImageIcon img1 = new ImageIcon(LabGuiDice.class.getResource("/guiDice/image/die-1.png"));
	private ImageIcon img2 = new ImageIcon(LabGuiDice.class.getResource("/guiDice/image/die-2.png"));
	private ImageIcon img3 = new ImageIcon(LabGuiDice.class.getResource("/guiDice/image/die-3.png"));
	private ImageIcon img4 = new ImageIcon(LabGuiDice.class.getResource("/guiDice/image/die-4.png"));
	private ImageIcon img5 = new ImageIcon(LabGuiDice.class.getResource("/guiDice/image/die-5.png"));
	private ImageIcon img6 = new ImageIcon(LabGuiDice.class.getResource("/guiDice/image/die-6.png"));
	private JPanel contentPane;
	private ImageIcon[] dice = { img1, img2, img3, img4, img5, img6 };
	private JLabel lblDice;

	private final Random rand = new Random();
	int randNum = rand.nextInt(6);
	int verifiedNum = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiDice frame = new LabGuiDice();
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
	public LabGuiDice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		lblDice = dice();
		contentPane.add(lblDice, BorderLayout.CENTER);
		JButton btnNewButton = rollingDice();
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
	}

	private JButton rollingDice() {
		JButton btnRoll = new JButton("Roll 'Em");
		btnRoll.setVerticalAlignment(SwingConstants.BOTTOM);
		btnRoll.setFont(new Font("Rockwell", Font.PLAIN, 20));
		btnRoll.setForeground(new Color(255, 192, 203));
		btnRoll.setOpaque(true);
		btnRoll.setBackground(Color.BLACK);
		btnRoll.setBorderPainted(false);
		btnRoll.setBorder(new EmptyBorder(15, 5, 5, 5));

		btnRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				do {
					randNum = rand.nextInt(6);
				} while (randNum == verifiedNum);

				verifiedNum = randNum;

				lblDice.setIcon(dice[verifiedNum]);

			}
		});
		btnRoll.setOpaque(true);
		return btnRoll;
	}

	private JLabel dice() {

		JLabel lblDice = new JLabel("");
		lblDice.setIcon(dice[randNum]);
		lblDice.setHorizontalAlignment(SwingConstants.CENTER);
		return lblDice;
	}

}
