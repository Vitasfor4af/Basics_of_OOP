package by.epam.basicsOfOOP.task4.logic;

import by.epam.basicsOfOOP.task4.model.entity.DragonCave;
import by.epam.basicsOfOOP.task4.model.entity.Treasure;

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
		return "There are no treasures in the cave";
	}

	public static void addTreasure(DragonCave cave, Treasure treasure) {
		if (treasure != null) {
			cave.getTreasureList().add(treasure);
		}
	}

	public static void removeTreasure(DragonCave cave, Treasure treasure) {
		if (treasure != null) {
			cave.getTreasureList().remove(treasure);
		}
	}

	public static Treasure getTreasureByName(DragonCave cave, String name) {
		Treasure treasure = null;
		if (name != null) {
			for (int i = 0; i < cave.getTreasureList().size(); i++) {
				if (cave.getTreasureList().get(i).getName().equals(name)) {
					treasure = cave.getTreasureList().get(i);
					break;
				}
			}
		}
		return treasure;
	}
}
