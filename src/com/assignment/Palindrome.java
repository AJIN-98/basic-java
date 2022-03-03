package com.assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int number = sc.nextInt();
		sc.close();
		int temp = number;
		int rem;
		int reverse = 0;
		while (number > 0) {
			
			rem = number % 10;
			reverse = reverse * 10 + rem;
			number = number / 10;

		}
		if (reverse == temp) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

}
