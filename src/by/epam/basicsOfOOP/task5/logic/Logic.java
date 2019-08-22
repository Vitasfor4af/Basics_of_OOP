package by.epam.basicsOfOOP.task5.logic;

import by.epam.basicsOfOOP.task5.model.entity.Box;
import by.epam.basicsOfOOP.task5.model.entity.Flower;
import by.epam.basicsOfOOP.task5.model.entity.FlowerComposition;
import by.epam.basicsOfOOP.task5.view.TextFormatter;

public class Logic {

	public static void addBoxToList(FlowerComposition flowerComposition, String type) {
		if (type.matches("\\p{IsLatin}+")) {
			addBox(flowerComposition, new Box(type));
		} else {
			throw new IllegalArgumentException("only Latin characters are allowed");
		}
	}

	public static void addFlowerToBox(FlowerComposition flowerComposition, String type, String flowerName,
			String flowerColor) {
		if (type.matches("\\p{IsLatin}+") && flowerName.matches("\\p{IsLatin}+")
				&& flowerColor.matches("\\p{IsLatin}+")) {
			addFlower(getBoxByType(flowerComposition, type), new Flower(flowerName, flowerColor));
		} else {
			throw new IllegalArgumentException("only Latin characters are allowed");
		}
	}

	public static void addBox(FlowerComposition flowerComposition, Box box) {
		if (box != null) {
			flowerComposition.getBoxList().add(box);
		}
	}

	public static void removeBox(FlowerComposition flowerComposition, Box box) {
		if (box != null) {
			flowerComposition.getBoxList().remove(box);
		}
	}

	public static Box getBoxByType(FlowerComposition flowerComposition, String type) {
		Box box = null;
		if (type != null) {
			for (int i = 0; i < flowerComposition.getBoxList().size(); i++) {
				if (flowerComposition.getBoxList().get(i).getType().equals(type)) {
					box = flowerComposition.getBoxList().get(i);
					break;
				}
			}
		}
		return box;
	}

	public static void addFlower(Box box, Flower flower) {
		if (flower != null) {
			box.getFlowerList().add(flower);
		}
	}

	public static void removeFlower(Box box, Flower flower) {
		if (flower != null) {
			box.getFlowerList().remove(flower);
		}
	}

	public static Flower getFlowerByName(Box box, String name) {
		Flower flower = null;
		if (name != null) {
			for (int i = 0; i < box.getFlowerList().size(); i++) {
				if (box.getFlowerList().get(i).getName().equals(name)) {
					flower = box.getFlowerList().get(i);
					break;
				}
			}
		}
		return flower;
	}

	public static String getFlowerList(FlowerComposition flowerComposition, String type) {
		if (!(type.matches("\\p{IsLatin}+"))) {
			throw new IllegalArgumentException("only Latin characters are allowed");
		}
		return TextFormatter.formatFlowerList(getBoxByType(flowerComposition, type).getFlowerList());
	}

}
