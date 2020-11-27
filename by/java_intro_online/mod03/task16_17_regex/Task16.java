package by.java_intro_online.mod03.task16_17_regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Create an application that allows you to do three different operations
 * on text (the text is stored as string):
 * - sort paragraphs by number of sentences;
 * - sort words of the sentences by words length;
 * - sort words in sentence by number of specified character,
 *   and if they are equals - alphabetically.
 */

public class Task16 {

	public static void main(String[] args) {

		String text = "A regular expression is a sequence of characters "
				+ "that define a search pattern. Usually such patterns are used "
				+ "by searching algorithms for find or find and replace operations on strings.\r"

				+ "Java provides classes for pattern matching with regular expressions. "
				+ "A Pattern object is a compiled representation of a regular expression. "
				+ "To create a pattern, you must first invoke one of its public static "
				+ "compile() methods, which will then return a Pattern object. "
				+ "These methods accept a regular expression as the first argument. "
				+ "A Matcher object is the engine that interprets the pattern and "
				+ "performs match operations against an input string. You obtain a Matcher "
				+ "object by invoking the matcher() method on a Pattern object.\r"

				+ "Regexes are useful in a wide variety of text processing tasks. Common "
				+ "applications of regexes include data validation, data scraping, data wrangling, "
				+ "simple parsing, the production of syntax highlighting systems, and many "
				+ "other tasks. While regexes would be useful on Internet search engines, "
				+ "processing them across the entire database could consume excessive "
				+ "computer resources depending on the complexity and design of the regex.\r";

		String str = "Common applications include data validation, data scraping, data wrangling, "
				+ "simple parsing, the production of syntax highlighting systems, and many other tasks";

		System.out.println(sortParsByNoOfSents(text));

		System.out.println(sortWordsInSentBySpecCharNumber(str, 'a'));
		System.out.println(sortWordsInSentByWordsLength(str));
		
	}

	public static String sortParsByNoOfSents(String text) {

		String paragraphRegex = ".*\\R";
		List<String> listOfPar = separateTextByRegex(text, paragraphRegex);
		
		int sentsNoInParA = 0;
		int sentsNoInParB = 0;

		for (int i = 1; i < listOfPar.size(); i++) {

			sentsNoInParA = findNoOfSentsInText(listOfPar.get(i - 1));
			sentsNoInParB = findNoOfSentsInText(listOfPar.get(i));

			if (sentsNoInParA < sentsNoInParB) {
				swapStringInList(listOfPar, i - 1, i);
				i = 0;
			}
		}
		String sortedParagraphslist = uniteStringsOfList(listOfPar, "\r");
		return sortedParagraphslist;
	}

	public static List<String> separateTextByRegex(String text, String regex) {

		List<String> separatedText = new ArrayList<>();

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			separatedText.add(matcher.group());
		}
		return separatedText;
	}
	
	private static int findNoOfSentsInText(String text) {

		return separateTextByRegex(text, "[A-Z][^.!?]*[.!?]").size();
	}
	
	private static void swapStringInList(List<String> stringlist, int i, int j) {

		String temp = stringlist.get(i);
		stringlist.set(i, stringlist.get(j));
		stringlist.set(j, temp);
	}
	
	private static String uniteStringsOfList(List<String> listOfStrings, String delimiter) {

		String uniString = "";

		for (String stringFromList : listOfStrings) {
			uniString += stringFromList + delimiter;
		}
		return uniString;
	}
	
	public static String sortWordsInSentByWordsLength(String sentence) {

		String sortedSentence = null;
		List<String> wordlist = separateTextByRegex(sentence, "[a-zA-Z]+\\b");
		int lengthWordA = 0;
		int lengthWordB = 0;

		for (int i = 1; i < wordlist.size(); i++) {

			lengthWordA = wordlist.get(i - 1).toCharArray().length;
			lengthWordB = wordlist.get(i).toCharArray().length;

			if (lengthWordA < lengthWordB) {
				swapStringInList(wordlist, i - 1, i);
				i = 0;
			}
		}
		sortedSentence = uniteStringsOfList(wordlist, " ");
		return sortedSentence;
	}

	public static String sortWordsInSentBySpecCharNumber(String sentence, char ch) {

		String sortedSentence = null;
		List<String> wordlist = separateTextByRegex(sentence, "[a-zA-Z]+\\b");
		int numberChInWordA = 0;
		int numberChInWordB = 0;
		int firstCharWordA = 0;
		int firstCharWordB = 0;

		for (int i = 1; i < wordlist.size(); i++) {

			numberChInWordA = countChars(wordlist.get(i - 1), ch);
			numberChInWordB = countChars(wordlist.get(i), ch);
			firstCharWordA = wordlist.get(i - 1).toCharArray()[0];
			firstCharWordB = wordlist.get(i).toCharArray()[0];

			if (numberChInWordA < numberChInWordB
					|| numberChInWordA == numberChInWordB && firstCharWordA > firstCharWordB) {
				swapStringInList(wordlist, i - 1, i);
				i = 0;
			}
		}
		sortedSentence = uniteStringsOfList(wordlist, " ");
		return sortedSentence;
	}

	public static int countChars(String word, char ch) {
		
		return separateTextByRegex(word, Character.toString(ch)).size();
	}
}
