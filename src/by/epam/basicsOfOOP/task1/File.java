package by.epam.basicsOfOOP.task1;

public class File {
	private String name;
	private byte[] bodyText;

	public File(String name) {	
		if (name.matches("^\\w+\\.[a-z]{2,4}$")) {
			this.name = name;
		} else {
			throw new IllegalAccessError("invalid file name");
		}
	}

	public void add(String text) {
		this.bodyText = text.getBytes();			
	}
	
	public void remove() {
		this.bodyText = null;
	}
	
	public String output() {
		return new String(bodyText);
	}
	
	public String getFileName() {
		return name;
	}

	public void setFileName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		File other = (File) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "File [name=" + name + "]";
	}
}
