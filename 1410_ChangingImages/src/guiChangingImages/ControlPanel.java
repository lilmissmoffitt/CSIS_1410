package guiChangingImages;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ControlPanel extends JFrame {

	private JPanel contentPane;
	private ImagePanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlPanel frame = new ControlPanel();
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
	public ControlPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel = new ImagePanel();
		contentPane.add(panel, BorderLayout.CENTER);

		JPanel mainControlPanel = createControlPanel();
		contentPane.add(mainControlPanel, BorderLayout.SOUTH);

		JLabel lblTitle = createTitle();
		contentPane.add(lblTitle, BorderLayout.NORTH);

	}

	private JLabel createTitle() {
		JLabel lblTitle = new JLabel("DESIGN YOUR DREAM LIFE");
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblTitle.setOpaque(true);
		lblTitle.setBackground(new Color(176, 196, 222));
		return lblTitle;
	}

	/**
	 * Create control panel and contents
	 * 
	 * @return
	 */
	private JPanel createControlPanel() {
		JPanel mainControlPanel = new JPanel();
		mainControlPanel.setBorder(new EmptyBorder(15, 0, 15, 0));
		mainControlPanel.setBackground(new Color(176, 196, 222));

		JCheckBox chckbx1 = new JCheckBox("House");
		mainControlPanel.add(chckbx1);

		JCheckBox chckbx2 = new JCheckBox("Location");
		mainControlPanel.add(chckbx2);

		JCheckBox chckbx3 = new JCheckBox("Occupation");
		mainControlPanel.add(chckbx3);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (chckbx1.isSelected()) {
					panel.updateHouse();
				}
				if (chckbx2.isSelected()) {
					panel.updateLocation();
				}
				if (chckbx3.isSelected()) {
					panel.updateOccupation();
				}
				if (!chckbx1.isSelected() && !chckbx2.isSelected() && !chckbx3.isSelected()) {
					panel.updateColor();
				}
			}
		});
		mainControlPanel.add(btnSubmit);
		return mainControlPanel;
	}

}
