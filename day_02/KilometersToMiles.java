package day_02;

import java.util.Scanner;

public class KilometersToMiles {
	
	
	public static void main(String[] args) {
		
		System.out.print("Enter a number:-");
		
		Scanner sc=new Scanner(System.in);
		
		double km=sc.nextDouble();
		System.out.println("Miles=" +km*0.621371);
		sc.close();
		
	}

}
