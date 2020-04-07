package labPolymorphism;

/**
 * Creates SledDog as a subclass of the superclass Dog.
 * Contains the method pullSled.
 * 
 * @author Margarethe Posch
 *
 */

public class SledDog extends Dog
{
	/**
	 * Initializes the object SledDog for superclass Dog
	 * 
	 * @param b Breed of dog
	 */
    public SledDog(String b)
    {
        super(b);
    }
    /**
     * Prints message for the SledDog
     */
    public void pullSled()
    {
        System.out.println("pulling the sled");
    }
}
