package by.epam.basicsOfOOP.task1;

import java.util.ArrayList;

public class Directory {

	private String name;
	ArrayList<File> fileList = new ArrayList<File>();

	public Directory(String name) {
		if (name.matches("\\p{Upper}:(/\\w+)+")) {
			this.name = name;
		} else {
			throw new IllegalAccessError("Invalid path of directory");
		}
	}

	public File createFile(String name) {
		if (name != null) {
			return new File(name);
		}
		return null;
	}

	public void addFile(File file) {
		if (file != null) {
			fileList.add(file);
		}
	}

	public void removeFile(File file) {
		if (file != null) {
			fileList.remove(file);
		}
	}

	public File getFileByName(String name) {
		File file = null;
		if (name != null) {
			for (int i = 0; i < fileList.size(); i++) {
				if (fileList.get(i).getFileName().equals(name)) {
					file = fileList.get(i);
					break;
				}
			}
		}
		return file;
	}

	public String getDirectoryName() {
		return name;
	}

	public void setDirectoryName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Directory [name=" + name + "]";
	}
}
