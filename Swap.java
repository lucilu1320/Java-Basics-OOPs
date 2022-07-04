package javaBasics;
import java.util.*;
public class Swap {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);

System.out.println("Enter the 1st Number: ");
int First_Number = in.nextInt();
System.out.println("Enter the 2nd Number: ");
int Second_Number = in.nextInt();
int temp = 0;
temp = First_Number;
First_Number = Second_Number;
Second_Number = temp;
System.out.println("First Number: "+First_Number);
System.out.println("Second Number: "+Second_Number);

	}

}
