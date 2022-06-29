package corejava.assignments.exception;

import java.util.Scanner;

public class ArithmeticExeption{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("n1");
		int n1=sc.nextInt();
		System.out.println("n2");
		int n2=sc.nextInt();
		try
		{
			System.out.println(n1/n2);
		}catch(ArithmeticException e)
		{
			System.out.println("Please enter n2 greater than zero");
		}

	}

}
