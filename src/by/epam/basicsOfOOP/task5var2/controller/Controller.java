package by.epam.basicsOfOOP.task5var2.controller;

import java.util.Scanner;

import by.epam.basicsOfOOP.task5var2.logic.Logic;
import by.epam.basicsOfOOP.task5var2.model.entity.Gift;
import by.epam.basicsOfOOP.task5var2.view.TextFormatter;

/* Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
подарок). Составляющими целого подарка являются сладости и упаковка. */

public class Controller {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String key = "";
		String boxType;
		String sweetName;
		Gift gift = new Gift();
		while (!(key.equals("Y") || key.equals("y"))) {
			System.out.println("-------------------------------------------");
			System.out.println("###########################################");
			System.out.println("-------------------------------------------");
			System.out.println("\t\t***MENU***");
			System.out.println("\t1 - get box list");
			System.out.println("\t2 - add box");
			System.out.println("\t3 - add sweet to box");
			System.out.println("\t4 - get sweet list");
			System.out.println("\tc - exit");
			switch (key = scanner.nextLine()) {
			case "1":
				if (TextFormatter.formatBoxList(gift.getBoxList()).equals("")) {
					System.out.println("Boxes have not been added, add them before displaying them.");
				} else {
					System.out.println(TextFormatter.formatBoxList(gift.getBoxList()));
				}
				System.out.println("Do you wish to exit from program[Y/N]?");
				key = scanner.nextLine();
				if (key.equals("Y") || key.equals("y")) {
					scanner.close();
				} else if (!(key.equals("N") || key.equals("n"))) {
					doDefault(key, scanner);
				}
				break;
			case "2":
				System.out.println("Input box type");
				boxType = scanner.nextLine();
				Logic.addBoxToList(gift, boxType);
				System.out.println("Do you wish to exit from program[Y/N]?");
				key = scanner.nextLine();
				if (key.equals("Y") || key.equals("y")) {
					scanner.close();
				} else if (!(key.equals("N") || key.equals("n"))) {
					doDefault(key, scanner);
				}
				break;
			case "3":
				System.out.println("Input box type");
				boxType = scanner.nextLine();
				System.out.println("Input sweet name");
				sweetName = scanner.nextLine();
				Logic.addSweetToBox(gift, boxType, sweetName);
				System.out.println("Do you wish to exit from program[Y/N]?");
				key = scanner.nextLine();
				if (key.equals("Y") || key.equals("y")) {
					scanner.close();
				} else if (!(key.equals("N") || key.equals("n"))) {
					doDefault(key, scanner);
				}
				break;
			case "4":
				System.out.println("Enter the type of box for which you want to get a list of sweets.");
				boxType = scanner.nextLine();
				System.out.println(Logic.getSweetList(gift, boxType));
				System.out.println("Do you wish to exit from program[Y/N]?");
				key = scanner.nextLine();
				if (key.equals("Y") || key.equals("y")) {
					scanner.close();
				} else if (!(key.equals("N") || key.equals("n"))) {
					doDefault(key, scanner);
				}
				break;
			case "c":
			case "C":
				System.out.println("Exit from program");
				key = "Y";
				if (key.equals("Y")) {
					scanner.close();
				}
				break;
			default:
				doDefault(key, scanner);
				break;
			}
		}
	}

	private static void doDefault(String key, Scanner scanner) {
		System.out.println("Unsupported key was pressed");
		System.out.println("Do you want to go back [Y]?");
		key = scanner.nextLine();
		if (key.equals("Y") || key.equals("y")) {
			return;
		} else if (!(key.equals("Y") || key.equals("y"))) {
			doDefault(key, scanner);
		}
	}
}
