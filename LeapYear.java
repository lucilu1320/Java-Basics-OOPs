package javaBasics;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Year to be Checked: ");
		int year = in.nextInt();
		if((year % 4 == 0 && year % 100 !=0) || year % 400 == 0) 
			System.out.println("It is a Leap Year, Since it has 366 days! "+year);
			else
				System.out.println("It is not a Leap Year, Since it has 365 Days! ");
				

	}
}




