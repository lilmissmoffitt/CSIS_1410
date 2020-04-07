package phones;

/**
 * Extends the class of Phone. Contains methods and attributes specific to
 * DeskPhones.
 * 
 * @author melissamoffitt
 *
 */

public abstract class DeskPhone extends Phone {
	/**
	 * Returns true if the phone is connected false otherwise
	 */
	public boolean connected;
	private Voltage voltage;

	/**
	 * Initializes the model, dimension, and voltage
	 * 
	 * @param model     model of phone
	 * @param dimension dimensions of the phone
	 * @param voltage   voltage required
	 */
	protected DeskPhone(String model, Dimension dimension, Voltage voltage) {
		super(model, dimension);
		this.voltage = voltage;
	}

	/**
	 * connects the deskphone
	 */
	public void plugIn() {
		connected = true;
	}

	/**
	 * disconnects the desk phone
	 */
	public void unplug() {
		connected = false;
	}

	/**
	 * Returns whether the phone is connected
	 * 
	 * @return
	 */
	public boolean isConnected() {
		return connected;
	}

	/**
	 * Returns the model, dimension, voltage, and connectionInfo formatted to the
	 * console
	 */
	public String toString() {
		String connectionInfo = "";
		if (connected == true) {
			connectionInfo = "connected";
		} else {
			connectionInfo = "not connected";
		}
		return getModel() + " " + getDimension() + " " + voltage + " " + connectionInfo;
	}

}
