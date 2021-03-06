package m02;

/**
 * Inherits class Domicile. Contains methods that will check to see if a cave
 * has a painting and will return the formatted output.
 * 
 * @author melissamoffitt
 *
 */
public class Cave extends Domicile {

	private boolean cavePainting;

	/**
	 * Initializes the numberOfRooms from the superclass and also initializes
	 * cavePainting
	 * 
	 * @param numberOfRooms
	 * @param cavePainting
	 */
	public Cave(int numberOfRooms, boolean cavePainting) {
		super(numberOfRooms);
		this.cavePainting = cavePainting;
	}

	/**
	 * Returns whether or not the cave has a painting
	 * 
	 * @return
	 */
	public boolean hasPainting() {
		return true;
	}

	/**
	 * Overrides Domiciles toString method and returns an output specified for the
	 * cave. Checks to see if the cave has a painting and will provide output
	 * accordingly
	 */
	@Override
	public String toString() {
		String checkPainting = "";
		if (cavePainting == true) {
			checkPainting = " *";
		}
		return  super.toString() + checkPainting;
	}

}
