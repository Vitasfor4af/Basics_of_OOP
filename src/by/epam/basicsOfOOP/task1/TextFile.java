package by.epam.basicsOfOOP.task1;

public class TextFile extends File {
	private String bodyText;

	{
		bodyText = "";
	}

	public TextFile(String name) {
		super(name);
		if (name.matches("^\\w+\\.(txt)$")) {
			setFileName(name);
		} else {
			throw new IllegalAccessError("invalid file name for text file");
		}
	}

	public void add(String text) {
		bodyText += text + "\n";
	}

	public void remove() {
		bodyText = "";
	}

	public String output() {
		return bodyText;
	}
}
