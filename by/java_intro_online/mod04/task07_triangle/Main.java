package by.java_intro_online.mod04.task07_triangle;

/*	Describe the class representing the triangle.
 * 	Provide methods for creating objects, calculating the area, 
 * 	perimeter and the intersection point of medians.
 */

public class Main {

	public static void main(String[] args) {

		Point point1 = new Point(1, 2);
		Point point2 = new Point(2, 2);
		Point point3 = new Point(3, 3);
		Triangle triangle1 = new Triangle(point1, point2, point3);

		Point point4 = new Point();
		point4.setX(1);
		point4.setY(2);
		Point point5 = new Point();
		point5.setX(2);
		point5.setY(2);
		Point point6 = new Point();
		point6.setX(3);
		point6.setY(3);
		
		Triangle triangle2 = new Triangle();
		triangle2.setPoint1(point4);
		triangle2.setPoint2(point5);
		triangle2.setPoint3(point6);

		Triangle triangle3 = new Triangle();
		triangle3.setArbitraryPointCoordinate(1, 'x', 1);
		triangle3.setArbitraryPointCoordinate(1, 'y', 2);
		triangle3.setArbitraryPointCoordinate(2, 'x', 2);
		triangle3.setArbitraryPointCoordinate(2, 'y', 2);
		triangle3.setArbitraryPointCoordinate(3, 'x', 3);
		triangle3.setArbitraryPointCoordinate(3, 'y', 3);

		System.out.println(triangle1.toString());
		System.out.println(triangle2.toString());
		System.out.println(triangle3.toString());

		Logic logic = new Logic();
		System.out.println("Area of traingle1 - " + logic.calcArea(triangle1));
		System.out.println("Perimeter of triangle2 - " + logic.calcPerimeter(triangle2));
		System.out.println("Point of median intersection of triangle3- " + logic.calcIntersectionOfMedian(triangle3));

	}
}
