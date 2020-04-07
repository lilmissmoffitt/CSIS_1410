package docComments;

/**
 * Prints summary of cars and trip details. Includes total fuel consumption for each trip.
 * 
 * @author melissamoffitt
 *
 */
public class TravelApp {

	public static void main(String[] args) {
		Car m4 = new Car("BMW","M4",25);
		Car civic = new Car("Honda","Civic",42);
		System.out.println("Cars:");
		
		System.out.println(m4.getMake()+" "+m4.getModel()+" "+m4.getMpg()+" mph");
		System.out.println(civic.getMake()+" "+civic.getModel()+" "+civic.getMpg()+" mph");
		
		System.out.println("\nCalifornia Trip: ");
		TripPlanner californiaTrip = new TripPlanner("SF", "LA", 382, m4);
		System.out.println(californiaTrip.toString());
		System.out.printf("fuel consumption: %.1f gallons%n",californiaTrip.fuelConsumption());
		
		System.out.println("\nFlorida Trip: ");
		TripPlanner floridaTrip = new TripPlanner("Tampa", "Miami", 280, civic);
		System.out.println(floridaTrip.toString());
		System.out.printf("fuel consumption: %.1f gallons", floridaTrip.fuelConsumption());
	}

}
