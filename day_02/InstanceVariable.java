package day_02;

public class InstanceVariable {

	int rollNo;
	String name;

	void display() {
		System.out.println("Roll No:" + rollNo);
		System.out.println("Name:" + name);
	}

	public static void main(String[] args) {

		InstanceVariable obj = new InstanceVariable();
		obj.rollNo = 101;
		obj.name = "Gautam Kumar Ranjan";
		obj.display();
	}

}
