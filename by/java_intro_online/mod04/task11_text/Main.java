package by.java_intro_online.mod04.task11_text;

public class Main {
	
	public static void main(String[] args) {
		
		Text text = new Text();
		Word headline = new Word("Test_1");
		Sentence firstSentence = new Sentence("This is first sentence of the text_1. ");
		Sentence secondSentence = new Sentence("This is second sentence of the text_1. ");
		String string = new String("This is the third sentence of the text_1. ");
		
		//using StringBuilder
		text.setHeadline(headline);
		text.setText(firstSentence);
		text.addSentence(secondSentence);
		text.addString(string);
		
		text.outputHeadline();
		text.outputText();
		
	}

}
