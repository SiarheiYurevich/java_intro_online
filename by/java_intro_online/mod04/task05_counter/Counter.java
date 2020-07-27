package by.java_intro_online.mod04.task05_counter;

/*	Describe a class that implements a decimal counter, which can increase or decrease its value by one in a given range.
 * 	Provide initialization of the counter with default value and an arbitrary value.
 * 	The counter has methods for increasing and decreasing its state, and method allow to get its current value.
 * 	Write code that demonstrates all features of the class.
 */

public class Counter {

	private int min;
	private int max;
	private int current;

	public Counter() {
		this.min = 0;
		this.max = 10;
		this.current = 0;
	}

	public Counter(int min, int max, int current) {
		this.min = min;
		this.max = max;
		this.current = current;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	@Override
	public String toString() {
		return "Counter [ min = " + min + ", max = " + max + ", current = " + current + " ]";
	}

	public void increase() {
		current++;
		if (current > max) {
			current = min;
		}
	}

	public void decrease() {
		current--;
		if (current < min) {
			current = max;
		}
	}
}
