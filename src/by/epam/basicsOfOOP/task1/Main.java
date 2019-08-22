package by.epam.basicsOfOOP.task1;

/* Создать объект класса Текстовый файл, используя классы Файл, Директория.
   Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить. */

public class Main {

	public static void main(String[] args) {
		Directory directory = new Directory("E:/ProgramFiles/test");
		directory.addFile(new File("Lern.py"));
		directory.addFile(new TextFile("Lerk.txt"));
		directory.getFileByName("Lern.py").add("ABCD");
		directory.getFileByName("Lerk.txt").add("WOW");
		System.out.println(directory.getFileByName("Lern.py").output());
		System.out.println(directory.getFileByName("Lerk.txt").output());
		directory.createFile("Lerk.txt");
		
	}
}
