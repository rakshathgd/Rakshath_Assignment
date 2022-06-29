package corejava.assignments.datastructure;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ctc=sc.nextLong();
		if(ctc>=0&&ctc<=180000)
			System.out.println("nil");
		else if(ctc>=180001&&ctc<=300000)
			System.out.println("Tax="+ctc*0.1);
		else if(ctc>=300001&&ctc<=500000)
			System.out.println("Tax="+ctc*0.2);
		else if(ctc>=500001&&ctc<=1000000)
				System.out.println("Tax="+ctc*0.3);

	}

}
