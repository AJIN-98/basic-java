package com.assignment;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int flag = 0;
		int numbers[] = {1,2,3,4,6,8};
		
		System.out.println("Enter the key to search : ");
		int key = sc.nextInt(); //6
		sc.close();
		for (int i = 0; i < 6; i++) {

			if (numbers[i] == key) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Item found !");
		} else {
			System.out.println("Item " + key + " Not found !");
		}

	}

}
