package by.java_intro_online.mod04.task13_state;

/* Create an object of the class State using classes City, District and Region.
 * Methods: output capital city, area, number of regions, regional centers.
 */

import java.util.Arrays;

public class State {

	private String name;
	private int area;
	private City capital;
	private Region[] regions;

	public State() {
	}

	public State(String name, City capital, Region[] regions) {
		this.name = name;
		int areaOfState = 0;
		for (int i = 0; i < regions.length; i++) {
			areaOfState += regions[i].getArea();
		}
		this.area = areaOfState;
		this.capital = capital;
		this.regions = regions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public Region[] getRegions() {
		return regions;
	}

	public void setRegions(Region[] regions) {
		this.regions = regions;
	}

	@Override
	public String toString() {
		return "State [ name " + name + ", area " + area + ", capital " + capital + ", regions "
				+ Arrays.toString(regions) + " ]";
	}
}
