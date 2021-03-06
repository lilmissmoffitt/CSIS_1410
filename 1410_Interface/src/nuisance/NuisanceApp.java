package nuisance;

import java.util.ArrayList;
import java.util.List;

/**
 * Returns the output for the classes in package nuisance. Prints the friends,
 * insects, and nuisances objects and additional methods from their classes.
 * 
 * @author melissamoffitt
 *
 */
public class NuisanceApp {
	/**
	 * Returns the sample output. Contains the friends, insects, and nuisances
	 * objects and actions.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> colors = new ArrayList<>();

		// Creating friends
		Friend friend1 = new Friend("Juan", 27, Hobby.MUSIC);
		Friend friend2 = new Friend("Kate", 27, Hobby.SPORTS);
		Friend friend3 = new Friend("Alex", 21, Hobby.MUSIC);

		// Adding friends to the array
		Friend[] friends = { friend1, friend2, friend3 };

		// Printing friends
		System.out.println(friends.length + " Friends:");
		for (int i = 1; i <= friends.length; i++) {
			System.out.printf("friend%d: ", i);
			System.out.println(friends[i - 1]);
		}

		// Comparing friends
		boolean f1vf2 = friend1.equals(friend2);
		boolean f1vf3 = friend1.equals(friend3);

		
		System.out.println();
		System.out.println("friend1 equals friend2: " + f1vf2);
		System.out.println("friend1 equals friend3: " + f1vf3);

		Friend friend4 = new Friend("Kate", 27, Hobby.SPORTS);
		boolean f2vf4 = friend2.equals(friend4);
		System.out.println("friend2 equals new friend: " + f2vf4);

		System.out.println();
		Telemarketer tm = new Telemarketer("Fritz", 25);
		System.out.println("telemarketer: " + tm);

		// Creating Insects
		Mosquito m = new Mosquito("Aedes vexans");
		PeskyMosquito pm = new PeskyMosquito("Anopheles walkeri");

		// Add colors to the list
		colors.add("yellow");
		colors.add("black");
		colors.add("blue");
		Butterfly b = new Butterfly("Swallowtail", colors);

		Butterfly b2 = new Butterfly(b);

		// Array of insects
		Insect[] insects = { m, pm, b, b2 };

		System.out.println();
		System.out.println(insects.length + " Insects:");

		for (Insect i : insects) {
			System.out.println(i);
		}

		Nuisance[] nuisances = { tm, m, pm };

		System.out.println();
		System.out.println(nuisances.length + " Nuisances:");

		for (Nuisance n : nuisances) {
			if (n instanceof Mosquito) {
				System.out.println(((Mosquito) n).buzz());
			}
			if (n instanceof PeskyMosquito) {
				System.out.println(((PeskyMosquito) n).bite());
			}
			System.out.println(n.annoy());
			System.out.println();
		}

	}

}
