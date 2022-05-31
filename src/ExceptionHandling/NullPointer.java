package ExceptionHandling;

import java.util.Scanner;
public class NullPointer {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scn.nextInt();
		System.out.println("Enter the number");
		int b = scn.nextInt();
		//int c = scn.nextInt();
	
	try
	{
		int res = a/b;
		System.out.println("res: "+res);
	}
	catch(ArithmeticException e)
	{
		System.out.println("We can't divide a number by zero");
		
	}
	String s =null;
	try
	{
		System.out.println(s.length());
	}
	
	catch(NullPointerException n)
	{
		System.out.println("We can't compare a string value with null");
		
	}
	/*
	 catch(InputMissMatchException i)
	 
	{
		System.out.println("Given input is not the type of variable");
	}
	*/
	
	
	}

}
