package by.java_intro_online.mod04.task06_time;

/* Write a class to represent time.
 * Consider the possibility of setting the time and changing its fields (hours, minutes, seconds) with validation.
 * In the case of invalid fields values, the field is set to 0.
 * Create methods for changing the time by specified number of hours, minutes and seconds.
 */

public class Main {

	public static void main(String[] args) {

		Logic logic = new Logic();
		View view = new View();

		Time time1 = new Time(12, 12, 12);
		Time time2 = new Time();

		time2.setHour(12);
		time2.setMinute(12);
		time2.setSecond(12);

		view.printTime(time1);
		view.printTime(time2);

		logic.addHour(time1, 24);
		logic.addMinute(time1, 12);
		logic.addSecond(time1, 36);

		logic.takeHour(time2, 6);
		logic.takeMinute(time2, 1439);
		logic.takeSecond(time2, 86454);

		view.printTime(time1);
		view.printTime(time2);

	}
}
