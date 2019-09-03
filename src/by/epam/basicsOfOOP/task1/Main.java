package by.epam.basicsOfOOP.task1;

/* Создать объект класса Текстовый файл, используя классы Файл, Директория.
   Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить. */

public class Main {

	public static void main(String[] args) {
		Directory directory = new Directory("E:/ProgramFiles/test");
		directory.addFile(new File("Lern.py"));
		directory.addFile(new TextFile("Lerk.txt"));
		directory.createFile("Doc.txt");
		directory.getFileByName("Lern.py").addContent("ABCD");
		directory.getFileByName("Lerk.txt").addContent("WOW");
		directory.getFileByName("Doc.txt").addContent("gkr");
		directory.getFileByName("Lerk.txt").addContent("sup");
		System.out.println(directory.getFileByName("Lern.py").output());
		System.out.println(directory.getFileByName("Lerk.txt").output());
		System.out.println(directory.getFileByName("Doc.txt").output());
		
	}
}
