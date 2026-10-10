package day_02;

public class TwoObjectTwoValues {

	String name;

	void display() {
		System.out.println("Name= " + name);

	}

	public static void main(String[] args) {

		TwoObjectTwoValues obj1 = new TwoObjectTwoValues();
		TwoObjectTwoValues obj2 = new TwoObjectTwoValues();

		obj1.name = "Gautam";
		obj2.name = "Kumar Ranjan";
		obj1.display();
		obj2.display();
	}

}
