package by.java_intro_online.mod04.task03_student;

/* Create a class Student containing fields surname, initials, group and grades (an array of five elements).
 * Create an array of ten elements of such type.
 * Add an method for output of surnames and group of students which have only 9 and 10 grades.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class View {

	public View() {
	}

	public void viewGroupOfStudent(ArrayList<Student> studentParty) {
		for (int i = 0; i < studentParty.size(); i++) {
			viewStudent(studentParty.get(i));
		}
	}

	public void viewStudent(Student student) {
		System.out.println("Student [ " + student.getSurname() + " " + student.getInitials() + ", group "
				+ student.getGroup() + ", grades " + Arrays.toString(student.getGrades()) + " ]");
	}

	public void viewExcellentStudent(ArrayList<Student> studentParty) {

		Logic logic = new Logic();

		for (int j = 0; j < studentParty.size(); j++) {
			if (logic.isExcellentStudent(studentParty.get(j))) {
				viewStudent(studentParty.get(j));
			}
		}
	}

}
