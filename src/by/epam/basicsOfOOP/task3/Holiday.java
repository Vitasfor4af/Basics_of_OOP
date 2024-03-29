package by.epam.basicsOfOOP.task3;

public class Holiday {
	private String holidayName;
	private String description;
	private String date;

	public Holiday(String date) {
		this.holidayName = "Weekend";
		this.description = "weekend";
		if (isValidDate(date)) {
			this.date = date;
		} else {
			throw new IllegalArgumentException("invalid date value");
		}
	}

	public Holiday(String holidayName, String description, String date) {
		this.holidayName = holidayName;
		this.description = description;
		if (isValidDate(date)) {
			this.date = date;
		} else {
			throw new IllegalArgumentException("invalid date value");
		}
	}

	private static boolean isValidDate(String date) {
		boolean result = true;
		if (date == null || !date.matches("[0-3]\\d/[0-1]\\d/\\d{4}")) {
			result = false;
		}
		return result;
	}

	public String getHolidayName() {
		return holidayName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((holidayName == null) ? 0 : holidayName.hashCode());
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
		Holiday other = (Holiday) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (holidayName == null) {
			if (other.holidayName != null)
				return false;
		} else if (!holidayName.equals(other.holidayName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Holiday [holidayName=" + holidayName + ", description=" + description + ", date=" + date + "]";
	}
}
