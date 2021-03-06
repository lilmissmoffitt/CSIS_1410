package nuisance;

/**
 * Inherits class Person. Contains the methods chill and play. Creates the
 * friend object and returns the corresponding hobby and friends when provided a
 * new Friend object.
 * 
 * @author melissamoffitt
 *
 */
public class Friend extends Person {
	private Hobby hobby;
	Friend[] friends;

	/** 
	 * Initializes name, age, and hobby
	 * 
	 * @param name
	 * @param age
	 * @param hobby
	 */
	public Friend(String name, int age, Hobby hobby) {
		super(name, age);
		this.hobby = hobby;
	}

	/**
	 * Returns the out put of the name person and the action "is chilling"
	 * 
	 * @return
	 */
	public String chill() {
		return getName() + " is chilling";
	}

	/**
	 * Returns the proper formatted string depending on the number of friends
	 * 
	 * @param friends
	 * @return
	 */
	public String play(Friend[] friends) {

		switch (friends.length) {

		case 1:
			return "playing " + hobby + " with " + friends[0].getName();
		case 2:
			return "playing " + hobby + " with " + friends[0].getName() + " and " + friends[1].getName();
		case 3:
			return "playing " + hobby + " with " + friends[0].getName() + ", " + friends[1].getName() + ", and "
					+ friends[2].getName();
		case 4:
			return "playing " + hobby + " with " + friends[0].getName() + ", " + friends[1].getName() + ", "
					+ friends[2].getName() + ", and " + friends[3].getName();
		default:
			return "playing " + hobby;
		}
	}

	/**
	 * Returns the formatted string of a friends name, age, and hobby
	 */
	public String toString() {
		return getName() + "(" + getAge() + ") " + hobby;
	}

}
