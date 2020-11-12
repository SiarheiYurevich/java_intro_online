package by.java_intro_online.mod05.task03_calendar;

import by.java_intro_online.mod05.task03_calendar.MyCalendar.FreeDay;

/* Create class Calendar with inner class
 * using which you can store information about day off and holidays. 
 */

public class View {

	public static void output(MyCalendar days) {

		for (FreeDay day : days.getMyFreeDays()) {
			System.out.println(day.toString());
		}
	}

}
