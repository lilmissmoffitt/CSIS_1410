package phones;

import java.util.Random;
 
/**
 * Inherits Phone class. Contains methods and attributes specific to SmartPhones
 * 
 * @author melissamoffitt
 *
 */
public class SmartPhone extends Phone {
	private int storage;

	/**
	 * Initializes the model, dimension, and storage for SmartPhone Throws exception
	 * if input storage value is negative
	 * 
	 * @param model
	 * @param dimension
	 * @param storage
	 */
	public SmartPhone(String model, Dimension dimension, int storage) {
		super(model, dimension);
		this.storage = storage;

		if (storage <= 0) {
			throw new IllegalArgumentException("Storage needs to be assigned a positive value.");
		}
	}

	/**
	 * Overrides the call method with SmartPhone specific action
	 */
	@Override
	public String call(long number) {
		return "Calling " + number + " by selecting the number";
	}

	/**
	 * Returns "browsing the web"
	 * 
	 * @return
	 */
	public String browse() {
		return "Browsing the web";
	}

	/**
	 * Takes picture. Is random to whether it will be horizontal or vertical
	 * 
	 * @return
	 */
	public String takePicture() {
		Random rand = new Random();
		int randNum = rand.nextInt();
		String random = "";

		if (randNum % 2 == 0) {
			random = "Taking a horizontal picture";
		} else {
			random = "Taking a vertical picture";
		}
		return random;
	}

	/**
	 * Returns the formatted model, dimension, and storage
	 */
	public String toString() {
		return getModel() + " " + getDimension() + " " + storage + "GB";
	}

}
