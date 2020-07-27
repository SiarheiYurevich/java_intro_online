package by.java_intro_online.mod04.task04_train;

/* Create a Train class containing the fields: destination, number and departure time.
 * Create an array containing 5 Train objects, and create methods of:
 * - sorting the array by train numbers;
 * - display information about the train whose number is entered by user;
 * - sorting the array of trains by destination where trains with the same destinations should be ordered by departure time. 
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Schedule {

	public Schedule() {
	}

	public void getStationSchedule(ArrayList<Train> trains) {

		for (int i = 0; i < trains.size(); i++) {
			System.out.println(trains.get(i));
		}

	}

	public void getTrainInfoAtNumber(ArrayList<Train> trains, int numberOfTrain) {
		boolean wrongNumber = false;
		for (int i = 0; i < trains.size(); i++) {
			if (trains.get(i).getNumber() == numberOfTrain) {
				System.out.println("Infitmation about train number " + numberOfTrain + ": " + "destination "
						+ trains.get(i).getDestination() + ", departure time "
						+ trains.get(i).getDepartureTime().get(Calendar.HOUR_OF_DAY) + "."
						+ trains.get(i).getDepartureTime().get(Calendar.MINUTE));
				wrongNumber = true;
				break;
			}
		}
		if (!wrongNumber) {
			System.out.println("A train with this number is not on the schedule");
		}

	}

	public int enterNumber() {
		int number = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of train >> ");
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print("Enter number of train >>");
		}
		number = scan.nextInt();
		return number;
	}
}
