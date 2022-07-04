package javaBasics;

import java.util.Scanner;

public class InchToMeter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double meter;
		System.out.println("Enter the Value in Inch: ");
		double inch = in.nextDouble();
		meter = (inch * 0.0254);
		System.out.println("The Value Converted to Meters: "+meter);
	}

}
