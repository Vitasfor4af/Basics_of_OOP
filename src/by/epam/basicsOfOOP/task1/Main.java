package by.epam.basicsOfOOP.task1;

/* Создать объект класса Текстовый файл, используя классы Файл, Директория.
   Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить. */

public class Main {

	public static void main(String[] args) {

		Directory directory = new Directory("C:/Program files");
		directory.addFile(File.createFile("new File"));
		directory.addFile(new File("Buka"));
		directory.addFile(new TextFile("Right.txt"));
		directory.getTextFileByName("Right.txt").addContent("OWOWOWOW");
		directory.getTextFileByName("Right.txt").addContent("Omamama");
		System.out.println(directory.getTextFileByName("Right.txt").outputText());
		System.out.println(directory.getFileByName("new File").getFileName());
	}
}
