package by.java_intro_online.mod04.task15_travel;

/* Form a set of proposals for the client on the choice of a tourist voucher
 * of various types (rest, excursions, treatment, shopping, cruise, etc.)
 * for an optimal choice. Take account of the choice of transport, food
 * and the number of days.
 * Implement the selection and sorting of tours.
 */

import java.util.List;

import by.java_intro_online.mod04.task15_travel.entity.Travel;

public class View {
	
	public View(){
	}
	
	public static void output(List<Travel> travels) {
		for (Travel travel : travels) {
			System.out.println(travel.toString());
		}
		System.out.println();
	}
}
