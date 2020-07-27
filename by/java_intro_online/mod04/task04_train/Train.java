package by.java_intro_online.mod04.task04_train;

/* Create a Train class containing the fields: destination, number and departure time.
 * Create an array containing 5 Train objects, and create methods of:
 * - sorting the array by train numbers;
 * - display information about the train whose number is entered by user;
 * - sorting the array of trains by destination where trains with the same destinations should be ordered by departure time. 
 */

import java.util.Calendar;

public class Train {

	private String destination;
	private int number;
	private Calendar departureTime;

	public Train() {
	}

	public Train(String destination, int number, Calendar departureTime) {
		this.destination = destination;
		this.number = number;
		this.departureTime = departureTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Calendar getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Calendar departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public String toString() {
		return "Train [ destination " + destination + ", number " + number + ", departure time "
				+ departureTime.get(Calendar.HOUR_OF_DAY) + "." + departureTime.get(Calendar.MINUTE) + " ]";
	}

}
