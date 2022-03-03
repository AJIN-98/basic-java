package com.exm;

import java.util.Scanner;

public class Mark {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int marks[] = new int[5];

		System.out.println("array elements : ");
		for (int i = 0; i <= 4; i++) {	// Reading elements
			marks[i] = sc.nextInt();
		}

		System.out.print("array : [");
		for (int i = 0; i <= 4; i++) {	// Printing array elements
			System.out.print(marks[i] + " ");
		}
		System.out.print("]");

	}

}
