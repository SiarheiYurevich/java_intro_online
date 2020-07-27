package by.java_intro_online.mod04.task03_student;

/* Create a class Student containing fields surname, initials, group and grades (an array of five elements).
 * Create an array of ten elements of such type.
 * Add an method for output of surnames and group of students which have only 9 and 10 grades.
 */

import java.util.ArrayList;

public class Logic {

	public Logic() {
	}

	public boolean isExcellentStudent(Student student) {

		int estimatedGrades[] = student.getGrades();

		for (int i = 0; i < estimatedGrades.length; i++) {
			if (estimatedGrades[i] < 9) {
				return false;
			}
		}
		return true;
	}

	public ArrayList<Student> generateStudent(int numberOfStudent) {

		ArrayList<Student> studentGroup = new ArrayList<Student>();
		Student student;

		String bankOfSurnames[] = { "Aaaa", "Bbbb", "Cccc", "Dddd", "Eeee" };
		String bankOfInitials[] = { "A.A.", "B.B.", "C.C.", "D.D.", "E.E." };
		String randomSurname;
		String randomInitials;
		int randomGroup;
		int numberOfGrades = 5;
		int randomGrades[];

		for (int i = 0; i < numberOfStudent; i++) {

			randomSurname = bankOfSurnames[(int) (Math.random() * bankOfSurnames.length)];
			randomInitials = bankOfInitials[(int) (Math.random() * bankOfInitials.length)];
			randomGroup = 10 + (int) (Math.random() * 9);

			randomGrades = new int[numberOfGrades];
			for (int j = 0; j < numberOfGrades; j++) {
				randomGrades[j] = (int) (Math.random() * 3) + 8;
			}

			student = new Student(randomSurname, randomInitials, randomGroup, randomGrades);
			studentGroup.add(student);
		}
		return studentGroup;
	}
}
