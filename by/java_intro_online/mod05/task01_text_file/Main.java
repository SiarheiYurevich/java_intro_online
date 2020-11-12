package by.java_intro_online.mod05.task01_text_file;

/* Create an object of TextFile class using classes File and Directory.
 * Methods: create, rename, output, append, remove.
 */

public class Main {

	public static void main(String[] args) {

		TextFile file = new TextFile("File1", "Text of File1.");
		TextFile file2 = new TextFile("File2", "Text of File2.");

		TextFileLogic.append(file, "Additional text which can be appended.");
		TextFileLogic.append(file, file2);

		Directory dir = new Directory("dir1");

		DirectoryLogic.add(dir);
		DirectoryLogic.add(dir);
		DirectoryLogic.addFile(dir, file);
		DirectoryLogic.addFile(dir, file2);
		DirectoryLogic.addFile(dir);

		View.output(file);
		View.output(dir);
	}
}
