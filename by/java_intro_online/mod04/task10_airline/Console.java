package by.java_intro_online.mod04.task10_airline;

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

import java.util.ArrayList;

public class Console {

	public Console() {
	}

	public void outputAirlines(ArrayList<Airline> groupOfAirlines) {

		for (int i = 0; i < groupOfAirlines.size(); i++) {
			System.out.println(groupOfAirlines.get(i));
		}
	}

}