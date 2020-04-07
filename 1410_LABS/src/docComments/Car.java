package docComments;

/**
 * Make, Model, and mpg of a vehicle
 * 
 * @author melissamoffitt
 *
 */

public class Car {
	private String make;
	private String model;
	private int mpg;
	
	/**
	 * Constructor initializes the fields
	 * 
	 * @param make
	 * @param model
	 * @param mpg
	 */
	public Car(String make, String model, int mpg) {
		this.make = make;
		this.model = model;
		this.mpg = mpg;
	}

	/**
	 * Returns the make of the requested vehicle
	 * 
	 * @return the make
	 */
	public String getMake() {
		return this.make;
	}

	/**
	 * Returns the model of the requested vehicle
	 *
	 * @return the model
	 */
	public String getModel() {
		return this.model;
	}

	/**
	 * Returns the mpg of the requested vehicle
	 * 
	 * @return the mpg miles per gallon
	 */
	public int getMpg() {
		return this.mpg;
	}
}
