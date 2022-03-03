package com.exm;

public class ScopeVisibility {

	static int babu = 100;

	public static void sum() {
		int a = 5;
		int b = 6;
		System.out.println(babu);
		System.out.println(a+b);
	}

	public static void demo() {
		System.out.println(babu);
	}

	public static void main(String[] args) {

		sum();
		demo();

	}

}
