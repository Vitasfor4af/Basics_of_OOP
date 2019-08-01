package by.epam.basicsOfOOP.task3;

import by.epam.basicsOfOOP.task3.Calendar.Repository;

/* Создать класс Календарь с внутренним классом, с помощью 
   объектов которого можно хранить информацию о выходных и праздничных днях. */

public class Main {

	public static void main(String[] args) {
		Repository repository = new Repository();
		repository.addHoliday(new Holiday("Christmas", "share gifts", "31/05/2019"));
		System.out.println(repository.getHolidayByName("Christmas").getDate());
		repository.addHoliday(new Holiday("12/03/2019"));
		System.out.println(repository.getHolidayList());
	}

}
