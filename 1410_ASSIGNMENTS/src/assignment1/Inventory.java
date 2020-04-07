package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Stores the Game Consoles to the ArrayList. 
 * Allows for users to select an action from a menu
 * to then show, add, find, delete, and count the devices.
 * 
 * 
 * @author Melissa Moffitt and Sarah Friedrichs
 *
 */

public class Inventory {

	static ArrayList<GameConsoles> list = new ArrayList<>();
/**
 * Contains hard-coded devices.
 * Also gives a menu prompt to allow for the user's selection
 * 
 * @param args
 */
	public static void main (String[] args) {
		int selection;
		Scanner input = new Scanner(System.in);

		list.add(new GameConsoles("Sony", "Playstation 4", 249.99));
		list.add(new GameConsoles("Microsoft", "Xbox 1", 189.99));
		list.add(new GameConsoles("Nintendo", "Switch", 269.99));
		list.add(new GameConsoles("Google", "Stadia", 129.99));

		do {
			menuPrompt();
			selection = input.nextInt();

			switch (selection) {
			
			 // Shows all consoles.
			 
			case 1:

				for (int i=0; i<list.size();i++) {
					GameConsoles console = list.get(i);
					System.out.println(console.toString());
				}
				break;

				
				 // Adds a console.
				 
			case 2:
				input.nextLine();
				System.out.print("Brand: ");
				String brand = input.nextLine();
				System.out.print("Name: ");
				String name = input.nextLine();
				System.out.print("Price: ");
				double price = input.nextDouble();
				list.add(new GameConsoles(brand, name, price));
				break;

				
				 // Finds a console.
				 
			case 3:
				System.out.println("Id: ");
				int toFind = input.nextInt();
				boolean found = false;
				for(GameConsoles console : list ) {
					if (console.getId() == toFind) {
						System.out.println();
						System.out.println(console.toString());
						found = true;
					}
				}

				if (!found) {
					System.out.println("ID not found.");
				}
				break;

				
				 // Deletes a console.
				 
			case 4:
				System.out.println("Enter the ID of the console to delete:");
				int toDelete = input.nextInt();
				int indexToDelete = -1;
		
				for(GameConsoles console : list ) {
					
				if(console.getId() == toDelete) {
						indexToDelete = list.indexOf(console);	
						System.out.println(console.toString() + " deleted.");
					}
				}
				if(indexToDelete == -1) {
					System.out.println("ID not found");
				}
				else {
				
				list.remove(indexToDelete);
				}
				break;

				
				 // Displays the number of consoles.
				 
			case 5:
				if (list.size() == 0) {
					System.out.println("There are no consoles in the list.");
				}
				if (list.size() == 1) {
					System.out.println("There is one console in the list.");
				}
				else {
					System.out.printf("There are %d consoles in the list.%n",list.size()); //PROBLEM AFTER ADDING
				}

				break;

				
				 // Exits.
				 
			case 6:
				System.out.println("Goodbye.");
				break;

				
				 //Invalid input.
				 
			default:
				//System.out.println(list);
				System.out.println("Invalid Input.");
				break;
			}
		}
		while (selection !=6);

	}


	
	 /**
	  * Provides a menu of options
	  * that the user can select from.
	  * These options will either show, add, find, delete or count
	  * the Game Consoles
	  */
	 
	private static void menuPrompt() {
		System.out.println();
		System.out.println("1. Show all Game Consoles");
		System.out.println("2. Add a Game Console");
		System.out.println("3. Find a Game Console");
		System.out.println("4. Delete a Game Console");
		System.out.println("5. Number of Game Consoles");
		System.out.println("6. Exit");
		System.out.println();
		System.out.print("Please enter your selection: ");
	}

}