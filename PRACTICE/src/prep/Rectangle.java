package prep;

public class Rectangle implements Comparable<Rectangle>{
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	
	
	@Override
	public String toString() {
		return "[" + length + " x " + width + "]";
		
	}

	@Override
	public int compareTo(Rectangle other) {
		//a rectangle is bigger if length is bigger
		if (Double.compare(this.length, other.length) != 0) {
			return Double.compare(this.length, other.length);
		}
		else {
			return Double.compare(this.width, other.width);
		}
	}
	
	

}
