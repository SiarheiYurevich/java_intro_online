package by.java_intro_online.mod04.task07_triangle;

/*	Describe the class representing the triangle.
 * 	Provide methods for creating objects, calculating the area, 
 * 	perimeter and the intersection point of medians.
 */

public class Triangle {

	private Point[] triangle;

	{
		triangle = new Point[3];
	}

	public Triangle() {
		Point point1 = new Point();
		Point point2 = new Point();
		Point point3 = new Point();
		triangle[0] = point1;
		triangle[1] = point2;
		triangle[2] = point3;
	}

	public Triangle(Point point1, Point point2, Point point3) {
		triangle[0] = point1;
		triangle[1] = point2;
		triangle[2] = point3;
	}

	public Point getPoint1() {
		return triangle[0];
	}

	public void setPoint1(Point point1) {
		triangle[0] = point1;
	}

	public Point getPoint2() {
		return triangle[1];
	}

	public void setPoint2(Point point2) {
		triangle[1] = point2;
	}

	public Point getPoint3() {
		return triangle[2];
	}

	public void setPoint3(Point point3) {
		triangle[2] = point3;
	}

	public void setArbitraryPointCoordinate(int numberOfPoint, char xy, double value) {
		if (xy == 'x') {
			triangle[numberOfPoint - 1].setX(value);
		}
		if (xy == 'y') {
			triangle[numberOfPoint - 1].setY(value);
		}
	}

	@Override
	public String toString() {
		return "Trinagle [ x1 = " + triangle[0].getX() + ", y1 = " + triangle[0].getY() + ", x2 = " + triangle[1].getX()
				+ ", y2 = " + triangle[1].getY() + ", x3 = " + triangle[2].getX() + ", y3 = " + triangle[2].getY()
				+ " ]";
	}

}
