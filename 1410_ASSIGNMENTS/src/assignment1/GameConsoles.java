package assignment1;
/**
 * Contains the brand, name, price and ID of each Game Console
 * that will then be stored in the ArrayList
 * 
 * @author Melissa Moffitt and Sarah Friedrichs
 *
 */

public class GameConsoles {
	private String brand;
	private String name;
	private double price;
	private int id;
	private static int count = 0;



	/**
	 * Constructor initializes fields
	 * 
	 * @param brand 
	 * @param name
	 * @param price
	 */
	public GameConsoles(String brand, String name, double price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
		id = 12345678 + count++;
	}


	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}


	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param Sets the name
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 *  Prints the array information into the following format:
	 *  Brand Name $XXX.XX ID: 12345678
	 *
	 */
	@Override
	public String toString() {
		return String.format("%s %s $%.2f ID: %d", brand, name, price, id);
	}
}