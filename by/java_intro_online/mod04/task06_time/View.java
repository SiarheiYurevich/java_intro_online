package by.java_intro_online.mod04.task06_time;

/* Write a class to represent time.
 * Consider the possibility of setting the time and changing its fields (hours, minutes, seconds) with validation.
 * In the case of invalid fields values, the field is set to 0.
 * Create methods for changing the time by specified number of hours, minutes and seconds.
 */

public class View {

	public View() {
	}

	public void printTime(Time time) {
		System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
	}

}
