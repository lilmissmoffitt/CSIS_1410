package abstractClass;

/**
 * This is a subclass of Printer. This contains the methods that will refill the
 * toner and retrieve the remaining toner. It also overrides the print method to
 * specify LaserPrinter attributes.
 * 
 * @author melissamoffitt
 *
 */
public class LaserPrinter extends Printer {
	private int remainingToner;

	/**
	 * Initializes the model for the LaserPrinter Starting it with 100% full
	 * 
	 * @param model
	 */
	public LaserPrinter(String model) {
		super(model);
		remainingToner = 100;
	}
 
	/**
	 * Retrieves remaining toner
	 * 
	 * @return
	 */
	public int getRemainingToner() {
		return remainingToner;
	}

	/**
	 * Sets toner back to 100
	 */
	public void refillToner() {
		remainingToner = 100;
	}

	@Override
	public void print() {
		if (remainingToner == 0) {
			System.out.println("The toner is empty.");
		} else {
			remainingToner -= 10;
			System.out.println(getModel() + " is printing. Remaining toner: " + remainingToner + "%");
		}
	}
}
