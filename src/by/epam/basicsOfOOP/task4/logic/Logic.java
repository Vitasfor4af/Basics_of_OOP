package by.epam.basicsOfOOP.task4.logic;

import by.epam.basicsOfOOP.task4.model.entity.DragonCave;

public class Logic {

	public static String getMostExpensiveTreasure(DragonCave cave) {
		long max = cave.getTreasureList().get(0).getPrice();
		for (int i = 0; i < cave.getTreasureList().size(); i++) {
			if (cave.getTreasureList().get(i).getPrice() > max) {
				max = cave.getTreasureList().get(i).getPrice();
			}
		}
		for (int i = 0; i < cave.getTreasureList().size(); i++) {
			if (cave.getTreasureList().get(i).getPrice() == max) {
				return cave.getTreasureList().get(i).getName();
			}
		}
		return "Treasures not found";
	}
}
