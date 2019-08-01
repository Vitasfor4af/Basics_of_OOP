package by.epam.basicsOfOOP.task1;

public class Directory {
	private final int DEFAULT = 5;
	private String name;
	private File[] files;

	{
		files = new File[DEFAULT];
	}

	public Directory(String name) {
		this.name = name;
	}

	public void addFile(File file) {
		if (file != null) {
			for (int i = 0; i < files.length; i++) {
				if (files[i] == null) {
					files[i] = file;
					break;
				}
			}
		}
	}
	
	public void addFile(TextFile file) {
		if (file != null) {
			for (int i = 0; i < files.length; i++) {
				if (files[i] == null) {
					files[i] = file;
					break;
				}
			}
		}
	}

	public void removeFile(File file) {
		if (file != null) {
			for (int i = 0; i < files.length; i++) {
				if (files[i] != null && files[i].equals(file)) {
					files[i] = null;
					break;
				}
			}
		}
	}
	
	public void removeFile(TextFile file) {
		if (file != null) {
			for (int i = 0; i < files.length; i++) {
				if (files[i] != null && files[i].equals(file)) {
					files[i] = null;
					break;
				}
			}
		}
	}

	public File getFileByName(String name) {
		File file = null;
		if (name != null) {
			for (int i = 0; i < files.length; i++) {
				if (files[i].getFileName().equals(name)) {
					file = files[i];
					break;
				}
			}
		}
		return file;
	}

	public TextFile getTextFileByName(String name) {
		TextFile textFile = null;
		if (name != null) {
			for (int i = 0; i < files.length; i++) {
				if (files[i].getFileName().equals(name)) {
					textFile = (TextFile) files[i];
					break;
				}
			}
		}
		return textFile;
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
