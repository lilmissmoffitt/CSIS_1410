package wrapperClass;

import java.util.Arrays;
import java.util.Random;

/**
 * This class contains 6 methods that perform different functions pertaining to
 * objects in the Wrappers Class.
 * 
 * @author melissamoffitt
 * 
 */
public class DemoWrapperClass {
	public static Random rand = new Random();

	/**
	 * Returns the 6 number types and their max and min values
	 * 
	 * @return
	 */
	public static String minMax() {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Byte   : [" + Byte.MIN_VALUE + " , " + Byte.MAX_VALUE + "]\n")
				.append("Short  : [" + Short.MIN_VALUE + " , " + Short.MAX_VALUE + "]\n")
				.append("Integer: [" + Integer.MIN_VALUE + " , " + Integer.MAX_VALUE + "]\n")
				.append("Long   : [" + Long.MIN_VALUE + " , " + Long.MAX_VALUE + "]\n")
				.append("Float  : [" + Float.MIN_VALUE + " , " + Float.MAX_VALUE + "]\n")
				.append("Double : [" + Double.MIN_VALUE + " , " + Double.MAX_VALUE + "]");
		return sb1.toString();
	}

	/**
	 * Returns the number provided as base 10, 16, 8, and 2
	 * 
	 * @param number
	 * @return
	 */
	@SuppressWarnings("static-access")
	public static String numberRepresentations(int number) {
		StringBuilder sb2 = new StringBuilder();
		return sb2.toString().format("%-7s %-7s %-6s %s", Integer.toString(number), Integer.toHexString(number),
				Integer.toOctalString(number), Integer.toBinaryString(number));
	}

	/**
	 * returns the provided character plus additional information depending on the
	 * character that was passed to the method
	 * 
	 * @param ch
	 * @return
	 */
	public static String charProperties(char ch) {
		StringBuilder sb3 = new StringBuilder();
		StringBuilder sb4 = new StringBuilder();
		StringBuilder sb5 = new StringBuilder();
		StringBuilder sb6 = new StringBuilder();
		StringBuilder sb7 = new StringBuilder();

		if (Character.isUpperCase(ch) == true) {
			sb3.append(ch).append(" uppercase letter");
			return sb3.toString();
		}
		if (Character.isLowerCase(ch) == true) {
			sb4.append(ch).append(" lowercase letter");
			return sb4.toString();
		}
		if (Character.isWhitespace(ch) == true) {
			sb5.append(ch).append(" white space");
			return sb5.toString();
		}
		if (Character.isDigit(ch) == true) {
			sb6.append(ch).append(" number");
			return sb6.toString();
		}
		sb7.append(ch);
		return sb7.toString();
	}

	/**
	 * calculates and returns the sum of all the array elements
	 * 
	 * @param str
	 * @return
	 */
	public static double parseSum(String[] str) {
		double sum = 0;

		if (str == null) {
			return 0;
		}
		for (String s : str) {
			double sDouble = Double.parseDouble(s);
			sum += sDouble;
		}

		return sum;
	}

	/**
	 * Generates a random 3 digit number
	 * 
	 * @return
	 */
	public static int getRandomThreeDigitNumber() {
		int randNum = rand.nextInt(900) + 100;
		return randNum;
	}

	/**
	 * Generates a random character of the alphabet. This can be upper case or lower
	 * case.
	 * 
	 * @return
	 */
	public static char getRandomLetter() {

		char lc = (char) (rand.nextInt(26) + 'a');
		char uc = (char) (rand.nextInt(26) + 'A');

		if (rand.nextInt() % 2 == 0) {
			return lc;
		} else
			return uc;
	}

	/**
	 * Demonstrates the functionality provided in class DemoWrapperClass.
	 *
	 */
	public static void main(String[] args) {

		// Method minMax:
		System.out.println(minMax());
		System.out.println();

		// Method numberRepresentations:
		int[] numbers = { 9, 17, getRandomThreeDigitNumber(), 9876, 12345 };

		System.out.printf("%-7s %-7s %-6s %s%n", "Base 10", "Base 16", "Base 8", "Base 2");
		System.out.printf("%-7s %-7s %-6s %s%n", "-------", "-------", "------", "------");
		for (int n : numbers) {
			System.out.println(numberRepresentations(n));
		}
		System.out.println();

		// Method charProperties:
		char[] characters = { '8', ' ', '#', 'a', 'M', getRandomLetter() };

		for (char c : characters) {
			System.out.println(charProperties(c));
		}
		System.out.println();

		// Method parse:
		String[] numberArray = { "1.1", "2.5", "3.14", "40.04", "5.325", "63.5" };
  
		String[] wholeNumbers = new String[10];
		for (int i = 0; i < wholeNumbers.length; i++) {
			wholeNumbers[i] = "" + (rand.nextInt(90) + 10);
		}

		System.out.println(Arrays.deepToString(numberArray) + " .. sum = " + parseSum(numberArray));

	}

}
