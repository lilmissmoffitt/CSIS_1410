package module03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

/**
 * This class creates a Java Gui that will change the image of the red box when
 * you click the "LOOK" button until you encounter the yellow box.
 * 
 * @author melissamoffitt
 *
 */
@SuppressWarnings("serial")
public class Module03Gui extends JFrame {
	private int count = 1;
	private final Random rand = new Random();
	private int randIndex;
	private ImageIcon[] faces = { new ImageIcon(Module03Gui.class.getResource("/module03/Images/RedSquare1.png")),
			new ImageIcon(Module03Gui.class.getResource("/module03/Images/RedSquare2.png")),
			new ImageIcon(Module03Gui.class.getResource("/module03/Images/RedSquare3.png")),
			new ImageIcon(Module03Gui.class.getResource("/module03/Images/YellowSquare.png")) };
	private JLabel lblMain;
	private JPanel contentPane;
	private JLabel lblWhichFace;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Module03Gui frame = new Module03Gui();
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
	public Module03Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		lblMain = createMainLabel();
		contentPane.add(lblMain, BorderLayout.CENTER);

		lblWhichFace = createFaceLabel();
		contentPane.add(lblWhichFace, BorderLayout.SOUTH);

		JButton btnLook = createBtnLook();
		contentPane.add(btnLook, BorderLayout.EAST);
	}

	/**
	 * Create the button "LOOK" that will be used to change images
	 * 
	 * @return
	 */
	private JButton createBtnLook() {
		JButton btnLook = new JButton("LOOK");
		btnLook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (randIndex != 3) {
					randIndex = rand.nextInt(4);
					count++;
				}

				lblMain.setIcon(faces[randIndex]);
				lblWhichFace.setText("Face " + count);

				if (lblMain.getIcon().equals(faces[3])) {
					lblMain.setBackground(new Color(100, 100, 100));
				}

			}
		});
		btnLook.setPreferredSize(new Dimension(60, 29));
		btnLook.setOpaque(true);
		btnLook.setBackground(new Color(180, 180, 180));
		btnLook.setBorder(new EmptyBorder(0, 5, 0, 0));
		btnLook.setForeground(new Color(20, 20, 20));
		btnLook.setBorder(new EmptyBorder(0, 10, 0, 10));
		return btnLook;
	}

	/**
	 * Create the bottom label that will track which face number is displayed
	 * 
	 * @return
	 */
	private JLabel createFaceLabel() {
		JLabel lblWhichFace = new JLabel("Face " + count);
		lblWhichFace.setOpaque(true);
		lblWhichFace.setBackground(new Color(180, 180, 180));
		lblWhichFace.setBorder(new EmptyBorder(8, 0, 8, 0));
		lblWhichFace.setForeground(new Color(50, 50, 50));
		lblWhichFace.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblWhichFace.setHorizontalAlignment(SwingConstants.CENTER);
		return lblWhichFace;
	}

	/**
	 * Create the main label where the images will be displayed
	 * 
	 * @return
	 */
	private JLabel createMainLabel() {
		JLabel lblMain = new JLabel();
		lblMain.setOpaque(true);
		lblMain.setBorder(new EmptyBorder(10, 15, 10, 0));
		lblMain.setIcon(faces[0]);
		return lblMain;
	}

}
