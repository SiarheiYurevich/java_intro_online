package by.java_intro_online.mod04.task12_car;

/* Create an object of the class Car using classes Wheel and Engine.
 * Methods: go, fill up, change wheel, output model of car.
 */

public class Wheel {

	private String model;

	public Wheel() {
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Whell [ model " + model + " ]";
	}
	
	// Wheel logic
	public void transmitRotation() {
	}
	
	public void disconnectTransmission() {
	}
	
	public void lock() {
	}
}
