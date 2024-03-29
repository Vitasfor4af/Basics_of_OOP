package by.epam.basicsOfOOP.task5.logic;

import by.epam.basicsOfOOP.task5.model.entity.Box;
import by.epam.basicsOfOOP.task5.model.entity.Flower;
import by.epam.basicsOfOOP.task5.model.entity.FlowerComposition;
import by.epam.basicsOfOOP.task5.view.TextFormatter;

public class Logic {

	public static void addBoxToList(FlowerComposition flowerComposition, String type) {
		if (type.matches("\\p{IsLatin}+")) {
			flowerComposition.addBox(new Box(type));
		} else {
			throw new IllegalArgumentException("only Latin characters are allowed");
		}
	}

	public static void addFlowerToBox(FlowerComposition flowerComposition, String type, String flowerName,
			String flowerColor) {
		if (type.matches("\\p{IsLatin}+") && flowerName.matches("\\p{IsLatin}+")
				&& flowerColor.matches("\\p{IsLatin}+")) {
			flowerComposition.getBoxByType(type).addFlower(new Flower(flowerName, flowerColor));
		} else {
			throw new IllegalArgumentException("only Latin characters are allowed");
		}
	}

	public static String getFlowerList(FlowerComposition flowerComposition, String type) {
		if (!(type.matches("\\p{IsLatin}+"))) {
			throw new IllegalArgumentException("only Latin characters are allowed");
		}
		return TextFormatter.formatFlowerList(flowerComposition.getBoxByType(type).getFlowerList());
	}

}
