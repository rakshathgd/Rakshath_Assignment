package corejava.assignments.datastructure;


public class ArmstrongWithinRange {

	public static void main(String[] args) {
	for (int i=100;i<=999;i++)
	{
		
		int t=i,n=i;
		int total=0;
		do {
		int d=n%10;
		
		total=d*d*d+total;
		n=n/10;
		}while(n!=0);

		if(t==total)
			System.out.println(total);	
	}
	}

}
