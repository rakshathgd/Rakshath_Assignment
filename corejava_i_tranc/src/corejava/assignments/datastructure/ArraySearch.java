package corejava.assignments.datastructure;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		int ar[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,42};
		Scanner sc = new Scanner(System.in);
		int K=sc.nextInt();
		int c=0;
		for(int i=0;i<ar.length;i++)
		{
			if(K==ar[i]) {
				c++;
			}
			
			}
		if(c>0)
		{
			System.out.println("Number is present");
		
		}
		else
		{
			System.out.println("Number is Not present");
		}
		
	}

}
