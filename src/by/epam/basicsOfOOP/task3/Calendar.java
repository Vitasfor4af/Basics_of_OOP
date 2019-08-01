package by.epam.basicsOfOOP.task3;

import java.util.ArrayList;

public class Calendar {
	private int year;
	private String ZodiacSign;

	public Calendar(int year, String zodiacSign) {
		this.year = year;
		ZodiacSign = zodiacSign;
	}

	public static class Repository {
		ArrayList<Holiday> holidayList = new ArrayList<Holiday>();

		public void addHoliday(Holiday holiday) {
			if (holiday != null) {
				holidayList.add(holiday);
			}
		}

		public void removeHoliday(Holiday holiday) {
			if (holiday != null) {
				holidayList.remove(holiday);
			}
		}

		public Holiday getHolidayByName(String name) {
			Holiday holiday = null;
			if (name != null) {
				for (int i = 0; i < holidayList.size(); i++) {
					if (holidayList.get(i).getHolidayName().equals(name)) {
						holiday = holidayList.get(i);
						break;
					}
				}
			}
			return holiday;
		}

		public ArrayList<Holiday> getHolidayList() {
			return holidayList;
		}

		public void setHolidayList(ArrayList<Holiday> holidayList) {
			this.holidayList = holidayList;
		}

		@Override
		public String toString() {
			return "Repository [holidayList=" + holidayList + "]";
		}
	}

	public int getYear() {
		return year;
	}

	public String getZodiacSign() {
		return ZodiacSign;
	}
}
