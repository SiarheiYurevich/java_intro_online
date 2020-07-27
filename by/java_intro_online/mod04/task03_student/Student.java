package by.java_intro_online.mod04.task03_student;

/* Create a class Student containing fields surname, initials, group and grades (an array of five elements).
 * Create an array of ten elements of such type.
 * Add an method for output of surnames and group of students which have only 9 and 10 grades.
 */

import java.util.Arrays;

public class Student {

	private String surname;
	private String initials;
	private int group;
	private int[] grades;

	public Student() {
	}

	public Student(String surname, String initials, int group, int[] grades) {
		this.surname = surname;
		this.initials = initials;
		this.group = group;
		this.grades = grades;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Student [ Surmane " + surname + ", initials " + initials + ", group " + group + ", grades "
				+ Arrays.toString(grades) + " ]";
	}
}
