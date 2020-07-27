package by.java_intro_online.mod04.task04_train;

/* Create a Train class containing the fields: destination, number and departure time.
 * Create an array containing 5 Train objects, and create methods of:
 * - sorting the array by train numbers;
 * - display information about the train whose number is entered by user;
 * - sorting the array of trains by destination where trains with the same destinations should be ordered by departure time. 
 */

import java.util.ArrayList;
import java.util.Calendar;

public class Logic {

	public ArrayList<Train> sortByDepartureTime(ArrayList<Train> trains) {

		for (int i = 1; i < trains.size(); i++) {
			if (isSameDestination(trains, i - 1, i)) {
				if (isWrongDepartureTimeSequence(trains, i - 1, i)) {
					swapTrains(trains, i - 1, i);
					i = 0;
				}
			}
		}
		return trains;
	}

	private boolean isSameDestination(ArrayList<Train> trains, int train1, int train2) {

		char[] charDestination1 = trains.get(train1).getDestination().toCharArray();
		char[] charDestination2 = trains.get(train2).getDestination().toCharArray();

		if (charDestination1.length != charDestination2.length) {
			return false;
		} else {
			for (int i = 0; i < charDestination1.length; i++) {
				if (charDestination1[i] != charDestination2[i]) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean isWrongDepartureTimeSequence(ArrayList<Train> trains, int train1, int train2) {

		if (trains.get(train1).getDepartureTime().get(Calendar.HOUR_OF_DAY) > trains.get(train2)
				.getDepartureTime().get(Calendar.HOUR_OF_DAY)
				|| trains.get(train1).getDepartureTime().get(Calendar.HOUR_OF_DAY) == trains.get(train2)
						.getDepartureTime().get(Calendar.HOUR_OF_DAY)
						&& trains.get(train1).getDepartureTime().get(Calendar.MINUTE) > trains.get(train2)
								.getDepartureTime().get(Calendar.MINUTE)) {
			return true;
		}
		return false;
	}

	private void swapTrains(ArrayList<Train> trains, int train1, int train2) {

		Train tempTrain = trains.get(train1);
		trains.set(train1, trains.get(train2));
		trains.set(train2, tempTrain);
	}

	public ArrayList<Train> sortByDestination(ArrayList<Train> trains) {

		ArrayList<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);

		for (int i = 1; i < sortTrains.size(); i++) {
			for (int j = i; j > 0 && isWrongDestinationSequence(sortTrains, j - 1, j); j--) {
				swapTrains(sortTrains, j - 1, j);
			}
		}
		return sortTrains;
	}

	private boolean isWrongDestinationSequence(ArrayList<Train> trains, int train1, int train2) {

		char[] destination1 = trains.get(train1).getDestination().toCharArray();
		char[] destination2 = trains.get(train2).getDestination().toCharArray();
		int k = 0;
		while (k < Math.min(destination1.length, destination2.length)) {
			if (destination1[k] > destination2[k]) {
				return true;
			}
			if (destination1[k] == destination2[k]) {
				k++;
			} else {
				return false;
			}
		}
		return false;
	}

	public ArrayList<Train> sortByNumber(ArrayList<Train> trains) {

		ArrayList<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);

		int begin = 0;
		int end = sortTrains.size() - 1;

		quickSortByNumber(sortTrains, begin, end);

		return sortTrains;
	}

	private ArrayList<Train> quickSortByNumber(ArrayList<Train> trains, int begin, int end) {

		if (begin < end) {
			int partitionIndex = partition(trains, begin, end);

			quickSortByNumber(trains, begin, partitionIndex - 1);
			quickSortByNumber(trains, partitionIndex + 1, end);
		}
		return trains;
	}

	private int partition(ArrayList<Train> trains, int begin, int end) {
		int pivot = trains.get(end).getNumber();
		int i = (begin - 1);

		for (int j = begin; j < end; j++) {
			if (trains.get(j).getNumber() < pivot) {
				i++;
				swapTrains(trains, i, j);
			}
		}
		swapTrains(trains, i + 1, end);
		return i + 1;
	}

	public ArrayList<Train> generateTrains(int numberOfTrainsAtStation) {

		ArrayList<Train> generatedGroupOfTrains = new ArrayList<Train>();
		Train generatedTrain;

		String[] city = { "Moscow", "Kiev", "Warsaw", "Vilnius", "Riga" };
		String randomCity;
		int randomNumber;
		Calendar randomTime;

		for (int i = 0; i < numberOfTrainsAtStation; i++) {

			randomCity = city[((int) (Math.random() * city.length))];
			randomNumber = (int) (Math.random() * 1000 - 1);
			randomTime = Calendar.getInstance();
			randomTime.set(Calendar.HOUR_OF_DAY, (int) (Math.random() * 23));
			randomTime.set(Calendar.MINUTE, (int) (Math.random() * 59));

			generatedTrain = new Train(randomCity, randomNumber, randomTime);
			generatedGroupOfTrains.add(generatedTrain);
		}
		return generatedGroupOfTrains;
	}

}
