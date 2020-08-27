package by.java_intro_online.mod04.task13_state;

/* Create an object of the class State using classes City, District and Region.
 * Methods: output capital city, area, number of regions, regional centers.
 */

public class Main {

	public static void main(String[] args) {

		String name1 = "Gosudarstvo";
		String name2 = "Oblast_1";
		String name3 = "Oblast_2";
		City city1 = new City("Stolitsa");
		City city2 = new City("Stolitsa_Oblasty_1");
		City city3 = new City("Stolitsa_Oblasty_2");
		District district1 = new District();
		District district2 = new District();
		District district3 = new District();
		District district4 = new District();
		district1.setArea(100);
		district2.setArea(200);
		district3.setArea(300);
		district4.setArea(400);
		District[] districts1 = { district1, district2 };
		District[] districts2 = { district3, district4 };
		Region region1 = new Region(name2, city2, districts1);
		Region region2 = new Region(name3, city3, districts2);
		Region[] regions = { region1, region2 };
		
		State state = new State(name1, city1, regions);

		System.out.println("Capital city of the state is " + state.getCapital().getName());
		System.out.println("Number of regions of the state is " + state.getRegions().length);
		System.out.println("Area od the state is " + state.getArea());

		System.out.println("Regional centers:");
		for (int i = 0; i < regions.length; i++) {
			System.out.println(state.getRegions()[i].getCapital().getName());
		}
	}

}
