package corejava.assignments.datastructure;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int t=n;
		int total=0;//153
		do {
		int d=n%10;
		
		total=d*d*d+total;
		n=n/10;
		}while(n!=0);
		System.out.println(total);
		if(t==total)
			System.out.println("Armstrong  no.");
		else 
			System.out.println("not a Armstrong  no.");
	}

}
