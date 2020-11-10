package by.java_intro_online.mod05.task01_text_file;

/* Create an object of TextFile class using classes File and Directory.
 * Methods: create, rename, output, append, remove.
 */

public class View {

	public static void output(TextFile file) {

		System.out.println(file.toString());
		System.out.println();
	}

	public static void output(Directory dir) {

		System.out.println(dir.getName() + " content:");

		for (Directory d : dir.getDir()) {
			System.out.println("<dir> " + d.getName());
		}

		for (File f : dir.getFiles()) {
			System.out.println("<file> " + f.getName());
		}
	}
}
