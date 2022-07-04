package javaBasics;

import java.util.Scanner;

public class ProductOfTwoNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double product;
		System.out.println("Enter the First number: ");
		double number_one = in.nextDouble();
		System.out.println("Enter the Second Number: ");
		double number_two = in.nextDouble();
		product = (number_one * number_two);
		System.out.println("The Product of Two Numbers are: "+product);
		
	}

}
