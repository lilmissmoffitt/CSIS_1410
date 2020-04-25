package ioURL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Takes text from a URL and writes it to a file a page length at a time
 * @author melissamoffitt
 *
 */
public class DemoURLAccess {
	
	/**
	 * Displays text from a URL for the give page length. Will display another
	 * page length upon user command.
	 * @param args
	 */
	public static
	void main(String[] args) {
		int i = 0;
		int PAGE_LENGTH = 35;
		String urlString = "https://www.gutenberg.org/files/46768/46768-0.txt";

		try {
			URL url = new URL(urlString);
			try (InputStream stream = url.openStream();
					BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
					Scanner input = new Scanner(System.in);
					BufferedWriter writer = new BufferedWriter(new FileWriter("src/ioURL/fileOutput.txt"))) {

				String line;

				while (((line = reader.readLine()) != null)) {
					i++;
					if (i % PAGE_LENGTH == 0) {

						System.out.println("\n- - - Press Enter to continue - - -");
						input.nextLine();
						writer.flush();
					}

					writer.write(line + "\n");
					System.out.println(line);
				}
			}
		} catch (MalformedURLException e) {
			System.err.println("We encountered a problem regarding the following URL:\n" + urlString
					+ "\nEither no legal protocol could be found or the string could not be parsed.");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println(
					"Attempting to open a stream from the following URL:\n" + urlString + "\ncaused a problem.");
			e.printStackTrace();
		}
	}

}
