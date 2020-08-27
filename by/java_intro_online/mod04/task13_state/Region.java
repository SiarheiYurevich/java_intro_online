package by.java_intro_online.mod04.task13_state;

/* Create an object of the class State using classes City, District and Region.
 * Methods: output capital city, area, number of regions, regional centers.
 */

import java.util.Arrays;

public class Region {

	private String name;
	private int area;
	private City capital;
	private District[] districts;

	public Region() {
	}

	public Region(String name, City capital, District[] districts) {
		this.name = name;
		int areaOfRegion = 0;
		;
		for (int i = 0; i < districts.length; i++) {
			areaOfRegion += districts[i].getArea();
		}
		this.area = areaOfRegion;
		this.capital = capital;
		this.districts = districts;
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

	public District[] getDistricts() {
		return districts;
	}

	public void setDistricts(District[] districts) {
		this.districts = districts;
	}

	@Override
	public String toString() {
		return "Region [ name " + name + ", area " + area + ", capital " + capital + ", districts "
				+ Arrays.toString(districts) + " ]";
	}
}
