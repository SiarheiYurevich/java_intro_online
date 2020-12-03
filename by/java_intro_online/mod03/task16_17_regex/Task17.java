package by.java_intro_online.mod03.task16_17_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Given the string contains following text (XML document):
 * 
 * <notes>
 * 	 <note id = '1'>
 * 		<to>Vasily</to>
 * 		<from>Sveta</from>
 * 		<heading>Reminder</heading>
 * 		<body>Call me tomorrow!</body>
 * 	 </note>
 *   <note id = '2'>
 * 		<to>Petr</to>
 * 		<from>Maria</from>
 * 		<heading>Important reminder</heading>
 * 		</body>
 * 	 </note>
 * </notes>
 * 
 * Write parser that alloys you consistently return content of XML nodes and its type 
 * (start tag, end tag, content, empty tag).
 * Do not use library XML parsers. 
 */

public class Task17 {

	public static void main(String[] args) {

		String text = "<notes>" + 
				" <note id = '1'>" + 
				" 		<to>Vasily</to>" + 
				"  		<from>Sveta</from>" + 
				"  		<heading>Reminder</heading>" + 
				"  		<body>Call me tomorrow!</body>" + 
				"  	 </note>" + 
				"    <note id = '2'>" + 
				"  		<to>Petr</to>" + 
				"  		<from>Maria</from>" + 
				"  		<heading>Important reminder</heading>" + 
				"  		</body>" + 
				"  	 </note>" + 
				"  </notes>";
		
		System.out.println(readNoteContent(text));
	}
	
	public static String readNotes(String xmlDoc) {
		
		StringBuilder notes = new StringBuilder();
		
		Pattern pattern = Pattern.compile("<note id = '" + findNoteAndReturnId(xmlDoc) + "'>.+</note>");
		Matcher matcher = pattern.matcher(xmlDoc);
		
		while (matcher.find()) {
			
			notes.append("note id: " + findNoteAndReturnId(xmlDoc) + "\n");
			notes.append(readNoteContent(matcher.group()));
		}
		
		return notes.toString();
		
	}
	
	public static String readNote(String xmlText) {
		
		String start = "<note id = '" + findNoteAndReturnId(xmlText) + "'>";
		String contentRegex = ".+";
		String end = "</note>";
		
		return findContent(xmlText, start, contentRegex, end);
	}
	
	public static String readNoteContent(String xmlText) {
		
		StringBuilder note = new StringBuilder();
		
		note.append("recipient: " + readTag(xmlText, "to") + "\n");
		note.append("sendert: " + readTag(xmlText, "from") + "\n");
		note.append("heading: " + readTag(xmlText, "heading") + "\n");
		note.append("body: " + readTag(xmlText, "body") + "\n");

		return note.toString();
		
	}
	
/*
	// notes reading
	public static String readNotes(String inputXmlNotesDoc) {

		StringBuilder outputNotes = new StringBuilder();

		// reading note id

		Pattern patternId = Pattern.compile("<note id = '[0-9]+'>");
		Matcher matcherId = patternId.matcher(inputXmlNotesDoc);
		String id = "note id ";
		int idBegin = 12;
		int idEnd = 2;
		int idLength = 0;

		if (matcherId.find()) {
			idLength = matcherId.group().length() - idEnd;
			id += matcherId.group().substring(idBegin, idLength) + "/n";
			outputNotes.append(id);
		}

		// recipient
		Pattern patternRecipient = Pattern.compile("<to>[a-zA-Z]+</to>");
		Matcher matcherRecipient = patternRecipient.matcher(inputXmlNotesDoc);
		String recipient = "recipient ";
		int recBegin = 4;
		int recEnd = 5;
		int recLength = 0;

		if (matcherRecipient.find()) {
			recLength = matcherRecipient.group().length() - recEnd;
			recipient += matcherRecipient.group().substring(recBegin, recLength) + "/n";
			outputNotes.append(recipient);
		}

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
		return xmlOutputNotesDoc;
	}*/

	public static String readTag(String xmlText, String tagName) {

		String start = "<" + tagName + ">";
		String contentRegex = ".[^<]+";
		String end = "</" + tagName + ">";
		
		return findContent(xmlText, start, contentRegex, end);
	}
	
	public static String findNoteAndReturnId(String xmlText) {

		String start = "<note id = '";
		String contentRegex = "[0-9]+";
		String end = "'>";
		
		return findContent(xmlText, start, contentRegex, end);
	}
	
	public static String findContent(String xmlText, String tagStart, String contentRegex, String tagEnd) {

		String content = null;
		String regex = tagStart + contentRegex + tagEnd;
		
		Pattern patternTag = Pattern.compile(regex);
		Matcher matcherTag = patternTag.matcher(xmlText);
		
		int startLength = tagStart.length();
		int endLength = tagEnd.length();
		int contentLength = 0;

		if (matcherTag.find()) {
			contentLength = matcherTag.group().length() - endLength;
			content = matcherTag.group().substring(startLength, contentLength);
		} else {
			content = "not found!";
		}
		return content;
	}
}
