package by.epam.basicsOfOOP.task4.controller;

import java.util.Scanner;
import by.epam.basicsOfOOP.task4.logic.Logic;
import by.epam.basicsOfOOP.task4.model.entity.DragonCave;

/* Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о
   100 сокровищах в пещере дракона. Реализовать возможность просмотра сокровищ, выбора
   самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму. */

public class Controller {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String key = "";
		DragonCave cave = new DragonCave();
		Logic.treasureGenerator(cave);
		while (!(key.equals("Y") || key.equals("y"))) {
			System.out.println("-------------------------------------------");
			System.out.println("###########################################");
			System.out.println("-------------------------------------------");
			System.out.println("\t\t***MENU***");
			System.out.println("\t1 - get treasures list");
			System.out.println("\t2 - get the most expensive treasure");
			System.out.println("\t3 - get treasures for a given price");
			System.out.println("\tc - exit");
			switch (key = scanner.nextLine()) {
			case "1":
				System.out.println(Logic.getTreasureList(cave));
				System.out.println("Do you wish to exit from program[Y/N]?");
				key = scanner.nextLine();
				if (key.equals("Y") || key.equals("y")) {
					scanner.close();
				} else if (!(key.equals("N") || key.equals("n"))) {
					doDefault(key, scanner);
				}
				break;
			case "2":
				System.out.println(Logic.getMostExpensiveTreasure(cave));
				System.out.println("Do you wish to exit from program[Y/N]?");
				key = scanner.nextLine();
				if (key.equals("Y") || key.equals("y")) {
					scanner.close();
				} else if (!(key.equals("N") || key.equals("n"))) {
					doDefault(key, scanner);
				}
				break;
			case "3":
				System.out.println("Input price");
				System.out.println(Logic.getTreasureByPrice(cave, scanner.nextLong()));
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
		System.out.println("Do you wish to exit from program[Y/N]?");
		key = scanner.nextLine();
		if (key.equals("Y")) {
			scanner.close();
		} else if (!(key.equals("N") || key.equals("n"))) {
			doDefault(key, scanner);
		}
	}
}
