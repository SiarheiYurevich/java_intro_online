package by.java_intro_online.mod05.task02_payment;

/* Create an Payment class with an inner class
 * using which we can form a purchase that can contain several products.
 */

public class PaymentLogic {
	
	public static double getTotalPrice(Payment payment) {
		
		double totalPrice = 0;
		
		for (Payment.Product p : payment.getProducts()) {
			totalPrice += p.getPrice();
		}
		
		return totalPrice;
	}
}
