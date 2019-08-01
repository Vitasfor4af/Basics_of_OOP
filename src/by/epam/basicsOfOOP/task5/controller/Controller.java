package by.epam.basicsOfOOP.task5.controller;

import java.util.Scanner;

import by.epam.basicsOfOOP.task5.model.entity.Box;
import by.epam.basicsOfOOP.task5.model.entity.Flower;
import by.epam.basicsOfOOP.task5.model.entity.FlowerComposition;
import by.epam.basicsOfOOP.task5.view.TextFormatter;

/* Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции
 являются цветы и упаковка. */

public class Controller {

	public static void main(String[] args) {
		String type;
		String name = "";
		String color;
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
			System.out.println("\t3 - get flower list");
			System.out.println("\tc - exit");
			switch (key = scanner.nextLine()) {
			case "1":
				System.out.println(TextFormatter.formatBoxList(flowerComposition.getBoxList()));
				System.out.println("Do you wish to exit from program[Y/N]?");
				key = scanner.nextLine();
				if (key.equals("Y")) {
					scanner.close();
				}
				break;
			case "2":
				System.out.println("Input box type");
				type = scanner.nextLine();
				flowerComposition.addBox(new Box(type));
				System.out.println("Do you wish to exit from program[Y/N]?");
				key = scanner.nextLine();
				if (key.equals("Y")) {
					scanner.close();
				}
				break;
			case "3":
				System.out.println("Input name of flower");
				name = scanner.nextLine();
				scanner.nextLine();
				System.out.println("Input color of flower");
				color = scanner.nextLine();
				flowerComposition.getBoxByType(name).addFlower(new Flower(name, color));;
				scanner.nextLine();
				System.out.println("Do you wish to exit from program[Y/N]?");
				key = scanner.nextLine();
				if (key.equals("Y")) {
					scanner.close();
				}
				break;
			case "4":
				System.out.println(TextFormatter.formatFlowerList(flowerComposition.getBoxByType(name).getFlowerList()));
				System.out.println("Do you wish to exit from program[Y/N]?");
				key = scanner.nextLine();
				if (key.equals("Y")) {
					scanner.close();
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
				System.out.println("Unsupported key was pressed");
				System.out.println("Do you wish to exit from program[Y/N]?");
				key = scanner.nextLine();
				if (key.equals("Y")) {
					scanner.close();
				}
				break;
			}
		}
	}

}
