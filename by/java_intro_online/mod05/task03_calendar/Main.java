package by.java_intro_online.mod05.task03_calendar;

import by.java_intro_online.mod05.task03_calendar.MyCalendar.FreeDay;
import by.java_intro_online.mod05.task03_calendar.MyCalendar.Type;

/* Create class Calendar with inner class
 * using which you can store information about day off and holidays. 
 */

public class Main {

	public static void main(String[] args) {

		MyCalendar freeOf2021 = new MyCalendar();

		FreeDay newYear = new FreeDay(2021, 1, 1, Type.HOLIDAY, "New Year");
		FreeDay firstOfMay = new FreeDay(2021, 5, 1, Type.HOLIDAY, "Labour Day");
		FreeDay eighthOfMarch = new FreeDay(2021, 3, 8, Type.HOLIDAY, "International Women's Day");

		freeOf2021.addFreeDay(newYear);
		freeOf2021.addFreeDay(firstOfMay);
		freeOf2021.addFreeDay(eighthOfMarch);

		View.output(freeOf2021);
	}

}
