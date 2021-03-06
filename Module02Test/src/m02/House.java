package m02;

/**
 * Inherits class Domicile. Contains methods that will provide the name of the
 * architect. Overrides the heat method from Domicile to a specified output for
 * a house. Will return formatted output specific to a house.
 * 
 * @author melissamoffitt
 *
 */
public class House extends Domicile {
	private String architect;

	/**
	 * Initializes the numberOfRooms from the superclass and the architect
	 * 
	 * @param numberOfRooms
	 * @param architect
	 */
	public House(int numberOfRooms, String architect) {
		super(numberOfRooms);
		this.architect = architect;
	}

	/**
	 * Returns the architect
	 * 
	 * @return
	 */
	public String getArchitect() {
		return architect;
	}

	@Override
	public void heat() {
		System.out.println("running the heater");
	}

	/**
	 * Returns a formatted output specific to a House Including type, number of
	 * rooms, and the architect
	 */
	@Override
	public String toString() {
		
		return super.toString() + " by " + getArchitect();
	}
}
