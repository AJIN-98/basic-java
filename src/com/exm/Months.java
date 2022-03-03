package com.exm;

public class Months {
	public Months(String getval) {
		System.out.println("my name is " + getval);
	}

	public void january() {
		System.out.println("This month is Jamuary");
	}

	public void february() {
		System.out.println("This month is february");
	}

	public void birthDay(String myName) {
		System.out.println("hi " + myName + " happy birthday");
	}

	public static void main(String[] args) {
		Months obj; // object as an instance

		obj = new Months("bla");
		obj.january();
		obj.february();
		obj.birthDay("Lakshmiaknth");
	}
}
