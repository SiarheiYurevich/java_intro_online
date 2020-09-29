package by.java_intro_online.mod03.task01_17_strings;

// Replace all occurrences of "word" in a string with "letter"

public class Task02 {
	
	public static void main(String[] args) {
		
	String str = "We have to replace all word Word with letter";
	
	System.out.print(str.replaceAll("word", "letter"));
	
	}

}
