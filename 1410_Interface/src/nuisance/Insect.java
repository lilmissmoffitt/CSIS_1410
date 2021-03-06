package nuisance;

/**
 * Creates and contains the species of Insects. Allows for you to call the
 * species and print a formatted string.
 * 
 * @author melissamoffitt
 *
 */
public class Insect {
	private String species;

	/**
	 * Initializes species
	 * 
	 * @param species
	 */
	public Insect(String species) {
		this.species = species;
	}

	/**
	 * Returns the species of insect
	 * 
	 * @return
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * Formats the output of the class name and the species
	 */
	public String toString() {
		return this.getClass().getSimpleName() + ": " + getSpecies();
	}
}
