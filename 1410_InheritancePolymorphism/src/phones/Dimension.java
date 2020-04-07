package phones;

/**
 * Creates the dimensions of the phones.
 * 
 * @author melissamoffitt
 *
 */
public class Dimension {

	private double height;
	private double width;
	private double depth;

	/**
	 * Initializes the dimensions of the phones
	 * 
	 * @param height
	 * @param width
	 * @param depth
	 */
	public Dimension(double height, double width, double depth) {
		if (height <= 0 || width <= 0 || depth <= 0) {
			throw new IllegalArgumentException("The height, width, and depth of a dimension needs to be positive.");
		} else {
			this.height = height;
			this.width = width;
			this.depth = depth;
		}
	}

	/**
	 * returns the height
	 * 
	 * @return
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * returns the width
	 * 
	 * @return
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * returns the depth
	 * 
	 * @return
	 */
	public double getDepth() {
		return depth;
	}

	/**
	 * Returns the formatted height, width, and depth
	 */
	public String toString() {
		return String.format("(%.1f x %.1f x %.1f)", getHeight(), getWidth(), getDepth());
	}

}
