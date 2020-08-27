package by.java_intro_online.mod04.task12_car;

/* Create an object of the class Car using classes Wheel and Engine.
 * Methods: go, fill up, change wheel, output model of car.
 */

public class Main {
	
	public static void main(String[] args) {
		
		Car car;
		Engine engine = new Engine();
		Wheel wheel = new Wheel();
		Wheel[] wheels = new Wheel[4];
		wheels[0] = wheel;
		wheels[1] = wheel;
		wheels[2] = wheel;
		wheels[3] = wheel;
		car = new Car("CAR-2020", engine, wheels, wheel);
		
		car.turnOnIgnition();
		car.go();
		car.stop();
		car.turnOffIgnition();
		
		System.out.println(car.getModel());
		
	}

}
