package by.java_intro_online.mod04.task01_test1;

/* Create a class Test1 with two variables.
 * Write a method for display and methods for changing the variables.
 * Write a method for sum calculating and a method for finding of the largest value of the two variables.
 */

public class Main {

	public static void main(String[] args) {

		Test1 test = new Test1();
		test.setA(1);
		test.setB(2);

		test.printA();
		test.printB();

		System.out.println("sum = " + test.getSum());
		System.out.println("Max AB = " + test.getMaxAB());
	}

}
