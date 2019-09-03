package by.epam.basicsOfOOP.task4.logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static by.epam.basicsOfOOP.task4.dao.Dao.FILE_PATH;
import by.epam.basicsOfOOP.task4.model.entity.DragonCave;
import by.epam.basicsOfOOP.task4.model.entity.Treasure;

public class Logic {

	public static void addTreasures(DragonCave cave) {
		String line = "";
		try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
			while ((line = br.readLine()) != null) {
				cave.addTreasure(new Treasure(line.substring(0, line.lastIndexOf(" ")),
						Long.parseLong(line.substring(line.lastIndexOf(" ") + 1))));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

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
