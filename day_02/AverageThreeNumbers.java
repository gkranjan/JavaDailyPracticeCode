package day_02;

import java.util.Scanner;

public class AverageThreeNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 3 number step by step:-");
		double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
		
		System.out.println("Average =" +(a+b+c)/3);
		sc.close();
	}

}
