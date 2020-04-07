package labInterface;

/**
 * Implements interface Flyable. Creates a Hangglider object that is a ridigWing
 * or not. It implements the methods launch, land, and toString to print
 * messages specific to Hanggliders.
 * 
 * @author Margarethe Posch + melissamoffitt
 *
 */
public class Hangglider implements Flyable {
	private final boolean isRigidWing;

	/**
	 * Initializes the rigidWing. This tells whether or not the Hangglider is a
	 * rigidWing
	 * 
	 * @param rigidWing
	 */
	public Hangglider(boolean rigidWing) {
		isRigidWing = rigidWing;
	}

	/**
	 * Prints a message specific to the Hangglider object
	 */
	@Override
	public String toString() {
		return String.format(isRigidWing ? "Rigid-wing" : "Flex-wing");
	}

	/**
	 * Prints a message specific to the launching of the Hangglider object
	 */
	public void launch() {
		System.out.println("Running until take-off");

	}

	/**
	 * Prints a message specific to the landing of the Hangglider object
	 */
	public void land() {
		System.out.println("Gliding to a land");

	}
}
