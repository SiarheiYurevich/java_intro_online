package by.java_intro_online.mod05.task02_payment;

/* Create an Payment class with an inner class
 * using which we can form a purchase that can contain several products.
 */

public class Main {

	public static void main(String[] args) {

		Payment p = new Payment();

		p.addProduct("Thinking in Java", 19.99);
		p.addProduct("Core Java Fundamentals", 19.99);

		View.output(p);

	}
}
