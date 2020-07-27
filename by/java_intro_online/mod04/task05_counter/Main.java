package by.java_intro_online.mod04.task05_counter;

/*	Describe a class that implements a decimal counter, which can increase or decrease its value by one in a given range.
 * 	Provide initialization of the counter with default value and an arbitrary value.
 * 	The counter has methods for increasing and decreasing its state, and method allow to get its current value.
 * 	Write code that demonstrates all features of the class.
 */

public class Main {

	public static void main(String[] args) {

		Counter count1 = new Counter();
		Counter count2 = new Counter(0, 10, 0);

		for (int i = 0; i < 11; i++) {
			count1.increase();
			System.out.print(count1.getCurrent() + " ");
		}
		System.out.println();

		for (int j = 0; j < 11; j++) {
			count2.decrease();
			System.out.print(count2.getCurrent() + " ");
		}
	}

}
