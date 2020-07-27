package by.java_intro_online.mod04.task07_triangle;

/*	Describe the class representing the triangle.
 * 	Provide methods for creating objects, calculating the area, 
 * 	perimeter and the intersection point of medians.
 */

public class Point {

	private double x;
	private double y;

	public Point() {
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getX() {
		return x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Point [ x = " + x + ", y = " + y + " ]";
	}

}
