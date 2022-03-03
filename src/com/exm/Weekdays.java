package com.exm;

public class Weekdays{
public void sunday(){
System.out.println("Today is sunday");
}
public void monday(){
System.out.println("Today is monday");
}
public void tuesday(){
System.out.println("Today is tuesday");
}
public void wednesday(){

System.out.println("Today is wednesday");
}
public void thursday(){
System.out.println("Today is thursday");
}
public void friday(){
System.out.println("Today is friday");
}
public static void saturday(){
System.out.println("Today is saturday");
}

public int sum(int a,int b, int c){
int result = a+b+c;
return result;
}
public static void main(String[] args){
 Weekdays obj = new Weekdays();
obj.monday();
obj.tuesday();
obj.wednesday();
obj.thursday();
obj.friday();
saturday();

int result = obj.sum(4,6,5);
System.out.println("result is "+result);
}
}