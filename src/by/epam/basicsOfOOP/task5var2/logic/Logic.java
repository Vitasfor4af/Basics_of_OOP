package by.epam.basicsOfOOP.task5var2.logic;

import by.epam.basicsOfOOP.task5var2.model.entity.Box;
import by.epam.basicsOfOOP.task5var2.model.entity.Gift;
import by.epam.basicsOfOOP.task5var2.model.entity.Sweet;
import by.epam.basicsOfOOP.task5var2.view.TextFormatter;

public class Logic {

	public static void addBoxToList(Gift gift, String type) {
		if (type.matches("\\p{IsLatin}+")) {
			gift.addBox(new Box(type));
		} else {
			throw new IllegalArgumentException("only Latin characters are allowed");
		}
	}

	public static void addSweetToBox(Gift gift, String type, String sweetName) {
		if (type.matches("\\p{IsLatin}+") && sweetName.matches("\\p{IsLatin}+")) {
			gift.getBoxByType(type).addSweet(new Sweet(sweetName));
		} else {
			throw new IllegalArgumentException("only Latin characters are allowed");
		}
	}

	public static String getSweetList(Gift gift, String type) {
		if (!(type.matches("\\p{IsLatin}+"))) {
			throw new IllegalArgumentException("only Latin characters are allowed");
		}
		return TextFormatter.formatSweetList(gift.getBoxByType(type).getSweetList());
	}
}
