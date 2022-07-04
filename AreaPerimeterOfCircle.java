package javaBasics;
import java.util.*;
public class AreaPerimeterOfCircle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double perimeter;
		double pi = 3.14;
		double area;
		System.out.println("Enter the Radius of Circle: ");
		double radius = in.nextDouble();
		area = (pi * radius * radius);
	    System.out.println("The Area of Circle is: "+area);
	    perimeter = (2 * pi * radius) ;
	    System.out.println("The Perimeter of the Circle is: "+perimeter);
	}

}
