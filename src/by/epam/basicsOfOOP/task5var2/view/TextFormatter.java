package by.epam.basicsOfOOP.task5var2.view;

import java.util.ArrayList;

import by.epam.basicsOfOOP.task5var2.model.entity.Box;
import by.epam.basicsOfOOP.task5var2.model.entity.Sweet;

public class TextFormatter {
	
	public static String formatSweetList(ArrayList<Sweet> sweetList) {
		String str = "";
		for (int i = 0; i < sweetList.size(); i++) {
			str += sweetList.get(i) + "\n";
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
