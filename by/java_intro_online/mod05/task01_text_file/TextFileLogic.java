package by.java_intro_online.mod05.task01_text_file;

/* Create an object of TextFile class using classes File and Directory.
 * Methods: create, rename, output, append, remove.
 */

public class TextFileLogic {

	public static void rename(TextFile file, String newName) {

		file.setName(newName);
	}

	public static void append(TextFile file, String text) {

		file.setText(file.getText() + " " + text);
	}

	public static void append(TextFile file1, TextFile file2) {

		file1.setText(file1.getText() + " " + file2.getText());
	}
}
