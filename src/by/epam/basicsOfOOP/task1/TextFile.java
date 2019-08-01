package by.epam.basicsOfOOP.task1;

public class TextFile extends File {
	private String bodyText;

	{
		bodyText = "";
	}

	public TextFile(String name) {
		super(name);
	}

	public void addContent(String text) {
		bodyText += text + "\n";
	}

	public void deleteContent() {
		bodyText = "";
	}

	public String outputText() {
		return bodyText;
	}
}
