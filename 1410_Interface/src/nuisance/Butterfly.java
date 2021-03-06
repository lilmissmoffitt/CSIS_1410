package nuisance;

import java.util.ArrayList;
import java.util.List;

/**
 * Class butterfly inherits class Insect. It also contains the list of colors
 * and initializes the butterfly objects. It contains a toString method that
 * formats the output.
 * 
 * @author melissamoffitt
 *
 */
public class Butterfly extends Insect {

	private List<String> colors;
	private Butterfly butterfly;

	/**
	 * Initializes species from superclass Insect and the list of colors
	 * 
	 * @param species
	 * @param colors
	 */
	public Butterfly(String species, List<String> colors) {
		super(species);
		this.colors = new ArrayList<String>(colors);

	}

	/**
	 * Initializes butterfly. Creates an immutable object
	 * 
	 * @param butterfly
	 */
	public Butterfly(Butterfly butterfly) {
		super(butterfly.getSpecies());
		this.colors = butterfly.getColors();

	}

	/**
	 * List containing the colors of the butterfly
	 * 
	 * @return
	 */
	public List<String> getColors() {
		return new ArrayList<String>(colors);
	}

	/**
	 * Returns the species of Insect and the colors
	 */
	public String toString() {
		return getSpecies() + " " + getColors();
	}

}
