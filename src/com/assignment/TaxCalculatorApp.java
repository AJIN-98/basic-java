package com.assignment;

import java.util.Scanner;

public class TaxCalculatorApp {

	private int pan;
	private String name;
	private Double taxIncome = 0.0;
	private Double tax = 0.0;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the PAN number :");
		this.pan = sc.nextInt();
		System.out.print("Enter the name :");
		this.name = sc.next();
		System.out.print("Enter the Tax income :");
		this.taxIncome = sc.nextDouble();
		sc.close();
		cal();
	}

	public void cal() {
		if (taxIncome <= 250000) {
			tax = 0.0;
		}
		if (taxIncome >= 250001 && taxIncome <= 500000) {
			tax = (taxIncome * 10) / 100;
		}
		if (taxIncome >= 500001 && taxIncome <= 1000000) {
			tax = ((taxIncome * 20) / 100) + 30000;
		}
		if (taxIncome > 1000000) {
			tax = ((taxIncome * 30) / 100) + 50000;
		}
		display();
	}

	public void display() {
		System.out.println("PAN Number    Name    Tax-Income    Tax");
		System.out.println(pan + "       " + name + "        " + taxIncome + "     " + tax);
	}

	public static void main(String[] args) {
		TaxCalculatorApp obj = new TaxCalculatorApp();
		obj.input();
	}

}
