package by.java_intro_online.mod05.task04_treasure.dao;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;

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

public class CaveDAO implements CaveDAOInterface {

	public CaveDAO() {
	}

	@Override
	public Cave loadCaveFromFile(String pathname) {

		Cave cave = new Cave();

		// uploading and reading Cave XML file
		File readedFile = new File(pathname);
		StringBuilder readedText = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader(readedFile))) {

			int val = 0;

			while ((val = reader.read()) != -1) {
				char ch = (char) val;
				readedText.append(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String text = readedText.toString();

		// searching and setting cave name
		Pattern patternCaveName = Pattern.compile("<cave_name>[a-zA-Z]+</cave_name>");
		Matcher matcherCaveName = patternCaveName.matcher(text);
		int caveNameBegin = 11;
		int caveNameEnd = 0;

		if (matcherCaveName.find()) {

			caveNameEnd = matcherCaveName.group().length() - 12;

			String caveName = matcherCaveName.group().substring(caveNameBegin, caveNameEnd);
			cave.setName(caveName);

		} else {
			cave.setName("unnamed");
		}

		// searching and setting treasures fields
		Pattern patternName = Pattern.compile("<name>[a-zA-Z]+</name>");
		Matcher matcherName = patternName.matcher(text);
		int nameBegin = 6;
		int nameEnd = 0;

		Pattern patternTP = Pattern.compile("<price>[0-9]+</price>");
		Matcher matcherTP = patternTP.matcher(text);
		int priceBegin = 7;
		int priceEnd = 0;
		int price = 0;

		while (matcherName.find()) {

			nameEnd = matcherName.group().length() - 7;
			String name = matcherName.group().substring(nameBegin, nameEnd);

			if (matcherTP.find()) {

				priceEnd = matcherTP.group().length() - 8;
				price = Integer.parseInt(matcherTP.group().substring(priceBegin, priceEnd));
			}

			Treasure treasure = new Treasure(name, price);
			cave.addTreasure(treasure);
		}
		return cave;
	}

	@Override
	public void saveCaveInFile(Cave cave, String directory) {

		// Cave XML parser
		String pathname = directory + "/" + cave.getName() + ".xml";
		File f = new File(pathname);

		try (BufferedWriter caveWriter = new BufferedWriter(new FileWriter(f))) {

			caveWriter.write("<cave>");
			caveWriter.newLine();

			caveWriter.append("<cave_name>" + cave.getName() + "</cave_name>");
			caveWriter.newLine();

			caveWriter.append("<treasures>");
			caveWriter.newLine();

			for (Treasure treasure : cave.getTreasures()) {

				caveWriter.append("<treasure>");
				caveWriter.newLine();

				caveWriter.append("<name>" + treasure.getName() + "</name>");
				caveWriter.newLine();
				caveWriter.append("<price>" + treasure.getPrice() + "</price>");
				caveWriter.newLine();

				caveWriter.append("</treasure>");
				caveWriter.newLine();
			}
			caveWriter.append("</treasures>");
			caveWriter.newLine();

			caveWriter.append("</cave>");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}