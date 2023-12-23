package Assignment;

import java.util.Scanner;

public class FactorOfNumber {
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the Number for which you want Factors");		
		int num = userInput.nextInt();

		System.out.println("Factors of Number "+num+" are..");
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}

	}

}


