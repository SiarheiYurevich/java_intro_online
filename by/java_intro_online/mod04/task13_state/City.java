package by.java_intro_online.mod04.task13_state;

/* Create an object of the class State using classes City, District and Region.
 * Methods: output capital city, area, number of regions, regional centers.
 */

public class City {

	private String name;

	public City() {
	}

	public City(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "City [ name " + name + " ]";
	}

}
