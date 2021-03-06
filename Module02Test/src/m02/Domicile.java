package m02;

/**
 * Is a superclass for House and Cave. Contains the characteristics of a
 * domicile such as the number of rooms and a statement for heating
 * 
 * @author melissamoffitt
 *
 */
public class Domicile {
	private int numberOfRooms;

	/**
	 * Initializes the numberOfRooms and will throw an IllegalException if the
	 * number is negative
	 * 
	 * @param numberOfRooms
	 */
	public Domicile(int numberOfRooms) {
		if (numberOfRooms < 0) {
			throw new IllegalArgumentException("A domicile needs to have at least one room.");
		} else {
			this.numberOfRooms = numberOfRooms;
		}
	}

	/**
	 * Returns the numberOfRooms
	 * 
	 * @return
	 */
	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	/**
	 * Returns the statement "heating" for when a domicile is being heated
	 */
	public void heat() {
		System.out.println("heating");
	}

	/**
	 * Returns the type of domicile and gets the numberOfRooms
	 */
	public String toString() {

		return this.getClass().getSimpleName() + " with " + getNumberOfRooms() + " rooms";
	}

}
