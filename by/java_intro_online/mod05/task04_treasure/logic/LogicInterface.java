package by.java_intro_online.mod05.task04_treasure.logic;

import java.util.List;

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

public interface LogicInterface {
	
	public Treasure getMostExpensiveTreasure(String filePathname);
	
	public List<Treasure> getTreasuresForAmount(String filePathname, int amount);	

}