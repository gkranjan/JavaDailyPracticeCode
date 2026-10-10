package day_02;

import java.util.Scanner;

public class CharacterFromASCII {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a single character get Int:-");
		int code=sc.nextInt();
		
		System.out.println("Character=" +(char)code);
		sc.close();
	}

}
