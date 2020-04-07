package labPolymorphism;

/**
 * Contains the main method and method actAsDog
 * which returns the methods from the Superclass Dog.
 * Allows objects of the unrelated classes to be processed
 * in a polymorphic way.
 * 
 * @author Margarethe Posch
 * CSIS + Melissa Moffitt
 *
 */
public class DogApp
{
	/**
	 * Creates new objects of Dog, SledDog, and CircusDog.
	 * Also, assigns the breed to the object.
	 * 
	 * CSIS + Melissa Moffitt
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{

		Dog myDog = new Dog("Greyhound");
		System.out.println(myDog.toString());
		actAsDog(myDog);

		SledDog mySledDog = new SledDog("Husky");
		System.out.println(mySledDog.toString());
		actAsDog(mySledDog);

		CircusDog myCircusDog = new CircusDog("Terrier");
		System.out.println(myCircusDog.toString());
		actAsDog(myCircusDog);

		System.out.println("Using an Array: \n");
		Dog dogs[] = {myDog, mySledDog, myCircusDog};


		for(Dog d : dogs) {
			System.out.println(d);

			if(d instanceof SledDog) {
				((SledDog) d).pullSled();
			}
			actAsDog(d);
		}

	}
	/**
	 * Returns the methods communicate and move
	 * for the types of Dog and prints them to the 
	 * console.
	 * 
	 * CSIS + Melissa Moffitt
	 * 
	 * @param d variable of type Dog
	 */
	private static void actAsDog(Dog d)
	{

		d.communicate();
		d.move();
		System.out.println();
	}
}
