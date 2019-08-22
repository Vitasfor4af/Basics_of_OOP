package by.epam.basicsOfOOP.task4.controller;

import java.util.Scanner;

import by.epam.basicsOfOOP.task4.dao.Dao;
import by.epam.basicsOfOOP.task4.logic.Logic;
import by.epam.basicsOfOOP.task4.model.entity.DragonCave;
import by.epam.basicsOfOOP.task4.view.TextFormatter;

/* Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о
   100 сокровищах в пещере дракона. Реализовать возможность просмотра сокровищ, выбора
   самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму. */

public class Controller {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String key = "";
		DragonCave cave = new DragonCave();
		while (!(key.equals("Y") || key.equals("y"))) {
			System.out.println("-------------------------------------------");
			System.out.println("###########################################");
			System.out.println("-------------------------------------------");
			System.out.println("\t\t***MENU***");
			System.out.println("\t1 - generate treasures");
			System.out.println("\t2 - get treasures list");
			System.out.println("\t3 - get the most expensive treasure");
			System.out.println("\t4 - get treasures for a given price");
			System.out.println("\tc - exit");
			switch (key = scanner.nextLine()) {
			case "1":
				Dao.treasureGenerator(cave);
				System.out.println("Treasures have been added");
				System.out.println("Do you wish to exit from program[Y/N]?");
				key = scanner.nextLine();
				if (key.equals("Y") || key.equals("y")) {
					scanner.close();
				} else if (!(key.equals("N") || key.equals("n"))) {
					doDefault(key, scanner);
				}
				break;
			case "2":
				if (TextFormatter.format(cave.getTreasureList()).equals("")) {
					System.out.println("Treasures have not been added, generate them before displaying them.");
				} else {
					System.out.println(TextFormatter.format(cave.getTreasureList()));
				}
				System.out.println("Do you wish to exit from program[Y/N]?");
				key = scanner.nextLine();
				if (key.equals("Y") || key.equals("y")) {
					scanner.close();
				} else if (!(key.equals("N") || key.equals("n"))) {
					doDefault(key, scanner);
				}
				break;
			case "3":
				System.out.println(Logic.getMostExpensiveTreasure(cave));
				System.out.println("Do you wish to exit from program[Y/N]?");
				key = scanner.nextLine();
				if (key.equals("Y") || key.equals("y")) {
					scanner.close();
				} else if (!(key.equals("N") || key.equals("n"))) {
					doDefault(key, scanner);
				}
				break;
			case "4":
				System.out.println("Input price");
				System.out.println(TextFormatter.format(Dao.getTreasureByPrice(scanner.nextLong())));
				scanner.nextLine();
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
