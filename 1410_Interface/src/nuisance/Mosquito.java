package nuisance;

/**
 * Class Mosquito inherits class Insect and is an interface of Nuisance. It also
 * contains the method buzz.
 * 
 * @author melissamoffitt
 *
 */
public class Mosquito extends Insect implements Nuisance {

	/**
	 * Initializes species from superclass Insect
	 * 
	 * @param species
	 */
	public Mosquito(String species) {
		super(species);
	}

	/**
	 * Returns a String of the species buzzing around
	 * 
	 * @return
	 */
	public String buzz() {
		return getSpecies() + " buzzing around";
	}

	/**
	 * Overrides the annoy method of interface Nuisance
	 */
	@Override
	public String annoy() {
		return "buzz buzz buzz";
	}
}