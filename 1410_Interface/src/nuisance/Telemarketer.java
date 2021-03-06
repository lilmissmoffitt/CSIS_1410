package nuisance;

/**
 * Telemarkerter inherits Person and is an interface of Nuisance
 * 
 * @author melissamoffitt
 *
 */
public class Telemarketer extends Person implements Nuisance {

	/**
	 * Initializes the name and age of the superclass Person for telemarketer
	 * 
	 * @param name
	 * @param age
	 */
	public Telemarketer(String name, int age) {
		super(name, age);
	}

	/**
	 * Overrides the annoy method from Nuisance and provides an output custom to the
	 * telemarketer
	 * 
	 */
	@Override
	public String annoy() {
		return getName() + " annoys by giving a sales pitch";

	}

	/**
	 * Returns an output specific to the telemarketer
	 * 
	 * @return
	 */
	public String giveSalesPitch() {
		return getName() + " pressures others to buy stuff";
	}

}
