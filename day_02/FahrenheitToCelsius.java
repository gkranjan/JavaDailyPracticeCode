package day_02;

import java.util.Scanner;

public class FahrenheitToCelsius {
	
	public static void main(String[] args) {
		
		System.out.print("Enter a number:-");
		Scanner sc=new Scanner(System.in);
		
		double f=sc.nextDouble();
		double c=(f-32)*5/9;
		
		System.out.println("C= " +c);
		sc.close();
	}

}
