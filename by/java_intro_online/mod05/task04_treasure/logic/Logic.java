package by.java_intro_online.mod05.task04_treasure.logic;

import java.util.ArrayList;
import java.util.List;

import by.java_intro_online.mod05.task04_treasure.dao.CaveDAO;
import by.java_intro_online.mod05.task04_treasure.entity.Cave;
import by.java_intro_online.mod05.task04_treasure.entity.Treasure;

/* Create a program that can process information about 100 treasures,
 * the treasures is saved in the dragon's cave.
 * Implement treasure viewing, selection of the most expensive treasure
 * and selection of treasures for a given amount.
 * 
 * The console application must meet the following requirements:
 * - the application must be object oriented;
 * - each class must have a meaningful name and informative content;
 * - inheritance should only be applied when it makes sense;
 * - java code convention must be used;
 * - classes should be correctly decomposed into packages;
 * - the console menu should be minimal;
 * - files can be used to store data;
 */

public class Logic implements LogicInterface {

	private CaveDAO dao;

	{
		dao = new CaveDAO();
	}

	public Logic() {
	}

	@Override
	public Treasure getMostExpensiveTreasure(String filePathname) {

		Cave cave = dao.loadCaveFromFile(filePathname);

		Treasure dearestTreasure = cave.getTreasures().get(0);

		for (Treasure t : cave.getTreasures()) {
			if (t.getPrice() > dearestTreasure.getPrice()) {
				dearestTreasure = t;
			}
		}
		return dearestTreasure;
	}

	@Override
	public List<Treasure> getTreasuresForAmount(String filePathname, int amount) {

		Cave cave = dao.loadCaveFromFile(filePathname);

		List<Treasure> treasures = new ArrayList<>();

		for (Treasure t : cave.getTreasures()) {
			if ((getTotalPrice(treasures) + t.getPrice()) <= amount) {
				treasures.add(t);

				if (getTotalPrice(treasures) == amount) {
					break;
				}
			}
		}
		return treasures;
	}

	private int getTotalPrice(List<Treasure> treasures) {

		int totalPrice = 0;

		for (Treasure t : treasures) {
			totalPrice += t.getPrice();
		}

		return totalPrice;
	}
}
