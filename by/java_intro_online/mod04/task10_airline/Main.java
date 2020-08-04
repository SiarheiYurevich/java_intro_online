package by.java_intro_online.mod04.task10_airline;

import java.util.Calendar;

/* Create a class Airline whose specification is given below.
 * Write constructors, set- and get- methods, and toString method.
 * Write a class that aggregates an array of type Airline with appropriate constructors and methods.
 * Specify data selection criteria and output this data to the console.
 * Airline: destination, flight number, aircraft type, departure time, days of the week.
 * Find and output:
 * a) list of flights for a given destination;
 * b) list of flights for a given day of week;
 * c) list of flights for a given day of week, the departure time of which is later than the specified one.  
 */

public class Main {
	
	public static void main(String[] args) {
		
		AirlineAlliance alliance = new AirlineAlliance();
		RandomAirlineGenerator generator = new RandomAirlineGenerator();
		Console console = new Console();
		Logic logic = new Logic();
		
		int numberOfAirlines = 20;
		alliance.addGroupOfAirlines(generator.generateGroupOfAirlines(numberOfAirlines));
		
		System.out.println("Generated airlines:");
		console.outputAirlines(alliance.getAirlines());
		
		System.out.println("Airlines with specified destination (Moscow):");
		console.outputAirlines(logic.getAirlinesByDestination(alliance.getAirlines(), "Moscow"));
		
		System.out.println("Airlines with specified day of week (Monday):");
		console.outputAirlines(logic.getAirlinesByDayOfWeek(alliance.getAirlines(), "Monday"));
		
		Calendar userTime;
		userTime = Calendar.getInstance();
		userTime.set(Calendar.HOUR_OF_DAY, 12);
		userTime.set(Calendar.MINUTE, 30);
		
		System.out.println("Airlines with specified day of week (Monday) and departure time later the user time (12.30):");
		console.outputAirlines(logic.getAirlinesByDayOfWeek(logic.getAirlinesWithOkDepartureTime(alliance.getAirlines(), userTime), "Monday"));
	}

}