package guiIntro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;

public class LabGuiIntro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiIntro frame = new LabGuiIntro();
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
	public LabGuiIntro() {
		JLabel lblTitle = newLblTitle();
		contentPane.add(lblTitle, BorderLayout.NORTH);
		
		JButton btnWestButton = createWestButton();
		contentPane.add(btnWestButton, BorderLayout.WEST);
		
		JPanel textPanel = newTextPanel();
		contentPane.add(textPanel, BorderLayout.SOUTH);
		{
			JLabel lblNewLabel = createRedLabel();
			contentPane.add(lblNewLabel, BorderLayout.CENTER);
		}
	}

	private JLabel createRedLabel() {
		JLabel lblNewLabel = new JLabel("Hi");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setFont(new Font("Papyrus", Font.PLAIN, 77));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(255, 0, 0));
		return lblNewLabel;
	}

	private JPanel newTextPanel() {
		JPanel textPanel = new JPanel();
		textPanel.setBackground(SystemColor.windowBorder);
		textPanel.setLayout(new MigLayout("", "[][][][grow]", "[]"));
		{
			JLabel lblNewLabel_1 = new JLabel("Name:");
			lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
			textPanel.add(lblNewLabel_1, "cell 2 0,alignx trailing");
		}
		{
			textField = new JTextField();
			textField.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
			textPanel.add(textField, "cell 3 0,growx");
			textField.setColumns(10);
		}
		return textPanel;
	}

	private JButton createWestButton() {
		JButton btnWestButton = new JButton("WEST");
		return btnWestButton;
	}

	private JLabel newLblTitle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblTitle = new JLabel("My First Gui");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Verdana", Font.PLAIN, 33));
		lblTitle.setForeground(new Color(0, 255, 0));
		lblTitle.setOpaque(true);
		lblTitle.setBackground(new Color(0, 0, 255));
		lblTitle.setBorder(new EmptyBorder(2, 10, 2, 2));
		return lblTitle;
	}

}
