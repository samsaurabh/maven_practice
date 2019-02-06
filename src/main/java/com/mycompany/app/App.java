package com.mycompany.app;

import java.util.Scanner;

 public class App
 {
	public static void main(String args[])
	{
		float a, b, res;
		char choice = args[0].charAt(0);
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit\n");
		System.out.println("Enter Your Choice : ");
		System.out.println("Your Choice is: " + choice);

		a = Float.parseFloat(args[1]);
		b = Float.parseFloat(args[2]);

		System.out.println("1st Number: " + a);
		System.out.println("2nd Number: " + b);

		switch(choice)
		{
			case '1' :	res = a + b;
						System.out.print("Result = " + res);
						break;

			case '2' :	res = a - b;
						System.out.print("Result = " + res);
						break;

			case '3' :	res = a * b;
						System.out.print("Result = " + res);
						break;

			case '4' :	res = a / b;
						System.out.print("Result = " + res);
						break;

			case '5' :	System.exit(0);
						break;

	      	default  :	System.out.println("Wrong Choice!!!");
						break;
		}
			
		System.out.println("\n---------------------------------------");
	}
}

