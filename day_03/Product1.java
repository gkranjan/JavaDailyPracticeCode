package day_03;

public class Product1 {

	String name;
	int prize;
	String describe;
	int quantity;

	Product1(String name, int prize, String describe, int quantity) {

		this.name = name;
		this.prize = prize;
		this.describe = describe;
		this.quantity = quantity;
	}

	Product1(String name, String describe) {

		this.name = name;
		this.describe = describe;

	}

	Product1() {

	}

}
