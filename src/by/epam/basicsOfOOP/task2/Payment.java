package by.epam.basicsOfOOP.task2;

import java.util.ArrayList;

public class Payment {
	private int number;

	public Payment(int number) {
		this.number = number;
	}

	public static class PaymentsGoods {
		ArrayList<Product> productList = new ArrayList<Product>();

		public void addProduct(Product product) {
			if (product != null) {
				productList.add(product);
			}
		}

		public void removeProduct(Product product) {
			if (product != null) {
				productList.remove(product);
			}
		}

		public Product getProductByName(String name) {
			Product product = null;
			if (name != null) {
				for (int i = 0; i < productList.size(); i++) {
					if (productList.get(i).getName().equals(name)) {
						product = productList.get(i);
						break;
					}
				}
			}
			return product;
		}

		public ArrayList<Product> getProductList() {
			return productList;
		}

		public void setProductList(ArrayList<Product> productList) {
			this.productList = productList;
		}

		@Override
		public String toString() {
			return "PaymentsGoods [productList=" + productList + "]";
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
