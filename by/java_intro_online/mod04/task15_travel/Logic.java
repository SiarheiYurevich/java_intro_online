package by.java_intro_online.mod04.task15_travel;

import java.util.ArrayList;
import java.util.List;

import by.java_intro_online.mod04.task15_travel.entity.Accommodation;
import by.java_intro_online.mod04.task15_travel.entity.Travel;

/* Form a set of proposals for the client on the choice of a tourist voucher
 * of various types (rest, excursions, treatment, shopping, cruise, etc.)
 * for an optimal choice. Take account of the choice of transport, food
 * and the number of days.
 * Implement the selection and sorting of tours.
 */

public class Logic {

	Logic() {
	}

	public static List<Travel> selectByType(List<Travel> travels, String type) {

		List<Travel> travelsOfType = new ArrayList<>();

		for (Travel travel : travels) {

			if (travel.getType().equals(type)) {
				travelsOfType.add(travel);
			}
		}
		return travelsOfType;
	}

	public static List<Travel> selectByTransport(List<Travel> travels, String transport) {

		List<Travel> travelsByTransport = new ArrayList<>();

		for (Travel travel : travels) {

			if (travel.getTransport().equals(transport)) {
				travelsByTransport.add(travel);
			}
		}
		return travelsByTransport;
	}

	public static List<Travel> selectByFood(List<Travel> travels, String food) {

		List<Travel> travelsByFood = new ArrayList<>();

		for (Travel travel : travels) {

			if (travel.getAccommodation().getFood().equals(food)) {
				travelsByFood.add(travel);
			}
		}
		return travelsByFood;
	}

	public static List<Travel> selectByRoom(List<Travel> travels, int room) {

		List<Travel> travelsOfRoom = new ArrayList<>();

		for (Travel travel : travels) {

			if (travel.getAccommodation().getRoom() == room) {
				travelsOfRoom.add(travel);
			}
		}
		return travelsOfRoom;
	}

	public static List<Travel> selectByDays(List<Travel> travels, int min, int max) {

		List<Travel> travelsOfDays = new ArrayList<>();

		for (Travel travel : travels) {

			if (travel.getAccommodation().getDays() >= min && travel.getAccommodation().getDays() <= max) {
				travelsOfDays.add(travel);
			}
		}
		return travelsOfDays;
	}

	public static List<Travel> selectByPrice(List<Travel> travels, int lowerPrice, int higherPrice) {

		List<Travel> travelsOfPrice = new ArrayList<>();

		for (Travel travel : travels) {

			if (travel.getPrice() >= lowerPrice && travel.getPrice() <= higherPrice) {
				travelsOfPrice.add(travel);
			}
		}
		return travelsOfPrice;
	}

	public static List<Travel> sortByPrice(List<Travel> travels) {

		List<Travel> sortedTravels = travels;

		Travel tempTravel;

		for (int i = 1; i < sortedTravels.size(); i++) {

			if (sortedTravels.get(i - 1).getPrice() > sortedTravels.get(i).getPrice()) {
				tempTravel = sortedTravels.get(i - 1);
				sortedTravels.set(i - 1, sortedTravels.get(i));
				sortedTravels.set(i, tempTravel);
				i = 0;
			}
		}
		return sortedTravels;
	}

	public static List<Travel> getDatabaseTravels() {

		List<Travel> travels = new ArrayList<>();

		String[] types = Database.types;
		String[] transports = Database.transports;
		String[] foods = Database.foods;
		int[] rooms;
		int[] days;

		for (String type : types) {
			for (String transport : transports) {

				rooms = Database.getRooms(type);
				for (int room : rooms) {
					for (String food : foods) {

						days = Database.getDays(type);
						for (int day : days) {

							Accommodation accommodation = new Accommodation(room, food, day);
							Travel travel = new Travel(type, transport, accommodation);
							travel.setPrice(calculatePrice(travel));
							travels.add(travel);
						}
					}
				}
			}
		}
		return travels;
	}

	private static int calculatePrice(Travel travel) {

		int price = 0;

		// price of travel type
		switch (travel.getType()) {

		case "excursion":
			price += 60;
			break;

		case "shopping":
			price += 30;
			break;

		case "beach":
			price += 75;
			break;

		case "healing":
			price += 125;
			break;

		case "cruise":
			price += 250;
			break;
		}

		// price of food
		switch (travel.getAccommodation().getFood()) {

		case "breakfasts":
			price += 10;
			break;

		case "all inclusive":
			price += 25;
			break;
		}

		// Transport price
		switch (travel.getTransport()) {

		case "bus":
			price += 45;
			break;

		case "aircraft":
			price += 150;
			break;
		}
		
		// price taking in account the number of persons
		int persons = travel.getAccommodation().getRoom();
		price *= persons;
		
		// price of room
		switch (travel.getAccommodation().getRoom()) {

		case 1:
			price += 40;
			break;

		case 2:
			price += 60;
			break;

		case 3:
			price += 75;
			break;

		case 4:
			price += 85;
			break;
		}
		
		// price taking in account the number of days
		price *= travel.getAccommodation().getDays();

		return price;
	}

}
