package com.thisSuper;

public class ThisConstructorLevel 
{

	ThisConstructorLevel()
	{
		this(3);
		System.out.println("default constructor");
	}
	ThisConstructorLevel(int a)
	{
		this(3,3);
		System.out.println("single parameter constructor "+a);

	}
	ThisConstructorLevel(int a,int b)
	{
		this("chidam",22,33);
		System.out.println("two parameter constructor"+a+" "+b);
	}
	ThisConstructorLevel(String s,int i,int b)
	{
		System.out.println("three parameter constructor "+s+" "+i+" "+b);
	}
	
}
