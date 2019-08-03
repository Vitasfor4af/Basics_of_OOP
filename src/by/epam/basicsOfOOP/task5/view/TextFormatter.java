package by.epam.basicsOfOOP.task5.view;

import java.util.ArrayList;

import by.epam.basicsOfOOP.task5.model.entity.Box;
import by.epam.basicsOfOOP.task5.model.entity.Flower;

public class TextFormatter {
	
	public static String formatFlowerList(ArrayList<Flower> flowerList) {
		String str = "";
		for (int i = 0; i < flowerList.size(); i++) {
			str += flowerList.get(i) + "\n";
		}
		return str;
	}

	public static String formatBoxList(ArrayList<Box> boxList) {
		String str = "";
		for (int i = 0; i < boxList.size(); i++) {
			str += boxList.get(i) + "\n";
		}
		return str;
	}
}
