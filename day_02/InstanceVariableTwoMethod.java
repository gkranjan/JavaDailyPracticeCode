package day_02;

public class InstanceVariableTwoMethod {

	int number;

	void display() {

		number = 50;

	}

	void displayNumber() {

		System.out.println("Number=" + number);

	}

	public static void main(String[] args) {

		InstanceVariableTwoMethod obj = new InstanceVariableTwoMethod();
		obj.display();
		obj.displayNumber();

	}

}
