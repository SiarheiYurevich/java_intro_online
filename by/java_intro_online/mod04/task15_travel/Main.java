package by.java_intro_online.mod04.task15_travel;

import java.util.List;

import by.java_intro_online.mod04.task15_travel.entity.Travel;

/* Form a set of proposals for the client on the choice of a tourist voucher
 * of various types (rest, excursions, treatment, shopping, cruise, etc.)
 * for an optimal choice. Take account of the choice of transport, food
 * and the number of days.
 * Implement the selection and sorting of tours.
 */

public class Main {

	public static void main(String[] args) {

		List<Travel> travels = Logic.getDatabaseTravels();
		
		travels = Logic.selectByType(travels, "excursion");
		travels = Logic.sortByPrice(Logic.selectByPrice(travels, 1000, 2000));
		travels = Logic.selectByDays(travels, 2, 3);
		
		View.output(travels);
	}
}