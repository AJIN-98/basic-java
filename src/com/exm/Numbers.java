package com.exm;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number :");
		int number = sc.nextInt();
		if (!(number > 100)) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}

	}

}
