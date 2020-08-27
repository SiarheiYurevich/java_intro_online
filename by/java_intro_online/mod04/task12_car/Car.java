package by.java_intro_online.mod04.task12_car;

/* Create an object of the class Car using classes Wheel and Engine.
 * Methods: go, fill up, change wheel, output model of car.
 */

import java.util.Arrays;

public class Car {

	private String model;
	private Engine engine;
	private Wheel[] wheels;
	private Wheel spareWheel;

	{
		wheels = new Wheel[4];
	}

	public Car() {
	}

	public Car(String model, Engine engine, Wheel[] wheels, Wheel spareWheel) {
		this.model = model;
		this.engine = engine;
		this.wheels = wheels;
		this.spareWheel = spareWheel;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Wheel[] getWheels() {
		return wheels;
	}
	
	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}
	
	public Wheel getSpareWheel() {
		return spareWheel;
	}
	
	public void setSpareWheel(Wheel spareWheel) {
		this.spareWheel = spareWheel;
	}
	
	@Override
	public String toString() {
		return "Car [ model " + model + ", engine" + engine + ", wheels" + Arrays.toString(wheels) + "spare wheel" + spareWheel + " ]";
	}
	
	// Car logic
	public void turnOnIgnition() {
		engine.turnOn();
	}

	public void go() {
		if (engine.isRunning()) {
			wheels[0].transmitRotation();
			wheels[1].transmitRotation();
			System.out.println("Car is driving.");
		}
	}

	public void stop() {
		wheels[0].disconnectTransmission();
		wheels[1].disconnectTransmission();

		wheels[1].lock();
		wheels[2].lock();
		System.out.println("Car is stopped.");
	}

	public void turnOffIgnition() {
		engine.turnOff();
	}

	public void fillUpCar() {
	}

	public void changeWheel(int numberOfWheelNeededChange) {
		wheels[numberOfWheelNeededChange] = spareWheel;
	}
}
