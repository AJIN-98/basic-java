package com.exm;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter number :");
		int number = sc.nextInt();
		sc.close();

		if (number > 0) { // condition 
			System.out.println("positive"); //statement
		} 
		
		else {
			System.out.println("negative"); //statement
		}

	}

}
