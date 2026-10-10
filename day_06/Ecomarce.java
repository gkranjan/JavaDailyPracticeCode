package day_06;

import java.util.Scanner;

public class Ecomarce {

	public static void main(String[] args) {
		System.out.println("Welcome to make my Trip Discount Section");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Amount : ");
		int amount = sc.nextInt();
		if (amount < 0) {
			System.out.println("Negative Values");
		} else if (amount <= 5000) {
			System.out.println("No Discount Below 5K");
		} else if (amount > 5000 && amount <= 10000) {
			System.out.println("10% Discount ");
			int dis = amount * 10 / 100;
			if (dis > 1250) {
				amount = amount - 1250;
				System.out.println("Max Discount 1250 execceds ");
				System.out.println("After Discount : " + amount);
			} else {
				amount = amount - dis;
				System.out.println("After Discount : " + amount);
			}
		} else if (amount > 10000) {
			System.out.println("15 % Discount ");
			int dis = amount * 15 / 100;
			if (dis > 1250) {
				amount = amount - 1250;
				System.out.println("Max Discount 1250 execceds ");
				System.out.println("After Discount : " + amount);
			} else {
				amount = amount - dis;
				System.out.println("After Discount : " + amount);
			}
		}
	}

}
