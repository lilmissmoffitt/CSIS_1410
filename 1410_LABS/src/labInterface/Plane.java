package labInterface;

/**
 * Implements interface Flyable. Creates a Plane object with a specified number
 * of engines and model type. It implements the methods launch, land, and
 * toString to print messages specific to Planes.
 * 
 * @author Margarethe Posch + melissamoffitt
 *
 */
public class Plane implements Flyable {
	private final int numberOfEngines;
	private final String model;

	/**
	 * Initializes engines and model
	 * 
	 * @param engines numberOfEngines
	 * @param m       model
	 */
	public Plane(int engines, String m) {
		numberOfEngines = engines;
		model = m;
	}

	/**
	 * Prints a message specific to the Plane object
	 */
	@Override
	public String toString() {
		return String.format("%s with %d engines", model, numberOfEngines);
	}

	/**
	 * Prints a message specific to the launching of the Plane object
	 */
	public void launch() {
		System.out.println("Rolling until take-off");

	}

	/**
	 * Prints a message specific to the landing of the Plane object
	 */
	public void land() {
		System.out.println("Rolling to a stop");

	}
}
