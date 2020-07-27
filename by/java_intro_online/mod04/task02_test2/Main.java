package by.java_intro_online.mod04.task02_test2;

/* Create a class Test2 with two variables.
 * Write a constructor without parameters and a constructor to initialize default class members.
 * Write set- and get- methods for class instance fields.
 */

public class Main {

	public static void main(String[] args) {

		Test2 test21 = new Test2();

		test21.setA(1);
		test21.setB(2);

		Test2 test22 = new Test2(3, 4);

		System.out.print(test21.getA() + " " + test21.getB() + " " + test22.getA() + " " + test22.getB());
	}

}
