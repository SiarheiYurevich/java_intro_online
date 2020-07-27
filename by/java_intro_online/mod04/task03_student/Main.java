package by.java_intro_online.mod04.task03_student;

/* Create a class Student containing fields surname, initials, group and grades (an array of five elements).
 * Create an array of ten elements of such type.
 * Add an method for output of surnames and group of students which have only 9 and 10 grades.
 */

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Logic logic = new Logic();
		View view = new View();

		int numberOfStudent = 10;

		ArrayList<Student> studentParty = new ArrayList<Student>();

		studentParty.addAll(logic.generateStudent(numberOfStudent));

		System.out.println("Generated list of students:");
		view.viewGroupOfStudent(studentParty);

		System.out.println("Output of excellent students:");
		view.viewExcellentStudent(studentParty);

	}
}
