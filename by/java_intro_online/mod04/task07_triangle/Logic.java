package by.java_intro_online.mod04.task07_triangle;

/*	Describe the class representing the triangle.
 * 	Provide methods for creating objects, calculating the area, 
 * 	perimeter and the intersection point of medians.
 */

public class Logic {

	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double x3;
	private double y3;

	public Logic() {
	}

	public double calcArea(Triangle triangle) {
		extractXY(triangle);
		double area = ((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
		return area;
	}

	public double calcPerimeter(Triangle triangle) {
		extractXY(triangle);
		double xy12 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double xy13 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		double xy23 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		double perimeter = xy12 + xy13 + xy23;
		return perimeter;
	}

	public Point calcIntersectionOfMedian(Triangle triangle) {
		extractXY(triangle);
		double xIntersertion = (x1 + x2 + x3) / 3;
		double yIntersertion = (y1 + y2 + y3) / 3;
		Point pointOfMedianIntersection = new Point(xIntersertion, yIntersertion);
		return pointOfMedianIntersection;
	}

	private void extractXY(Triangle triangle) {
		this.x1 = triangle.getPoint1().getX();
		this.y1 = triangle.getPoint1().getY();
		this.x2 = triangle.getPoint2().getX();
		this.y2 = triangle.getPoint2().getY();
		this.x3 = triangle.getPoint3().getX();
		this.y3 = triangle.getPoint3().getY();
	}
}
