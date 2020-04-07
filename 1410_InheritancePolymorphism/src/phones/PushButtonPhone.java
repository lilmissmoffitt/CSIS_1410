package phones;

/**
 * Inherits DeskPhone and overrides the call method to a PushButtonPhone
 * specific action
 * 
 * @author melissamoffitt
 *
 */
public class PushButtonPhone extends DeskPhone {
	/**
	 * Initializes the model, dimension, and voltage for the PushButtonPhone
	 * 
	 * @param model
	 * @param dimension
	 * @param voltage
	 */
	public PushButtonPhone(String model, Dimension dimension, Voltage voltage) {
		super(model, dimension, voltage);
	}

	/**
	 * Overrides the call methods to be PushButton specific
	 */
	@Override
	public String call(long number) {
		return "Pushing buttons to call " + number;
	}
}
