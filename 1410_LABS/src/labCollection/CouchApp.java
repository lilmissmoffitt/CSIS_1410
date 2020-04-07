package labCollection;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Returns the output for the classes in package labCollection. Prints the
 * couches in the collection and also performs different actions on the list.
 * Such as adding and removing couches.
 * 
 * @author melissamoffitt
 *
 */
public class CouchApp {
	public static Color[] colors;
	public static List<Couch> favorites;

	public static void main(String[] args) {
		colors = new Color[] { Color.BLACK, Color.BLUE, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY,
				Color.RED, Color.WHITE };

		List<Couch> couches = new ArrayList<>();
		for (int i = 0; i <= colors.length - 1; i++) {
			Couch a = new Couch(colors[i], Material.FABRIC);
			Couch b = new Couch(colors[i], Material.LEATHER);
			Couch c = new Couch(colors[i], Material.VINYL);

			couches.add(a);
			couches.add(b);
			couches.add(c);
		}

		favorites = new ArrayList<>();
		Couch fav1 = new Couch(Color.RED, Material.FABRIC);
		Couch fav2 = new Couch(Color.BLACK, Material.LEATHER);
		Couch fav3 = new Couch(Color.WHITE, Material.VINYL);
		favorites.add(fav1);
		favorites.add(fav2);
		favorites.add(fav3);

		printCouches(couches);

		// remove vinyl couches
		System.out.println("\nRemoving all vinyl couches...\n");
		couches.removeIf(el -> el.getMaterial() == Material.VINYL);

		printCouches(couches);

		// add all favorites
		System.out.println("\nAdding all the favorites to the list of couches...\n");
		couches.addAll(favorites);

		printCouches(couches);

		// remove duplicates
		Set<Couch> uniqueCouches = new HashSet<>(couches);
		System.out.println("\nAdding all the couches to a set...\n");

		printCouches(uniqueCouches);
	}

	private static void printCouches(Collection<Couch> couches) {
		couches.forEach(el -> System.out.print(el.toString() + "\n"));
		System.out.printf("Number of elements in list couches: %d%n", couches.size());
		if (couches.containsAll(favorites) == true) {
			System.out.println("All favorites are in the list.");
		} else {
			System.out.println("Not all favorites are in the list.");
		}

	}

}
