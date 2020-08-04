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

import java.util.Calendar;

public class Airline {

	private String destination;
	private int flightNumber;
	private String aircraftType;
	private Calendar departureTime;
	private String dayOfWeek;

	public Airline() {
	}

	public Airline(String destination, int flightNumber, String aircraftType, Calendar departureTime,
			String dayOfWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.dayOfWeek = dayOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public Calendar getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Calendar departureTime) {
		this.departureTime = departureTime;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public String toString() {
		return "Airline [ destimation " + destination + ", flight number " + flightNumber + ", aircraft type "
				+ aircraftType + ", departure time " + departureTime.get(Calendar.HOUR_OF_DAY) + "."
				+ departureTime.get(Calendar.MINUTE) + ", day of week " + dayOfWeek + " ]";
	}
}
