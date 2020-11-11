package by.java_intro_online.mod05.task02_payment;

/* Create an Payment class with an inner class
 * using which we can form a purchase that can contain several products.
 */

public class View {

	public static void output(Payment payment) {

		System.out.println("Payment id:" + payment.getId());

		for (Payment.Product p : payment.getProducts()) {
			System.out.println(p.toString());
		}

		System.out.println("Total price: " + PaymentLogic.getTotalPrice(payment));
	}
}