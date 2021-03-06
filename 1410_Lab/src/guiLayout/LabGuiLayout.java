package guiLayout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Color;

public class LabGuiLayout extends JFrame {

	private JLabel lblBox1;
	private JLabel lblBox2;
	private JLabel lblBox3;
	private JLabel lblBox4;
	private int i = 1;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiLayout frame = new LabGuiLayout();
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
	public LabGuiLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());

		JLabel lblTitle = createTitle();
		contentPane.add(lblTitle, BorderLayout.NORTH);

		JPanel mainPanel = createMainPanel();
		mainPanel.setLayout(new GridLayout(0, 4, 5, 0));

		JPanel controlPanel = createControlPanel();
		controlPanel.setLayout(new GridLayout(2, 2, 2, 2));
	}

	private JPanel createMainPanel() {
		JPanel mainPanel = new JPanel();
		contentPane.add(mainPanel, BorderLayout.CENTER);
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		lblBox1 = createBox1();
		mainPanel.add(lblBox1);

		lblBox2 = createBox2();
		mainPanel.add(lblBox2);

		lblBox3 = createBox3();
		mainPanel.add(lblBox3);

		lblBox4 = createBox4();
		mainPanel.add(lblBox4);

		return mainPanel;
	}

	private JLabel createBox4() {
		JLabel lblBox4 = new JLabel("4");
		lblBox4.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblBox4.setBackground(new Color(255, 215, 0));
		lblBox4.setOpaque(true);
		lblBox4.setHorizontalAlignment(SwingConstants.CENTER);
		return lblBox4;
	}

	private JLabel createBox3() {
		JLabel lblBox3 = new JLabel("3");
		lblBox3.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblBox3.setBackground(new Color(255, 215, 0));
		lblBox3.setOpaque(true);
		lblBox3.setHorizontalAlignment(SwingConstants.CENTER);
		return lblBox3;
	}

	private JLabel createBox2() {
		JLabel lblBox2 = new JLabel("2");
		lblBox2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblBox2.setOpaque(true);
		lblBox2.setBackground(new Color(65, 105, 225));
		lblBox2.setHorizontalAlignment(SwingConstants.CENTER);
		return lblBox2;
	}

	private JLabel createBox1() {
		JLabel lblBox1 = new JLabel("1");
		lblBox1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblBox1.setBackground(new Color(255, 215, 0));
		lblBox1.setOpaque(true);
		lblBox1.setHorizontalAlignment(SwingConstants.CENTER);
		return lblBox1;
	}

	private JPanel createControlPanel() {
		JPanel controlPanel = new JPanel();
		controlPanel.setBorder(new EmptyBorder(5, 0, 35, 0));
		contentPane.add(controlPanel, BorderLayout.WEST);

		createMoveLeftBtn(controlPanel);
		createMoveRightBtn(controlPanel);

		return controlPanel;
	}

	private void createMoveLeftBtn(JPanel controlPanel) {
		JLabel[] boxes = { lblBox1, lblBox2, lblBox3, lblBox4 };
		JButton moveLeft = new JButton("<==");
		moveLeft.setOpaque(true);
		moveLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (i == 0) {
					i = 3;
					boxes[3].setBackground(new Color(65, 105, 225));
					boxes[0].setBackground(new Color(255, 215, 0));

				} else {
					boxes[i - 1].setBackground(new Color(65, 105, 225));
					boxes[i].setBackground(new Color(255, 215, 0));
					i -= 1;
				}
			}

		});
		moveLeft.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		moveLeft.setPreferredSize(new Dimension(40, 10));
		controlPanel.add(moveLeft);
	}

	private void createMoveRightBtn(JPanel controlPanel) {
		JLabel[] boxes = { lblBox1, lblBox2, lblBox3, lblBox4 };
		JButton moveRight = new JButton("==>");
		moveRight.setOpaque(true);
		moveRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (i == 3) {
					i = 0;
					boxes[0].setBackground(new Color(65, 105, 225));
					boxes[3].setBackground(new Color(255, 215, 0));

				} else {
					boxes[i + 1].setBackground(new Color(65, 105, 225));
					boxes[i].setBackground(new Color(255, 215, 0));
					i += 1;
				}
			}
		});
		moveRight.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		moveRight.setPreferredSize(new Dimension(40, 10));
		controlPanel.add(moveRight);
	}

	private JLabel createTitle() {
		JLabel lblTitle = new JLabel("Demo Layout");
		lblTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBorder(new EmptyBorder(5, 5, 5, 5));
		return lblTitle;
	}

}
