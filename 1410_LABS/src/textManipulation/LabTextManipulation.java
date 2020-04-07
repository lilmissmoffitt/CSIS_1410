
package textManipulation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Collects the user's favorite National Parks. It will then format and print
 * them to the console.
 * 
 * @author melissamoffitt
 *
 */

public class LabTextManipulation {
	/**
	 * Creates an ArrayList that stores the user's input of their Favorite National
	 * Parks
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> parks = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		// The initial prompt for the user's favorite National Park
		String parkName = "";
		System.out.print("Please enter your favorite National Park or DONE to stop: ");
		parkName = input.nextLine();
		parks.add(parkName);
		
		// Will continue to prompt the user for input until "done" is selected
		while (!parkName.equalsIgnoreCase("done")) {
			System.out.print("Please enter your favorite National Park or DONE to stop: ");
			parkName = input.nextLine();
			parks.add(parkName);
		}
		System.out.println();

		// Creates StringBuilder that will correct the formatting
		StringBuilder sb = new StringBuilder();

		sb.append(parks.get(0));
		for (int i = 1; i < parks.size() - 1; i++) {
			sb.append(" | ");
			sb.append(parks.get(i));
		}
		// Prints the final list of National Parks
		System.out.println("Favorite National Parks: " + updateSpelling(sb.toString()));
	}
	/**
	 * Corrects capitalization so that each word begins with a capitalized letter
	 * and the rest will be lower case no matter the user's input
	 * 
	 * @param text
	 * @return
	 */
	private static String updateSpelling(String text) {
		StringBuilder s = new StringBuilder();
		char ch = ' ';
		for (int i = 0; i < text.length(); i++) {
			// checks to see if previous char is space, if so will capitalize
			if (ch == ' ' && text.charAt(i) != ' ') {
				s.append(Character.toUpperCase(text.charAt(i)));
			}
			// checks to see if prev char is a letter, if so will lowercase
			else if (Character.isLetter(text.charAt(i))) {
				s.append(Character.toLowerCase(text.charAt(i)));
			}
			// everything else
			else {
				s.append(text.charAt(i));
			}
			// holds last character
			ch = text.charAt(i);
		}
		// Return the string with trimming
		return s.toString().trim();
	}
}
