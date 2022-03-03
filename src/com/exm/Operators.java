package com.exm;

public class Operators {

	String userName = "FUNNYGAMER";
	String password = "12345";
	String phone ="1234556";
	String email ="lakshmi@gmail.com";

	/* --------------Arithmetic operators---------------------- */
	public void addition(int a, int b) {
		System.out.println("sum is :" + (a + b));
	}

	public void subtraction(int a, int b) {
		System.out.println("difference is :" + (a - b));
	}

	public void division(int a, int b) {
		System.out.println("Quotient is :" + (a / b));
	}

	public void multiplication(int a, int b) {
		System.out.println("product is :" + (a * b));
	}

	/* -----------increment and decrement----------------------- */
	public void increment(int a) {
		a++;
		System.out.println("after increment :"+a);
	}

	public void decrement(int a) {
		a--;
		System.out.println("after decrement :"+a);
	}

	/*------------------relational operator --------------------*/
	public void greaterThan(int a, int b) {
		if (a > b) {
			System.out.println(a + " is greater");
		} else {
			System.out.println(b + " is greater");
		}
	}

	public void equalTo(int a, int b) {
		if (a == b) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}

	public void greaterThanOrEqual(int a, int b) {
		if (a >= b) {
			System.out.println(a + " is greater or equal");
		} else {
			System.out.println(b + " is greater or equal");
		}
	}

	public void notEqualTo(int a, int b) {
		if (a != b) {
			System.out.println("not equal");
		} else {
			System.out.println("equal");
		}
	}

	/* --------------logical operator------------------- */

	public void and_Op(String a, String b) {
		
		if (a == this.userName && b == this.password) {
			System.out.println("logged in.......");
		} else {
			System.out.println("incorrect.........");
		}
	}
	
	public void or_Op(String a, String b) {
		
		if (a == this.phone || b == this.email) {
			System.out.println("saved");
			
			int number =50;
			number = number+1;
			number+=1;
			
			
			
			
		} else {
			System.out.println("enter phonenumber or email");
		}
	}
	
	
public void or_Op(int x) {
		
		if (x>0 && x<10) {
			System.out.println("between 0 and 10");
		} else {
			System.out.println("false.....");
		}
	}
	// 0,1,2,3,4,6,7,8,9,10

	public static void main(String[] args) {
		Operators op = new Operators();
		op.addition(6, 7);
		op.subtraction(4, 5);
		op.multiplication(2, 3);
		op.division(6, 3);
		op.increment(4);
		op.decrement(4);
		op.greaterThan(10, 20);
		op.equalTo(10, 10);
		op.notEqualTo(20, 30);
		op.greaterThanOrEqual(20, 20);
		op.and_Op("zxcvbnm", "12345");
		op.or_Op("12344444", "lakshmi@gmail.com");

	}

}
