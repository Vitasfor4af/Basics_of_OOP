package by.epam.basicsOfOOP.task4.logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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

	public static ArrayList<Treasure> getTreasureByPrice(DragonCave cave, long price) {
		ArrayList<Treasure> newTreasureList = new ArrayList<Treasure>();
		for (int i = 0; i < cave.getTreasureList().size(); i++) {
			if (cave.getTreasureList().get(i).getPrice() == price) {
				newTreasureList.add(cave.getTreasureByName(cave.getTreasureList().get(i).getName()));
			}
		}
		return newTreasureList;
	}

	public static ArrayList<Treasure> treasureGenerator(DragonCave cave) {
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("resources/treasureList"));
			while ((line = br.readLine()) != null) {
				cave.addTreasure(new Treasure(line.substring(0, line.lastIndexOf(" ")),
						Long.parseLong(line.substring(line.lastIndexOf(" ") + 1))));
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cave.getTreasureList();
	}
}
