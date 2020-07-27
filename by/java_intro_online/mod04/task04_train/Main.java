package by.java_intro_online.mod04.task04_train;

/* Create a Train class containing the fields: destination, number and departure time.
 * Create an array containing 5 Train objects, and create methods of:
 * - sorting the array by train numbers;
 * - display information about the train whose number is entered by user;
 * - sorting the array of trains by destination where trains with the same destinations should be ordered by departure time. 
 */

//import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		
		Station station = new Station();
		Logic logic = new Logic();
		Schedule schedule = new Schedule();
		
		int numberOfTrainsAtStation = 5;
		
		System.out.println("Generating and output of train list:");
		station.addGroupOfTrains(logic.generateTrains(numberOfTrainsAtStation));		
		schedule.getStationSchedule(station.getTrains());
		
		System.out.println("Trains sorted by numbers:");
		schedule.getStationSchedule(logic.sortByNumber(station.getTrains()));
		
		System.out.println("Trains sorted by destination and departure time:");
		schedule.getStationSchedule(logic.sortByDepartureTime(logic.sortByDestination(station.getTrains())));
		
		schedule.getTrainInfoAtNumber(station.getTrains(), schedule.enterNumber());	
	}

}
