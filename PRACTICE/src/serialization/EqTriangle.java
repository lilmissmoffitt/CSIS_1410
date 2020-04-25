package serialization;

import java.io.Serializable;

public class EqTriangle implements Serializable {
	
	/**
	 * version 1.0
	 */
	private static final long serialVersionUID = -8750493467170833044L;
	private int side;
	
	public EqTriangle(int side) {
		this.side = side;
	}
	
	public int getSide() {
		return side;
	}

	@Override
	public String toString() {
		return "/" + side + "\\";
	}
	
}
