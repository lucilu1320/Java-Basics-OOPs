package javaBasics;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the marks of the Student: ");
		int marks = in.nextInt();
		if(marks >= 80 && marks <= 100)
			System.out.println("Grade A: "+marks);
		else if(marks >= 60 && marks < 80)
			System.out.println("Grade B: "+marks);
		else if(marks >= 40 && marks < 60)
			System.out.println("Grade C:"+marks);
		else
			System.out.println("Fail! "+marks);
		
		
		
	}

}
