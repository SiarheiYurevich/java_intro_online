package by.java_intro_online.mod04.task13_state;

/* Create an object of the class State using classes City, District and Region.
 * Methods: output capital city, area, number of regions, regional centers.
 */

public class District {

	private String name;
	private int area;
	private City capital;

	public District() {
	}

	public District(String name, int area, City capital) {
		this.name = name;
		this.area = area;
		this.capital = capital;
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

	@Override
	public String toString() {
		return "District [ name " + name + ", area " + area + ", capital " + capital + " ]";
	}
}
