package labPolymorphism;

/**
 * Creates superclass Dog and initializes the
 * variable breed. Also includes methods: communicate, move,
 * and getBreed.
 * 
 * @author Margarethe Posch
 *
 */

public class Dog
{
    private final String breed;
    
    /**
     * Initializes the object Dog
     * @param b breed of dog
     */
    public Dog(String b)
    {
        breed = b;
    }
    /**
     * Prints message for communicating
     */
    public void communicate()
    {
        System.out.println("bark bark");
    }
    /**
     * Prints message for moving
     */
    public void move()
    {
        System.out.println("run");
    }
    /**
     * Returns the breed of the object
     * @return
     */
    public String getBreed()
    {
        return breed;
    }
    /**
     * CSIS + Melissa Moffitt
     * Returns name of the class : Breed
     */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + breed;
	}
	
    
}
