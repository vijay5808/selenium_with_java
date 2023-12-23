package Assignment;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :- ");

		int num = sc.nextInt();
		int reverse=0;
		int rem;
		for( ;num != 0;num=num/10)
		{
			rem= num%10;

			reverse = reverse * 10 + rem;

		}

		System.out.println("Reverse number = " +reverse);
	}


}


