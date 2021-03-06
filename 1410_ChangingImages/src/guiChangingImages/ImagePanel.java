package guiChangingImages;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ImagePanel extends JPanel {
	int houseIndex = 0;
	int locationIndex = 0;
	int occupationIndex = 0;
	int colorIndex = 0;

	private ImageIcon[] houses = { new ImageIcon(ImagePanel.class.getResource("/guiChangingImages/Images/House A.png")),
			new ImageIcon(ImagePanel.class.getResource("/guiChangingImages/Images/house 4 (1).png")),
			new ImageIcon(ImagePanel.class.getResource("/guiChangingImages/Images/House C.png")) };
	private ImageIcon[] locations = {
			new ImageIcon(ImagePanel.class.getResource("/guiChangingImages/Images/desert.png")),
			new ImageIcon(ImagePanel.class.getResource("/guiChangingImages/Images/forest.png")),
			new ImageIcon(ImagePanel.class.getResource("/guiChangingImages/Images/background 4.png")) };
	private ImageIcon[] occupations = {
			new ImageIcon(ImagePanel.class.getResource("/guiChangingImages/Images/doctor 1.png")),
			new ImageIcon(ImagePanel.class.getResource("/guiChangingImages/Images/doctor 2.png")),
			new ImageIcon(ImagePanel.class.getResource("/guiChangingImages/Images/doctor 3.png")) };
	private Color[] colors = { Color.WHITE, Color.BLUE, Color.GREEN, Color.ORANGE, Color.MAGENTA };

	/**
	 * Create the panel.
	 */
	public ImagePanel() {

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		ImageIcon house = houses[houseIndex];
		house.paintIcon(this, g, 10, 10);
		ImageIcon location = locations[locationIndex];
		location.paintIcon(null, g, 0, 350);
		ImageIcon occupation = occupations[occupationIndex];
		occupation.paintIcon(null, g, 0, 200);
		this.setBackground(colors[colorIndex]);

	}

	public void updateHouse() {
		houseIndex = ++houseIndex % houses.length;
		repaint();
	}

	public void updateLocation() {
		locationIndex = ++locationIndex % locations.length;
		repaint();
	}

	public void updateOccupation() {
		occupationIndex = ++occupationIndex % occupations.length;
		repaint();
	}

	public void updateColor() {
		colorIndex = ++colorIndex % colors.length;
		repaint();
	}
}
