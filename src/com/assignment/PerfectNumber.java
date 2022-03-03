package com.assignment;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int number = sc.nextInt();
		sc.close();

		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == number) {
			System.out.println("it's a perfect number");
		} else {
			System.out.println("it's Not a perfect number");
		}

	}

}
