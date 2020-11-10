package by.java_intro_online.mod05.task01_text_file;

/* Create an object of TextFile class using classes File and Directory.
 * Methods: create, rename, output, append, remove.
 */

import java.util.List;
import java.util.ArrayList;

public class Directory {

	private String name;
	private List<Directory> dir;
	private List<File> files;

	{
		dir = new ArrayList<Directory>();
		files = new ArrayList<File>();
	}

	public Directory() {
	}

	public Directory(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Directory> getDir() {
		return dir;
	}

	public void setDir(ArrayList<Directory> dir) {
		this.dir = dir;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(ArrayList<File> files) {
		this.files = files;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dir == null) ? 0 : dir.hashCode());
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		if (dir == null) {
			if (other.dir != null)
				return false;
		} else if (!dir.equals(other.dir))
			return false;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Directory [ name = " + name + ", dir = " + dir + ", files = " + files + "]";
	}

}
