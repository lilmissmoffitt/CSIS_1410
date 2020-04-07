package phones;

/**
 * This is the main abstract class. SmartPhone and DeskPhone are inherited from
 * this class.
 * 
 * @author melissamoffitt 
 *
 */
public abstract class Phone {

	private String model;
	private Dimension dimension;

	/**
	 * Initializes the model and dimension of Phone
	 * 
	 * @param model
	 * @param dimension
	 */
	protected Phone(String model, Dimension dimension) {
		this.model = model;
		this.dimension = dimension;
	}

	/**
	 * Creates method to input phone number
	 * 
	 * @param number phone number
	 * @return
	 */
	public abstract String call(long number);

	/**
	 * Returns the model and dimension
	 */
	public String toString() {
		return model + dimension;
	}

	/**
	 * Returns the dimension
	 * 
	 * @return
	 */
	protected Dimension getDimension() {
		return dimension;
	}

	/**
	 * Returns the model
	 * 
	 * @return
	 */
	protected String getModel() {
		return model;
	}
}
