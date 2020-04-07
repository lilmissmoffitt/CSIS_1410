package labCollection;

import java.awt.Color;

/**
 * Contains the constructor for couch and initializes the fields color and
 * material. Contains the equals, hashcode, and toString methods.
 * 
 * @author melissamoffitt
 *
 */
public class Couch {

	public Color color;
	public Material material;

	public Couch(Color color, Material material) {
		this.material = material;
		this.color = color;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @return the material
	 */
	public Material getMaterial() {
		return material;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Couch other = (Couch) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (material != other.material)
			return false;
		return true;
	}

	/**
	 * returns the formatted the Couch object
	 */
	@Override
	public String toString() {

		return String.format("Couch: #%02x %s", getColor().getRGB(), getMaterial().toString().toLowerCase());
	}

}
