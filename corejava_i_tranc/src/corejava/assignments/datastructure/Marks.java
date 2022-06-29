package corejava.assignments.datastructure;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int K=sc.nextInt();
		int E=sc.nextInt();
		int M=sc.nextInt();
		if(K>=60&&E>=60&&M>=60)
		{
			System.out.println("Passed");
		}
		else if(K>=60&&E>=60||K>=60&&M>=60||E>=60&&M>=60)
		{
			System.out.println("Promoted");
		}
		else 
		{
			System.out.println("Failed");
		}
		
	}

}
