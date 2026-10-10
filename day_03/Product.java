package day_03;

public class Product {

	public static void main(String[] args) {

		Product1 obj = new Product1("iphone ", 1555, "hello", 2);
		System.out.println("Product:" + obj.name);
		System.out.println("Prize:" + obj.prize);
		System.out.println("Describe:" + obj.describe);
		System.out.println("Quantity:" + obj.quantity);

	}

}
