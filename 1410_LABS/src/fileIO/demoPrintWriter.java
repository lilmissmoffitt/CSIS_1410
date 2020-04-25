package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class demoPrintWriter {
	private static Random rand = new Random();
	
	public static void main(String[] args) {
		String fileRandomNumbers = "src/fileIO/TextFiles/fileRandomNumbers.txt";
		String fileDecimalOctalHex = "src/fileIO/TextFiles/fileDecimalOctalHex.txt";
		
		writeNumbersToFile(fileRandomNumbers);
		
		try(Scanner reader = new Scanner(new File(fileRandomNumbers));
				PrintWriter writer = new PrintWriter(fileDecimalOctalHex)) {
			while(reader.hasNextInt()) {
				int n = reader.nextInt();
				writer.printf("%d %3o %02X%n", n,n,n);
			}
				}catch (FileNotFoundException e) {
					e.printStackTrace();
				}
	
		
		System.out.println("done");
	}
	
	private static void writeNumbersToFile(String fileRandomNumbers) {
		try(PrintWriter writer = new PrintWriter(fileRandomNumbers)){
			for(int i = 0; i < 5; i++) {
				writer.println(rand.nextInt(90)+10);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
