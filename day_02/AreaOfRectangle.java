package day_02;

import java.util.Scanner;

public class AreaOfRectangle {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:-");
		double l=sc.nextDouble();
		System.out.print("Enter b number:-");
		double w=sc.nextDouble();
		
		System.out.println("Area=" +l*w);
		sc.close();
	}

}
