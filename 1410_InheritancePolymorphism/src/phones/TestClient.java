package phones;

import java.util.Random;

/**
 * Creates objects and an array to generate output to the console. This will be
 * a summary of the different types of phones and their attributes, such as:
 * their dimensions, storage, voltage, and whether the types of desk phones are
 * connected.
 * 
 * @author melissamoffitt
 *
 */
public class TestClient {
	/**
	 * Creates phone objects inherited from their super classes.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Creating objects of phones
		Dimension d1 = new Dimension(143, 208, 119);
		RotaryPhone rp = new RotaryPhone("Model 500", d1, Voltage.V110);

		Dimension d2 = new Dimension(178, 228, 127);
		PushButtonPhone pbp = new PushButtonPhone("Cortelco 2500", d2, Voltage.DUAL);

		Dimension d3 = new Dimension(145.6, 68.2, 7.9);
		SmartPhone sp1 = new SmartPhone("Pixel3", d3, 128);

		Dimension d4 = new Dimension(138.4, 67.3, 7.3);
		SmartPhone sp2 = new SmartPhone("iPhone8", d4, 64);

		System.out.println("Various Phones:");
		System.out.println(rp.toString() + "\n" + pbp.toString() + "\n" + sp1.toString() + "\n" + sp2.toString());

		System.out.println();
		// Connecting desk phones
		rp.plugIn();
		pbp.plugIn();
		// Selecting Random desk phone to connect
		double rand = Math.random();
		if (Math.round(rand*100) % 2 == 0) {
			rp.unplug();
		} else {
			pbp.unplug();
		}
		// Array of phones 
		Phone[] phones = { rp, pbp, sp1, sp2 };
		System.out.println("Array Elements:");

		for (Phone p : phones) {

			System.out.println(p.toString());
			System.out.println(p.call(8019574111L));
			if (p instanceof SmartPhone) {
				System.out.println(((SmartPhone) p).browse());
				System.out.println(((SmartPhone) p).takePicture());
			}
			System.out.println();
		}

	}
}
