package by.java_intro_online.mod04.task04_train;

/* Create a Train class containing the fields: destination, number and departure time.
 * Create an array containing 5 Train objects, and create methods of:
 * - sorting the array by train numbers;
 * - display information about the train whose number is entered by user;
 * - sorting the array of trains by destination where trains with the same destinations should be ordered by departure time. 
 */

import java.util.ArrayList;

public class Station {

	private ArrayList<Train> trains;

	{
		trains = new ArrayList<Train>();
	}

	public Station() {
	}

	public Station(int numberOfTrainsAtStation) {
		trains = new ArrayList<Train>(numberOfTrainsAtStation);
	}

	public ArrayList<Train> getTrains() {
		return trains;
	}

	public void addTrain(Train train) {
		trains.add(train);
	}

	public void addGroupOfTrains(ArrayList<Train> generatedTrains) {
		trains.addAll(generatedTrains);
	}

	@Override
	public String toString() {
		return "Station [ trains = " + trains + " ]";
	}
}
