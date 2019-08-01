package by.epam.basicsOfOOP.task2;

import by.epam.basicsOfOOP.task2.Payment.PaymentsGoods;

/* Создать класс Payment с внутренним классом, с помощью объектов
   которого можно сформировать покупку из нескольких товаров. */

public class Main {

	public static void main(String[] args) {
		PaymentsGoods paymentGoods = new PaymentsGoods();
		paymentGoods.addProduct(new Product("Toy", 30, "toy for playing"));
		System.out.println(paymentGoods.getProductByName("Toy").getDescription());
		paymentGoods.removeProduct(paymentGoods.getProductByName("Toy"));
		
	}

}
