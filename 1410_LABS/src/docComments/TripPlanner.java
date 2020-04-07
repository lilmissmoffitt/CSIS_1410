package docComments;

/**
 * Includes trip details such as: departure, arrival, distance, and car type.
 * 
 * @author melissamoffitt
 *
 */


public class TripPlanner {

	private String departure;
	private String arrival;
	private int distance;
	private Car car;
	
	
	/**
	 * Constructor initializes fields for trip details
	 * 
	 * @param departure
	 * @param arrival
	 * @param distance distance traveled
	 * @param car car used for the trip
	 */
	public TripPlanner(String departure, String arrival, int distance, Car car) {
		this.departure = departure;
		this.arrival = arrival;
		this.distance = distance;
		this.car = car;
	}
	/**
	 * Calculates the gallons used
	 * 
	 * @return  returns fuel used based on distance/mpg of the car
	 */
	
	public double fuelConsumption() {
		return (double)this.distance/car.getMpg();
	}
	
	/**
	 * Converts TripPlanner into an array view
	 */
	@Override
	public String toString() {
		return "TripPlanner [departure=" + this.departure + ", arrival=" + this.arrival + ", distance=" + this.distance + ", car="
				+ car.getModel()+ "]";
	}

	
	
}
