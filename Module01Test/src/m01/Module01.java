package m01;

/**
 * Contains two methods: transform1 and transform2
 * that will manipulate input Strings.
 * These methods are tested in Module01Test JUnit testing.
 * 
 * Also, contains a main method for testing code.
 * 
 * @author Melissa Moffitt
 *
 */

public class Module01 {

	/**
	 * Main method used to test code.
	 * Remains empty for the purpose of this test.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}
	/**
	 * Changes String to UpperCase, separates each letter
	 * with an underscore, and changes the abbreviation
	 * "CS-" to return "CSIS-" instead.
	 * 
	 * 
	 * @param str  Input String value
	 * @param result  Variable to manipulate the String
	 * @param sb   variable for StringBuilder 
	 * @return
	 */
	public static String transform1(String str) {
		//Create object for resulting string
		if(str == "") {
			return str;
		}
		String result = "";

		//Capitalize each letter in the provided String
		result = str.toUpperCase();

		//Change "CS-" to "CSIS-"
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i,i+3).matches("CS-")) {
				//Replace with CSIS-
				result = result.replace("CS-", "CSIS-");
			}
		}
		//All characters of the String are separated by an underscore
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < result.length(); i++) {
			sb.append("_");
			sb.append(result.charAt(i));
		}
		sb.deleteCharAt(0);
		result = sb.toString();

		return result;
	}
	/**
	 * Checks the length of str1 and str2
	 * and returns the longer string if 
	 * it ends in the other (ignoring capitalization).
	 * Otherwise, it will return the shorter string.
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static String transform2(String str1, String str2) {
		String s1 = "";
		String s2 = "";

		s1 = str1;
		s2 = str2;

		if (s1 == "") {
			return s2;
		}
		if (s2 == "") {
			return s1;
		}

		StringBuilder sb2 = new StringBuilder(s1);

		//Check if str1 and str2 are of equal length
		if(s1.length() == s2.length()) {
			//Return str1 in reverse
			sb2.reverse();
			s1 = sb2.toString();
			return s1;
		}
		//Checks if Str1 ends in Str2
		if (s1.length() > s2.length()) {
			s1 = s1.substring(s1.length() - s2.length());
			if(s1.equalsIgnoreCase(s2)) {
				return str1;
			}
			else return str2;
		}
		return str2;
	}
}
