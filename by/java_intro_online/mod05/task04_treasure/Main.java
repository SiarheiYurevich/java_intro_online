package by.java_intro_online.mod05.task04_treasure;

import by.java_intro_online.mod05.task04_treasure.dao.CaveDAO;
import by.java_intro_online.mod05.task04_treasure.entity.Cave;
import by.java_intro_online.mod05.task04_treasure.logic.Logic;
import by.java_intro_online.mod05.task04_treasure.view.View;

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

public class Main {

	public static void main(String[] args) {
		
		CaveDAO dao = new CaveDAO();
		Logic logic = new Logic();
		View view = new View();

		Cave cave = new Cave();
		cave.setName("RedDragonCave");
		cave.setTreasures(RandomTreasuresGenerator.generate(cave.getCaveCapacity()));
		
		String directory = "/home/siarhei/eclipse-workspace/java_intro_online/src/by/java_intro_online/mod05/task04_treasure";
		dao.saveCaveInFile(cave, directory);
		
		String filePathname = "/home/siarhei/eclipse-workspace/java_intro_online/src/by/java_intro_online/mod05/task04_treasure/RedDragonCave.xml";
		view.output(logic.getMostExpensiveTreasure(filePathname));
		view.output(logic.getTreasuresForAmount(filePathname, 2000));
	}

}
