package by.epam.basicsOfOOP.task4.view;

import java.util.List;

import by.epam.basicsOfOOP.task4.model.entity.Treasure;

public class TextFormatter {

	public static String format(List<Treasure> treasureList) {
		String str = "";
		for (int i = 0; i < treasureList.size(); i++) {
			str += treasureList.get(i) + "\n";
		}
		return str;
	}
}
