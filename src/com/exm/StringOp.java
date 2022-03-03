package com.exm;

import java.io.BufferedReader;

class StringOp
{
public static void lowercase(String string)
{
System.out.println(string.toLowerCase());
}

public static void  upperCase(String string)
{
System.out.println(string.toUpperCase());
}

public static void length(String string)
{
System.out.println(string.length());
}

public static void trimming(String string)
{
System.out.println( string.trim() );
}

//public static void value(String string)
//{
//System.out.println(valueOf(string));
//}

public static void equal(String string, String string1)
{
boolean a = string.equals(string1);
if (a)
{
System.out.println("It is equal");
}
else
{
System.out.println("it is not equal");
}
}
public static void main(String args[])
{

	
StringBuffer buff = new StringBuffer(30);

System.out.println(buff.capacity());
buff.append("AJIN");
System.out.println(buff.toString());
buff.insert(3, "AJIN");
System.out.println(buff.toString());
buff.setCharAt(3,'k');
System.out.println(buff.toString());
buff.delete(0, 4);
System.out.println(buff.toString());
buff.setLength(40);
System.out.println(buff.capacity());
buff.reverse();
System.out.println(buff.toString());
}
}




