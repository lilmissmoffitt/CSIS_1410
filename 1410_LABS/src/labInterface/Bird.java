package labInterface;

/**
 * Implements interface Flyable. Creates a Bird object with a specified type of
 * bird. It implements the methods launch, land, and toString to print messages
 * specific to birds.
 * 
 * @author Margarethe Posch + melissamoffitt
 *
 */
public class Bird implements Flyable {
	private final String type;

	/**
	 * Initializes the type of bird
	 * 
	 * @param t type
	 */
	public Bird(String t) {
		type = t;
	}

	/**
	 * Returns the type of bird
	 */
	@Override
	public String toString() {
		return type;
	}

	/**
	 * Prints a message specific to the launching of the Bird object
	 */
	public void launch() {
		System.out.println("Flapping the wings to take off");

	}

	/**
	 * Prints a message specific to the landing of the Bird object
	 */
	public void land() {
		System.out.println("Flapping the wings until landing");

	}
}
