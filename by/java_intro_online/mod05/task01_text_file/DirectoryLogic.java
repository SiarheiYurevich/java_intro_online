package by.java_intro_online.mod05.task01_text_file;

/* Create an object of TextFile class using classes File and Directory.
 * Methods: create, rename, output, append, remove.
 */

public class DirectoryLogic {

	public static void add(Directory sourceDir) {

		Directory dir = new Directory(generateDirName(sourceDir));

		sourceDir.getDir().add(dir);
	}

	public static void add(Directory sourceDir, Directory dir) {

		sourceDir.getDir().add(dir);
	}

	public static void remove(Directory sourceDir, Directory dir) {

		sourceDir.getDir().remove(dir);
	}

	public static void remove(Directory dir, String dirName) {

		for (Directory d : dir.getDir()) {
			if (d.getName().equals(dirName)) {
				dir.getDir().remove(d);
			}
		}
	}

	public static void addFile(Directory dir) {

		File file = new File(generateFileName(dir));

		dir.getFiles().add(file);
	}

	public static void addFile(Directory dir, File file) {

		dir.getFiles().add(file);
	}

	public static void removeFile(Directory dir, File file) {

		dir.getFiles().remove(file);
	}

	public static void removeFile(Directory dir, String fileName) {

		for (File f : dir.getFiles()) {
			if (f.getName().equals(fileName)) {
				dir.getFiles().remove(f);
			}
		}
	}

	private static String generateDirName(Directory dir) {

		String newName = "New directory";
		int numberOfNewDir = 0;

		while (hasName(dir, newName)) {
			numberOfNewDir++;
			newName = "New directory(" + numberOfNewDir + ")";
		}
		return newName;
	}

	private static String generateFileName(Directory dir) {

		String newName = "New file";
		int numberOfNewDir = 0;

		while (hasName(dir, newName)) {
			numberOfNewDir++;
			newName = "New file(" + numberOfNewDir + ")";
		}
		return newName;
	}

	private static boolean hasName(Directory dir, String name) {

		for (Directory d : dir.getDir()) {
			if (d.getName().equals(name)) {
				return true;
			}
		}

		for (File f : dir.getFiles()) {
			if (f.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

}
