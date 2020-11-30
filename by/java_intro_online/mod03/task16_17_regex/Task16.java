package by.java_intro_online.mod03.task16_17_regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Create an application that allows you to do three different
 * operations on text (the text is stored as string):
 * - sort paragraphs by number of sentences;
 * - sort words of the sentences by words length;
 * - sort words in sentence by number of specified character,
 *   and if they are equals - alphabetically.
 */

public class Task16 {

	public static void main(String[] args) {

		String text = "1) A regular expression is a sequence of characters "
				+ "that define a search pattern. Usually such patterns are used "
				+ "by searching algorithms for find or find and replace operations on strings.\r"

				+ "2) Java provides classes for pattern matching with regular expressions. "
				+ "A Pattern object is a compiled representation of a regular expression. "
				+ "To create a pattern, you must first invoke one of its public static "
				+ "compile() methods, which will then return a Pattern object. "
				+ "These methods accept a regular expression as the first argument. "
				+ "A Matcher object is the engine that interprets the pattern and "
				+ "performs match operations against an input string. You obtain a Matcher "
				+ "object by invoking the matcher() method on a Pattern object.\r"

				+ "3) Regexes are useful in a wide variety of text processing tasks. Common "
				+ "applications of regexes include data validation, data scraping, data wrangling, "
				+ "simple parsing, the production of syntax highlighting systems, and many "
				+ "other tasks. While regexes would be useful on Internet search engines, "
				+ "processing them across the entire database could consume excessive "
				+ "computer resources depending on the complexity and design of the regex.\r";

		System.out.println(sortParagraphsByNumberOfSentences(text));

		System.out.println(sortWordsOfSentencesByWordsLength(text));

		System.out.println(sortWordsOfSentencesNumberOfSpecCharOrAlphabet(text, 'a'));
	}

	public static String sortParagraphsByNumberOfSentences(String text) {

		String paragraphRegex = ".*\\R";
		List<String> listOfParagraphs = separateTextByRegex(text, paragraphRegex);

		int numberOfSentencesA = 0;
		int numberOfSentencesB = 0;

		for (int i = 1; i < listOfParagraphs.size(); i++) {

			numberOfSentencesA = findNumberOfSentences(listOfParagraphs.get(i - 1));
			numberOfSentencesB = findNumberOfSentences(listOfParagraphs.get(i));

			if (numberOfSentencesA < numberOfSentencesB) {
				swapStringInList(listOfParagraphs, i - 1, i);
				i = 0;
			}
		}
		return uniteStringsOfList(listOfParagraphs, "\r");
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

	private static int findNumberOfSentences(String text) {

		String sentenceRegex = "[A-Z][^.!?]*[.!?]";

		return separateTextByRegex(text, sentenceRegex).size();
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

	public static String sortWordsOfSentencesByWordsLength(String text) {

		String sentenceRegex = "[A-Z][^.!?]*[.!?]";
		List<String> sentences = separateTextByRegex(text, sentenceRegex);

		for (int i = 0; i < sentences.size(); i++) {

			sentences.set(i, sortWordsByLength(sentences.get(i)));
		}
		return uniteStringsOfList(sentences, ". ");
	}

	public static String sortWordsByLength(String text) {

		String wordRegex = "[a-zA-Z]+\\b";
		List<String> wordlist = separateTextByRegex(text, wordRegex);

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
		return uniteStringsOfList(wordlist, " ");
	}

	public static String sortWordsOfSentencesNumberOfSpecCharOrAlphabet(String text, char ch) {

		String sentenceRegex = "[A-Z][^.!?]*[.!?]";
		List<String> sentences = separateTextByRegex(text, sentenceRegex);

		for (int i = 0; i < sentences.size(); i++) {

			sentences.set(i, sortWordsByNumberOfSpecCharOrAlphabet(sentences.get(i), ch));
		}
		return uniteStringsOfList(sentences, ". ");
	}

	public static String sortWordsByNumberOfSpecCharOrAlphabet(String text, char ch) {

		String wordRegex = "[a-zA-Z]+\\b";
		List<String> wordlist = separateTextByRegex(text, wordRegex);

		String wordA = null;
		String wordB = null;
		int charNumberA = 0;
		int charNumberB = 0;

		for (int i = 1; i < wordlist.size(); i++) {

			wordA = wordlist.get(i - 1);
			wordB = wordlist.get(i);
			charNumberA = countChars(wordA, ch);
			charNumberB = countChars(wordB, ch);

			if (charNumberA < charNumberB || charNumberA == charNumberB && isNeedAlphabetSwap(wordA, wordB)) {
				swapStringInList(wordlist, i - 1, i);
				i = 0;
			}
		}
		return uniteStringsOfList(wordlist, " ");
	}

	private static boolean isNeedAlphabetSwap(String wordA, String wordB) {

		boolean necessityOfSwap = false;

		char[] charsA = wordA.toCharArray();
		char[] charsB = wordB.toCharArray();

		for (int i = 0; i < Math.min(charsA.length, charsB.length); i++) {

			if (Character.toLowerCase(charsA[i]) == Character.toLowerCase(charsB[i])) {
				i++;
				if (charsA.length == i) {
					break;
				}
				if (charsB.length == i) {
					necessityOfSwap = true;
					break;
				}
			}
			if (Character.toLowerCase(charsA[i]) < Character.toLowerCase(charsB[i])) {
				break;
			}
			if (Character.toLowerCase(charsA[i]) > Character.toLowerCase(charsB[i])) {
				necessityOfSwap = true;
				break;
			}
		}
		return necessityOfSwap;
	}

	private static int countChars(String word, char ch) {

		int count = 0;
		char[] wordInChars = word.toCharArray();

		for (char charOfWord : wordInChars) {
			if (charOfWord == ch) {
				count++;
			}
		}
		return count;
	}
}
