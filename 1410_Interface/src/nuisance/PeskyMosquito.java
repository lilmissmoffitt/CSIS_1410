package nuisance;

/**
 * Class PeskyMosquito inherits Mosquito. It also adds the method bite.
 * 
 * @author melissamoffitt
 *
 */
public class PeskyMosquito extends Mosquito {

	/**
	 * Initializes species from superclass Mosquito
	 * 
	 * @param species
	 */
	public PeskyMosquito(String species) {
		super(species);
	}

	/**
	 * Returns an output "sucking blood"
	 * 
	 * @return
	 */
	public String bite() {
		return "sucking blood";
	}

}
