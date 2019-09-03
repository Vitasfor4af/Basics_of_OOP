package by.epam.basicsOfOOP.task4.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import by.epam.basicsOfOOP.task4.model.entity.Treasure;

public class Dao {

	public static final String FILE_PATH = "src/by/epam/basicsOfOOP/task4/resources/treasureList";

	public static ArrayList<Treasure> getTreasureByPrice(long price) {
		ArrayList<Treasure> treasureList = null;
		try {
			Scanner scanner = new Scanner(new File(FILE_PATH));
			scanner.useDelimiter("\\n");
			treasureList = new ArrayList<Treasure>();
			while (scanner.hasNext()) {
				String line = scanner.next();

				String name = line.substring(0, line.lastIndexOf(" "));
				long priceCompare = Long.parseLong(line.substring(line.lastIndexOf(" ") + 1));

				if (priceCompare == price) {
					Treasure treasure = new Treasure();
					treasure.setName(name);
					treasure.setPrice(priceCompare);
					treasureList.add(treasure);
				}
			}
			scanner.close();
		} catch (FileNotFoundException | NumberFormatException e) {
			e.printStackTrace();
		}
		return treasureList;
	}
}
