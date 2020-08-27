package by.java_intro_online.mod04.task12_car;

/* Create an object of the class Car using classes Wheel and Engine.
 * Methods: go, fill up, change wheel, output model of car.
 */

public class Engine {

	private String model;
	private boolean engineRunning;

	public Engine() {
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Engine [ model " + model + " ]";
	}
	// Engine logic
	public void turnOn() {
		engineRunning = true;
		System.out.println("Engine is running.");
	}

	public void turnOff() {
		engineRunning = false;
		System.out.println("Engine is stopped.");
	}
	
	public boolean isRunning() {
		return engineRunning;
	}
}
