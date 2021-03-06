package nuisance;

/**
 * Contains the fields name and age. This class also contains the toString
 * method to format the output to be Name(age).
 * 
 * @author melissamoffitt
 *
 */
public class Person {
	private String name;
	private int age;

	/**
	 * Initializes the fields name and age. Has parameters set to where it will only
	 * return the age if it is between 1-150 otherwise it will throw an error.
	 * 
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		this.name = name;
		if (age < 1 || age > 150) {

			throw new IllegalArgumentException("Age must be between 1 - 150");
		} else {
			this.age = age;
		}
	}

	/**
	 * Returns the name of the person
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the age of the person
	 * 
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Returns the formatted string of the Name(age)
	 */
	public String toString() {
		return getName() + "(" + getAge() + ")";
	}

	/**
	 * Checks to see if the new object matches an existing object. Will return false
	 * if they do not match and true if they do.
	 * 
	 * @param p
	 * @return
	 */
	public boolean equals(Person p) {

		boolean isEqual = false;

		if (p.getName().equals(getName()) && p.getAge() == getAge()) {
			isEqual = true;
		} else {
			isEqual = false;
		}

		return isEqual;
	}
}
