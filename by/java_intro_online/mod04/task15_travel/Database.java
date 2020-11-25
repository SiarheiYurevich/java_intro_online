package by.java_intro_online.mod04.task15_travel;

/* Form a set of proposals for the client on the choice of a tourist voucher
 * of various types (rest, excursions, treatment, shopping, cruise, etc.)
 * for an optimal choice. Take account of the choice of transport, food
 * and the number of days.
 * Implement the selection and sorting of tours.
 */

public class Database {

	public static String[] types = { "excursion", "shopping", "beach", "healing", "cruise" };
	public static String[] transports = { "bus", "aircraft" };
	public static String[] foods = { "without", "breakfasts", "all inclusive" };
	// rooms of travel types are stored in getRooms();
	// days of travel types are stored in getDays();
	
	public Database() {
	}

	public static String[] getTypes() {
		return types;
	}
	
	public static String[] getTransports() {
		return transports;
	}
	
	public static String[] getFoods() {
		return foods;
	}

	public static int[] getDays(String type) {

		int[] days = null;
		
		switch (type) {

		case "excursion":
			int[] daysOfExcursion = { 1, 2, 3, 4 };
			days = daysOfExcursion;
			break;

		case "shopping":
			int[] daysOfShopping = { 1, 2 };
			days = daysOfShopping;
			break;

		case "beach":
			int[] daysOfBeach = { 6, 7, 8, 9, 10, 12, 14, 21 };
			days = daysOfBeach;
			break;

		case "healing":
			int[] daysOfHealing = { 6, 7, 14, 21, 28 };
			days = daysOfHealing;
			break;

		case "cruise":
			int[] daysOfCruise = { 7, 14, 15, 21, 24, 28 };
			days = daysOfCruise;
			break;
		}

		return days;
	}

	public static int[] getRooms(String type) {

		int[] rooms = null;
		
		switch (type) {

		case "excursion":
			int[] roomsForExcursion = { 1, 2, 3, 4 };
			rooms = roomsForExcursion;
			break;

		case "shopping":
			int[] roomsForShopping = { 1, 2 };
			rooms = roomsForShopping;
			break;

		case "beach":
			int[] roomsForBeach = { 2, 3, 4 };
			rooms = roomsForBeach;
			break;

		case "healing":
			int[] roomsForHealing = { 1, 2 };
			rooms = roomsForHealing;
			break;

		case "cruise":
			int[] roomsForCruise = { 1, 2, 3, 4 };
			rooms = roomsForCruise;
			break;
		}
		return rooms;
	}
}