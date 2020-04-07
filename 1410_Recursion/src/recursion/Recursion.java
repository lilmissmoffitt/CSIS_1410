package recursion;
/**
 * Tests 3 methods that will sum the digits of an integer,
 * count the smiles ":)" in a string, and space out and capitalize
 * a string.
 * 
 * @author Melissa Moffitt
 *
 */
public class Recursion {
	/**
	 * Returns the sum of the digits in a provided number.
	 * 
	 * @param n
	 * @return
	 */
	public static int sumOfDigits(int n) {
		if (n < 0) {
			return sumOfDigits(n * -1);
			
		}
		if (n == 0) {
			return 0;
		} 
		return n % 10 + sumOfDigits(n/10);
	}
	/**
	 * Returns the count of of colons followed by a closing 
	 * parenthesis.
	 * 
	 * @param letters
	 * @param index
	 * @return
	 */
	public static int countSmiles(char[] letters, int index) {
		if (letters == null) {
			 throw new NullPointerException("Cannot be null");
		}
		if (index < 0 | (index + 1) >= letters.length)  {
			return 0;
		}
		if(letters[index] == ':' && letters[index +1] == ')') {
			return 1 + countSmiles(letters, index +2);
		}
		return countSmiles(letters, index + 1); 
	}
	/**
	 * Changes all characters to upper case and
	 * separates them with a space.
	 * 
	 * @param str
	 * @return
	 */
	public static String toUpper(String str) {
		//Testing if String is null
		
		if (str == null) {
			return null;
		}
		//Testing if String is empty
		if (str.length() == 0) {
			return str;
	    }
		//Capitalize the String 
			str = str.toUpperCase();
			
		//Add spaces between each letter
		str = str.charAt(0) + " " + toUpper(str.substring(1));
		String s = str.trim();
		
		return s;
	
	}
}
