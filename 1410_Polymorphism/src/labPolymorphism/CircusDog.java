package labPolymorphism;

/**
 * Creates CircusDog as a subclass of the superclass Dog.
 * Overrides the method move.
 * @author Margarethe Posch
 *
 */

public class CircusDog extends Dog
{	
	/**
	 * Initializes the object CircusDog for superclass Dog
	 * @param b
	 */
    public CircusDog(String b)
    {
        super(b);
    }

    @Override
    public void move()
    {
        System.out.println("tightrope walking");
    }
}
