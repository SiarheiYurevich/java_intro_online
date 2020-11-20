package by.java_intro_online.mod05.task04_treasure.entity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

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

public class Cave implements Serializable {

	private static final long serialVersionUID = 3436484688938416374L;

	private String name;
	private List<Treasure> treasures;
	private static final int CAVE_CAPACITY = 100;

	{
		treasures = new ArrayList<>(CAVE_CAPACITY);
	}

	public Cave() {
	}

	public Cave(String name, List<Treasure> treasures) {

		this.name = name;

		if (treasures.size() <= CAVE_CAPACITY) {
			this.treasures = treasures;
		} else {
			this.treasures = treasures.subList(0, CAVE_CAPACITY - 1);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures) {

		if (treasures.size() <= CAVE_CAPACITY) {
			this.treasures = treasures;
		} else {
			this.treasures = treasures.subList(0, CAVE_CAPACITY - 1);
		}
	}

	public void addTreasure(Treasure treasure) {

		if (treasures.size() <= CAVE_CAPACITY) {
			this.treasures.add(treasure);
		}
	}

	public int getCaveCapacity() {
		return CAVE_CAPACITY;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((treasures == null) ? 0 : treasures.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cave other = (Cave) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (treasures == null) {
			if (other.treasures != null)
				return false;
		} else if (!treasures.equals(other.treasures))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cave [name=" + name + ", treasures=" + treasures + "]";
	}
}
