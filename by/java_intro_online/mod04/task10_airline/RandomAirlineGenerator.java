package by.java_intro_online.mod04.task10_airline;

import java.util.ArrayList; 
import java.util.Calendar;

public class RandomAirlineGenerator {

	public RandomAirlineGenerator() {
	}

	public ArrayList<Airline> generateGroupOfAirlines(int numberOfAirlines) {

		ArrayList<Airline> newGroupOfAirlines = new ArrayList<Airline>();
		Airline newAirline;

		String[] destinations = { "Moscow", "Kiev", "Warsaw", "Vilnius", "Riga" };
		String[] aircraftTypes = { "A100", "B200", "C300" };
		Calendar randomTime;
		String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		for (int i = 0; i < numberOfAirlines; i++) {

			newAirline = new Airline();

			newAirline.setDestination(destinations[(int) (Math.random() * destinations.length)]);
			newAirline.setFlightNumber((int) (Math.random() * 1000));
			newAirline.setAircraftType(aircraftTypes[(int) (Math.random() * aircraftTypes.length)]);
			randomTime = Calendar.getInstance();
			randomTime.set(Calendar.HOUR_OF_DAY, (int) (Math.random() * 23));
			randomTime.set(Calendar.MINUTE, (int) (Math.random() * 59));
			newAirline.setDepartureTime(randomTime);
			newAirline.setDayOfWeek(daysOfWeek[(int) (Math.random() * daysOfWeek.length)]);

			newGroupOfAirlines.add(newAirline);
		}
		return newGroupOfAirlines;
	}

}
