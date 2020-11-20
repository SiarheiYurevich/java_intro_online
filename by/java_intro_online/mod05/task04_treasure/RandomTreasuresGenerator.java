package by.java_intro_online.mod05.task04_treasure;

import java.util.ArrayList;
import java.util.List;

import by.java_intro_online.mod05.task04_treasure.entity.Treasure;

public class RandomTreasuresGenerator {

	public RandomTreasuresGenerator() {
	}

	public static List<Treasure> generate(int caveCapacity) {

		List<Treasure> treasuresOfCave = new ArrayList<>();
		Treasure treasure;

		String[] namesOfTreasures = { "diamond", "gold", "silver" };
		
		for (int i = 0; i < caveCapacity; i++) {

			treasure = new Treasure();
			treasure.setName(namesOfTreasures[(int) (Math.random() * namesOfTreasures.length)]);
			treasure.setPrice((int) (Math.random() * 1000));

			treasuresOfCave.add(treasure);
		}
		return treasuresOfCave;
	}

}
