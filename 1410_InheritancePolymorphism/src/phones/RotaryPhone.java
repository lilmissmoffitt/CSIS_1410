package phones;

/**
 * Inherited from DeskPhone Contains a custom call method for RotaryPhone types
 * 
 * @author melissamoffitt
 *
 */
public class RotaryPhone extends DeskPhone {
	/**
	 * Initializes the model, dimension, and voltage for RotaryPhones
	 * 
	 * @param model
	 * @param dimension
	 * @param voltage
	 */
	public RotaryPhone(String model, Dimension dimension, Voltage voltage) {
		super(model, dimension, voltage);
	}

	/**
	 * Overrides the call method to return a RotaryPhone specific message
	 */
	@Override
	public String call(long number) {
		return "Rotating the dial call to " + number;
	}

}
