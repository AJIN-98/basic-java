package com.exm;

public class Calculator {

	
public void addition(int a,int b){
System.out.println("sum of number"+(a+b));
}

public void subtraction(int a,int b){
System.out.println("subtract number"+(a-b));
}

public void  multiplication(int a,int b){
System.out.println("multiply the number"+(a*b));
}

public void division(int a,int b){
System.out.println("divide the number"+(a/b));
}

public static void main(String[]args){

   Calculator   obj=          new       Calculator();
 //classname  objectname new operator constructor
   
   
   obj.addition(6,5);
   obj.subtraction(2,3);
   obj.multiplication(3, 5);
   obj.division(10, 2);

}
}