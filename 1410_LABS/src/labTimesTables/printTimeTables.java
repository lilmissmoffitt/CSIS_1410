package labTimesTables;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Formats and writes to file Time Tables
 * all time tables 1-10.
 * @author melissamoffitt
 *
 */
public class printTimeTables {
	
	public static void main(String[] args) {
		
		String file = "src/labTimesTables/TimeTables.txt";
		printTimeTables(file);
	}
	
	/**
	 * Writes to the file TimeTables
	 * @param file
	 */
	private static void printTimeTables(String file) {
		
		try {
		
			PrintWriter writer = new PrintWriter(file);
			
			for(int i = 1; i < 10; i++) {
				for(int j = 1; j<= 10; j++) {
					writer.printf("%2d * %-2d = %-2d", j, i, i * j);
					writer.printf("%10d * %d = %d\n", j, i + 1, j * (i + 1));
				}
				i+=1;
				writer.println("");
			}
			writer.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
