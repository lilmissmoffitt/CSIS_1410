package m02;

import java.util.ArrayList;
import java.util.List;

/**
 * Is the TestClient for Domicile, House, and Cave. Returns the different types
 * of domiciles and the attributes specific to them.
 * 
 * @author melissamoffitt
 *
 */
public class Module02 {
	/**
	 * Contains print statements and an ArrayList containing the different types of
	 * domiciles and their attributes
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		House h = new House(3, "Gerhy");
		System.out.println(h);
		Cave c = new Cave(2, false);
		System.out.println(c);
		Cave c2 = new Cave(3, true);
		System.out.println(c2);
		House h2 = new House(4, "Foster");
		System.out.println(h2);

		System.out.println("\nArrayList:");
		List<Domicile> domiciles = new ArrayList<>();
		domiciles.add(h);
		domiciles.add(c);
		domiciles.add(c2);
		domiciles.add(h2);

		for (Domicile d : domiciles) {
			if (d instanceof House) {
				System.out.print("House: ");
				d.heat();
			}
			if (d instanceof Cave) {
				System.out.print("Cave: ");
				d.heat();
			}

		}

	}

}
