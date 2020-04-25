package labFileInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Reads in data records from the csv file and prints the lakes.
 * 
 * @author Melissa Moffitt
 *
 */
public class LakeApp {

	public static void main(String[] args) {

		List<Lake> lakes = new ArrayList<Lake>();

		try (Scanner reader = new Scanner(LakeApp.class.getResourceAsStream("Lakes.csv"))) {

			while (reader.hasNextLine()) {
				Lake newLake = getLake(reader.nextLine());

				if (newLake != null) {

					lakes.add(newLake);

				}
			}
		}
		lakes.forEach(el -> System.out.println(el.toString()));

	}

	/**
	 * Creates a Lake object based on the data record passed as an argument. The
	 * data record is expected to be of the following format: <br/>
	 * {name of the lake},{depth},{has marina}<br/>
	 * <p>
	 * If the argument <code>line</code> doesn't match the expected format and the
	 * instance of Lake cannot be created, then the string "Error: " followed by the
	 * line should be printed to the standard error stream (<code>System.err</code>)
	 * and the method should return null.
	 * 
	 * @param line a line from a csv file that includes data about a lake
	 * @return Lake object corresponding to the argument <code>line</code> or null
	 *         if <code>line</code> didn't match the expected format.
	 */
	private static Lake getLake(String nextLine) {
		String[] tokens = nextLine.split(",");
		Lake newLake = null;
		try {
			String name = tokens[0];
			int depth = Integer.parseInt(tokens[1]);
			boolean hasMarina = Boolean.parseBoolean(tokens[2]);
			newLake = new Lake(name, depth, hasMarina);
		} catch (NumberFormatException | IndexOutOfBoundsException ex) {
			System.err.println("Error: " + nextLine);
		}
		return newLake;

	}
}
