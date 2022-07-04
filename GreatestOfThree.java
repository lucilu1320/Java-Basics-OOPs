package javaBasics;

import java.util.Scanner;

public class GreatestOfThree 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int number_one = in.nextInt();
		System.out.println("Enter the Second Number: ");
		int number_two = in.nextInt();
		System.out.println("Enter the Third Number: ");
		int number_three = in.nextInt();
		if(number_one > number_two && number_one > number_three) 
		System.out.println("Greatest Number is Number_one: "+number_one);
			else if(number_two > number_one && number_two > number_three) 
			System.out.println("Greatest Number is Number_two: "+number_two);
		else 
		{
		System.out.println("Greatest Number is Number_three: "+number_three);
		
	}
	}
	}
	



