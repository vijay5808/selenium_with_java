package Assignment;

import java.util.Scanner;

public class Infinityloop {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :- ");

		int num = sc.nextInt();

		/*
		// infinite loop using for loop
		for(;;)
		{
			System.out.println("For loop goes into Infinite loop.. ");
		}

		 */


		// infinite loop using do-while loop
		/*
		  do 
		  { 
			  System.out.println("Do-While loop goes into Infinite loop.. "); 
		  } 
		  while (num < num+1);
		 */

		// infinite loop using while loop

		while (num < num+1)
		{
			System.out.println("While loop goes into Infinite loop.. "); }


	}

}