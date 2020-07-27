package by.java_intro_online.mod04.task06_time;

/* Write a class to represent time.
 * Consider the possibility of setting the time and changing its fields (hours, minutes, seconds) with validation.
 * In the case of invalid fields values, the field is set to 0.
 * Create methods for changing the time by specified number of hours, minutes and seconds.
 */

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time() {
	}

	public Time(int hour, int minute, int second) {
		if (hour >= 0 && hour <= 23) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}

		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}

		if (second >= 0 && second <= 59) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour >= 0 && hour <= 23) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second >= 0 && second <= 59) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}

	@Override
	public String toString() {
		return "Time [ hour = " + hour + ", minute = " + minute + ", second = " + second + " ]";
	}

}
