package by.java_intro_online.mod04.task11_text;

public class Text {

	private Word headline;
	private Sentence text;

	public Text() {
	}

	public Text(Word headline, Sentence text) {
		this.headline = headline;
		this.text = text;
	}

	public Word getHeadline() {
		return headline;
	}

	public void setHeadline(Word headline) {
		this.headline = headline;
	}

	public Sentence getText() {
		return text;
	}

	public void setText(Sentence text) {
		this.text = text;
	}

	public void addSentence(Sentence additionalText) {
		this.text.addString(additionalText.getSentence());
	}

	public void addString(String string) {
		this.text.addString(string);
	}

	public void outputText() {
		System.out.println("Text: " + text.getSentence());
	}

	public void outputHeadline() {
		System.out.println("Headline: " + headline.getWord());
	}

	@Override
	public String toString() {
		return "Text [ headline " + headline + ", text " + text + " ]";
	}
}