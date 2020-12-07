package by.java_intro_online.mod03.task16_17_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Given the string contains text (XML document).
 * Write parser that alloys you consistently return content of XML nodes and its type 
 * (start tag, end tag, content, empty tag).
 * Do not use library XML parsers. 
 */

public class Task17 {

	public static void main(String[] args) {

		String text = "<notes>"
					+ "  <note id = '1'>"
					+ " 	<to>Vasily</to>"
					+ "  	<from>Sveta</from>"
					+ "  	<heading>Reminder</heading>"
					+ "  	<body>Call me tomorrow!</body>"
					+ "  </note>"
					+ "  <note id = '2'>"
					+ "  	<to>Petr</to>"
					+ "  	<from>Maria</from>"
					+ "  	<heading>Important reminder</heading>"
					+ "  	</body>"
					+ "  </note>"
					+ "</notes>";

		System.out.println(readNotes(text));
	}

	public static String readNotes(String xmlDoc) {

		StringBuilder notes = new StringBuilder();

		String idRegex = "<note id = '[0-9]+'>";
		Pattern patternId = Pattern.compile(idRegex);
		Matcher matcherId = patternId.matcher(xmlDoc);

		while (matcherId.find()) {

			Pattern patternNote = Pattern.compile("<note id = '" + readId(matcherId.group()) + "'>.+[</note>]");
			Matcher matcherNote = patternNote.matcher(xmlDoc);

			while (matcherNote.find()) {

				notes.append("note id: " + readId(matcherId.group()) + "\n");
				notes.append(readNoteContent(matcherNote.group()) + "\n");
			}
		}
		return notes.toString();

	}

	public static String readNoteContent(String xmlText) {

		StringBuilder note = new StringBuilder();

		note.append("to: " + readTag(xmlText, "to") + "\n");
		note.append("from: " + readTag(xmlText, "from") + "\n");
		note.append("heading: " + readTag(xmlText, "heading") + "\n");
		note.append("body: " + readTag(xmlText, "body") + "\n");

		return note.toString();

	}

	public static String readId(String xmlText) {

		String start = "<note id = '";
		String contentRegex = "[0-9]+";
		String end = "'>";

		return readContent(xmlText, start, contentRegex, end);
	}

	public static String readTag(String xmlText, String tagName) {

		String start = "<" + tagName + ">";
		String contentRegex = ".[^<]+";
		String end = "</" + tagName + ">";

		return readContent(xmlText, start, contentRegex, end);
	}

	public static String readContent(String xmlText, String tagStart, String contentRegex, String tagEnd) {

		String content = null;
		String regex = tagStart + contentRegex + tagEnd;

		Pattern patternTag = Pattern.compile(regex);
		Matcher matcherTag = patternTag.matcher(xmlText);

		int start = tagStart.length();
		int end = tagEnd.length();
		int contentLength = 0;

		if (matcherTag.find()) {
			contentLength = matcherTag.group().length() - end;
			content = matcherTag.group().substring(start, contentLength);
		} else {
			content = "not found!";
		}
		return content;
	}
}
