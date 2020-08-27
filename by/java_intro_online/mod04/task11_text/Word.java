package by.java_intro_online.mod04.task11_text;

public class Word {

	private String word;

	public Word() {
	}

	public Word(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "Word [" + word + " ]";
	}

}
