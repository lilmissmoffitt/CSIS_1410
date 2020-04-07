package abstractClass;

/**
 * Contains Superclass Printer. Also contains the methods that will be used to
 * count the serialNumber and return the model of printer. This also contains
 * the method that will return the model and serialNumber to the console.
 * 
 * @author melissamoffitt
 *
 */
public abstract class Printer {

	private String model;
	private static int count = 12345;
	private int serialNumber;

	/**
	 * Increases the count of the serialNumber
	 * 
	 * @param model
	 */
	protected Printer(String model) {
		count++;
		this.model = model;
		serialNumber += count;
	}

	/**
	 * Returns the model of printer
	 * 
	 * @return
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Returns the serialNumber
	 * 
	 * @return
	 */
	public int getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Will check if the toner/cartridge/other is empty and return the remaining
	 * toner/cartridge/other percent.
	 */
	public abstract void print();

	/**
	 * Returns formatted output of model and serialNumber
	 */
	public String toString() {
		return this.getClass().getSimpleName() + ": " + getModel() + " #" + getSerialNumber();
	}
 
}
