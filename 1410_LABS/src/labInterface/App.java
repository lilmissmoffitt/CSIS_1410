package labInterface;

import java.util.ArrayList;

/**
 * Creates a plane, hangglider, and bird object. Prints the object's toString
 * method and the launch/land methods.
 * 
 * @author Margarethe Posch + melissa moffitt
 *
 */
public class App {

	/**
	 * Creates and initializes the objects myPlane, myHangglider, and myBird.
	 * Creates an ArrayList of the objects and prints their toString, launch and
	 * land methods.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Plane myPlane = new Plane(4, "Boing 747");
		System.out.printf("myPlane: %s%n", myPlane);

		Hangglider myHangglider = new Hangglider(true);
		System.out.printf("myHangglider: %s%n", myHangglider);

		Bird myBird = new Bird("Swallow");
		System.out.printf("myBird: %s%n", myBird);

		ArrayList<Flyable> flyingThings = new ArrayList<Flyable>();
		flyingThings.add(myPlane);
		flyingThings.add(myHangglider);
		flyingThings.add(myBird);

		System.out.println();
		for (Flyable f : flyingThings) {
			System.out.println(f);
			f.launch();
			f.land();
			System.out.println();
		}
	}

}
