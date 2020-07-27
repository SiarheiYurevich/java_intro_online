package by.java_intro_online.mod04.task02_test2;

/* Create a class Test2 with two variables.
 * Write a constructor without parameters and a constructor to initialize default class members.
 * Write set- and get- methods for class instance fields.
 */

public class Test2 {

	private int a;
	private int b;

	public Test2() {
	}

	public Test2(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
