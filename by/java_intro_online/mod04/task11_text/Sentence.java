package by.java_intro_online.mod04.task11_text;

public class Sentence {

	private String sentence;

	public Sentence() {
	}

	public Sentence(String sentence) {
		this.sentence = sentence;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public void addSentence(Sentence sentence) {
		this.sentence += sentence;
	}

	public void addString(String string) {
		this.sentence += string;
	}

	@Override
	public String toString() {
		return "Sentence [ " + sentence + " ]";
	}

}
