package day_05;

class Student {
	
	String name;
	int age;
	
	void display()
	{
		System.out.println(name+ " " +age);
	}
}

	public class Program1
	{
		public static void main(String[] args) {
			Student s= new Student();
			s.name="Gautam";
			s.age=22;
			s.display();
		}
	}
