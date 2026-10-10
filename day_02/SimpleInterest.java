package day_02;

import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number:-");
		
		double p=sc.nextDouble();
		System.out.print("Enter b number:-");
		double r=sc.nextDouble();
		System.out.print("Enter c number:-");
		double t=sc.nextDouble();
		
		System.out.println("SI=" +p*r*t/100);
		sc.close();
	}

}
