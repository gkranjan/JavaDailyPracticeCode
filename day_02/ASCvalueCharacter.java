package day_02;

import java.util.Scanner;

public class ASCvalueCharacter {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String and get int value:-");
		char ch=sc.next().charAt(0);
		
		System.out.println("ASCII= " +(int)ch);
		sc.close();
		
	}

}
