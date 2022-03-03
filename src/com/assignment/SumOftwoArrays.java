package com.assignment;

import java.util.Scanner;

public class SumOftwoArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("array size :");
		int size = sc.nextInt();
		int array1[] = new int[size];
		int array2[] = new int[size];
		System.out.print("Enter the elements of array 1: ");

		for (int i = 0; i < size; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.print("Enter the elements of array 2: ");

		for (int i = 0; i < size; i++) {
			array2[i] = sc.nextInt();
			array1[i] = array1[i]+array2[i];
		}
		sc.close();
		System.out.println("Resultant array : "); 
		for (int i = 0; i < size; i++) {
			System.out.print(array1[i]+" ");
		}
		
	}

}
