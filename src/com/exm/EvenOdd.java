package com.exm;

import java.util.Scanner;

public class EvenOdd {
	public void check(int number) {

		if (number % 2 == 0) {
			System.out.println("The number " + number + " is even");
		} else {
			System.out.println("The number " + number + " is odd");
		}
	}

	public static void main(String[] args) {
		EvenOdd obj = new EvenOdd();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number : ");
		int input = sc.nextInt();
		sc.close();
		obj.check(input);
	}
}