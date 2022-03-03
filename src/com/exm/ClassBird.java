package com.exm;

public class ClassBird {

	public void fly() {
		System.out.println("i can fly !!");
	}

	public void color(String colorr) {
		System.out.println("my color is :" + colorr);
	}

	public void eggs(int num) {
		System.out.println("eggs :" + num);
	}

	public static void main(String[] args) {

		ClassBird parrot = new ClassBird();

		parrot.fly();
		parrot.color("green");
		parrot.eggs(6);

		ClassBird crow = new ClassBird();

		crow.fly();
		crow.color("black");
		crow.eggs(4);
	}

}
