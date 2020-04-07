package abstractClass;

/**
 * This is a subclass of Printer. This contains the methods that will refill the
 * cartridge and retrieve the remaining cartridge level. It also overrides the
 * print method to specify InkjetPrinter attributes.
 * 
 * @author melissamoffitt
 *
 */
public class InkjetPrinter extends Printer {

	private int remainingCartridge;

	/**
	 * Initializes the model for the InkjetPrinter Starting it with 100% full
	 * 
	 * @param model
	 */

	public InkjetPrinter(String model) {
		super(model);
		remainingCartridge = 100;
	}

	/**
	 * Retrieves remaining cartridge
	 * 
	 * @return
	 */
	public int getRemainingCartridge() {
		return remainingCartridge;
	}

	/**
	 * Sets cartridge back to 100
	 */
	public void refillCartridge() {
		remainingCartridge = 100;
	}

	@Override
	public void print() {
		if (remainingCartridge == 0) {
			System.out.println("The cartridge is empty.");
		} else {
			remainingCartridge -= 10;
			System.out.println(getModel() + " is printing. Remaining cartridge: " + remainingCartridge + "%");
		}
	}
 
}
