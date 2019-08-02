package by.epam.basicsOfOOP.task5.controller;

import java.util.Scanner;

import by.epam.basicsOfOOP.task5.logic.Logic;
import by.epam.basicsOfOOP.task5.model.entity.FlowerComposition;

/* Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции
 являются цветы и упаковка. */

public class Controller {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String key = "";
		FlowerComposition flowerComposition = new FlowerComposition();
		while (!(key.equals("Y") || key.equals("y"))) {
			System.out.println("-------------------------------------------");
			System.out.println("###########################################");
			System.out.println("-------------------------------------------");
			System.out.println("\t\t***MENU***");
			System.out.println("\t1 - get box list");
			System.out.println("\t2 - add box");
			System.out.println("\t3 - add flower to box");
			System.out.println("\t4 - get flower list");
			System.out.println("\tc - exit");
			switch (key = scanner.nextLine()) {
			case "1":
				System.out.println(Logic.getBoxList(flowerComposition));
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
				Logic.addBox(flowerComposition, scanner.nextLine());
				System.out.println("Do you wish to exit from program[Y/N]?");
				key = scanner.nextLine();
				if (key.equals("Y") || key.equals("y")) {
					scanner.close();
				} else if (!(key.equals("N") || key.equals("n"))) {
					doDefault(key, scanner);
				}
				break;
			case "3":
				System.out.println(
						"Enter the type of box in which you want to add the flower, then the name and color of the flower, correspondingly.");
				Logic.addFlowerToBox(flowerComposition, scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
				System.out.println("Do you wish to exit from program[Y/N]?");
				key = scanner.nextLine();
				if (key.equals("Y") || key.equals("y")) {
					scanner.close();
				} else if (!(key.equals("N") || key.equals("n"))) {
					doDefault(key, scanner);
				}
				break;
			case "4":
				System.out.println("Enter the type of box for which you want to get a list of flowers.");
				System.out.println(Logic.getFlowerList(flowerComposition, scanner.nextLine()));
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
