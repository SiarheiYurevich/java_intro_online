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
import java.util.Calendar;

public class Logic {

	public Logic() {
	}

	public ArrayList<Airline> getAirlinesWithOkDepartureTime(ArrayList<Airline> alliance, Calendar time) {

		ArrayList<Airline> airlinesWithOkDepartureTime = new ArrayList<Airline>();

		for (int i = 0; i < alliance.size(); i++) {

			if (isOkDepartureTime(alliance.get(i).getDepartureTime(), time)) {
				airlinesWithOkDepartureTime.add(alliance.get(i));
			}
		}
		return airlinesWithOkDepartureTime;
	}

	private boolean isOkDepartureTime(Calendar timeOfAirline, Calendar time) {

		if (timeOfAirline.get(Calendar.HOUR_OF_DAY) > time.get(Calendar.HOUR_OF_DAY)
				|| timeOfAirline.get(Calendar.HOUR_OF_DAY) == time.get(Calendar.HOUR_OF_DAY)
						&& timeOfAirline.get(Calendar.MINUTE) > time.get(Calendar.MINUTE)) {
			return true;
		}
		return false;
	}

	public ArrayList<Airline> getAirlinesByDayOfWeek(ArrayList<Airline> alliance, String dayOfWeek) {

		ArrayList<Airline> airlinesByDayOfWeek = new ArrayList<Airline>();

		for (int i = 0; i < alliance.size(); i++) {

			if (isTheSameWord(dayOfWeek, alliance.get(i).getDayOfWeek())) {
				airlinesByDayOfWeek.add(alliance.get(i));
			}
		}
		return airlinesByDayOfWeek;
	}

	public ArrayList<Airline> getAirlinesByDestination(ArrayList<Airline> alliance, String destination) {

		ArrayList<Airline> airlinesByDestination = new ArrayList<Airline>();

		for (int i = 0; i < alliance.size(); i++) {

			if (isTheSameWord(destination, alliance.get(i).getDestination())) {
				airlinesByDestination.add(alliance.get(i));
			}
		}
		return airlinesByDestination;
	}

	private boolean isTheSameWord(String word1, String word2) {

		char[] wordInCharArr1 = word1.toCharArray();
		char[] wordInCharArr2 = word2.toCharArray();

		if (wordInCharArr1.length != wordInCharArr2.length) {
			return false;
		} else {
			for (int i = 0; i < wordInCharArr1.length; i++) {
				if (wordInCharArr1[i] != wordInCharArr2[i]) {
					return false;
				}
			}
		}
		return true;
	}
}
