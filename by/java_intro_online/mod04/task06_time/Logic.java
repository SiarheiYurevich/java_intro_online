package by.java_intro_online.mod04.task06_time;

/* Write a class to represent time.
 * Consider the possibility of setting the time and changing its fields (hours, minutes, seconds) with validation.
 * In the case of invalid fields values, the field is set to 0.
 * Create methods for changing the time by specified number of hours, minutes and seconds.
 */

public class Logic {

	public Logic() {
	}

	public void addHour(Time time, int fewHour) {
		recountTime(time, cutDay(reformTimeInSecond(time) + fewHour * 3600));
	}

	public void takeHour(Time time, int fewHour) {
		recountTime(time, cutDay(reformTimeInSecond(time) - fewHour * 3600));
	}

	public void addMinute(Time time, int fewMinute) {
		recountTime(time, cutDay(reformTimeInSecond(time) + fewMinute * 60));
	}

	public void takeMinute(Time time, int fewMinute) {
		recountTime(time, cutDay(reformTimeInSecond(time) - fewMinute * 60));
	}

	public void addSecond(Time time, int fewSecond) {
		recountTime(time, cutDay(reformTimeInSecond(time) + fewSecond));
	}

	public void takeSecond(Time time, int fewSecond) {
		recountTime(time, cutDay(reformTimeInSecond(time) - fewSecond));
	}

	private void recountTime(Time time, int timeInSecond) {
		time.setHour((int) (timeInSecond / 3600));
		time.setMinute((int) ((timeInSecond % 3600) / 60));
		time.setSecond(timeInSecond % 60);
	}

	private int cutDay(int timeInSecond) {
		int timeInSecondAfterCutDay = 0;
		if (timeInSecond < 0) {
			timeInSecondAfterCutDay = 86400 + (timeInSecond % 86400);
		} else {
			timeInSecondAfterCutDay = timeInSecond % 86400;
		}
		return timeInSecondAfterCutDay;
	}

	private int reformTimeInSecond(Time time) {
		int timeInSecond = 0;
		timeInSecond = time.getHour() * 3600 + time.getMinute() * 60 + time.getSecond();
		return timeInSecond;
	}
}
